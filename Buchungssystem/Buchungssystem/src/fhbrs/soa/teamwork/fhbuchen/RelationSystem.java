package fhbrs.soa.teamwork.fhbuchen;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * The RelationServive allows you to manipulate and create Relations.
 * 
 * @author Markus
 */
@WebService
public class RelationSystem {
	private List<Bill> trackedBills;
	private List<Invoice> trackedInvoices;
	private List<Relation> relations;
	private EntityManager em;
	
	public RelationSystem() {
		trackedBills = new LinkedList<Bill>();
		trackedInvoices = new LinkedList<Invoice>();
		relations = new LinkedList<Relation>();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("localhost");
		em = emf.createEntityManager();
	}
	
	@WebMethod
	public void tracBill(Bill bill) {
		trackedBills.add(bill);
	}
	
	@WebMethod
	public void tracInvoice(Invoice invoice) {
		trackedInvoices.add(invoice);
	}
	
	@WebMethod
	public Relation suggestRelation(Invoice invoice) {
		Relation result;
		result = findRelationForInvoice(invoice.getInvoiceNr());
		
		if (result == null) {
			Bill b = match(invoice);
			
			if (b != null) {
				result = new Relation(b, invoice);
				relations.add(result);
				trackedBills.remove(b);
			}
		}
		
		return result;
	}

	@WebMethod
	public Relation suggestRelation(Bill bill) {
		Relation result;
		result = findRelationForInvoice(bill.getBillNr());
		
		if (result == null) {
			Invoice i = match(bill);
			
			if (i != null) {
				result = new Relation(bill, i);
				relations.add(result);
				trackedInvoices.remove(i);
			}
		}
		
		return result;
	}
	
	private Invoice match(Bill bill) {
		for (Invoice i : trackedInvoices) {
			if (match(bill, i)) {
				return i;
			}
		}
		
		return null;
	}

	private Bill match(Invoice invoice) {
		for (Bill b : trackedBills) {
			if (match(b, invoice)) {
				return b;
			}
		}
		
		return null;
	}

	@WebMethod
	public Relation findRelationForInvoice(int invoiceNr) {
		for (Relation r : relations) {
			if (r.getInvoice().getInvoiceNr() == invoiceNr) {
				return r;
			}
		}
		
		return null;
	}
	
	@WebMethod
	public Relation findRelationForBill(int billNr) {
		for (Relation r : relations) {
			if (r.getBill().getBillNr() == billNr) {
				return r;
			}
		}
		
		return null;
	}

	/**
	 * Checks if the bill and the invoice are for the same delivery.
	 * 
	 * @param bill The bill to check.
	 * @param invoice The invoice to check.
	 * @return
	 */
	private boolean match(Bill bill, Invoice invoice) {
		return false;
	}
	
	/**
	 * Lists all relations saved in the database.
	 * 
	 * @return The list of relations.
	 */
	@WebMethod
	public List<Relation> listAllRelations() {
		List<Relation> result = new ArrayList<Relation>();
		//TODO receive the list of relations from the database
		return result;
	}

	/**
	 * Lists all relations of a given status.
	 * 
	 * @param user The user that want s to receive the list.
	 * @param status The status the relations should have.
	 * @return The list of relations.
	 */
	@WebMethod
	public Relation[] listRelations(String user, int status) {
		List<Relation> result = new ArrayList<Relation>();
		for (Relation r : relations) {
			if (r.getStatus() == status) {
				result.add(r);
			}
		}
		
		return result.toArray(new Relation[0]);
	}

	/**
	 * Lists all relations saved in the database.
	 * 
	 * @param user The user that want s to receive the list.
	 * @return The list of relations.
	 */
	@WebMethod
	public Invoice[] listInvoicesWithoutRelation() {
		return trackedInvoices.toArray(new Invoice[0]);
	}

	/**
	 * Lists all relations saved in the database.
	 * 
	 * @param user The user that want s to receive the list.
	 * @return The list of relations.
	 */
	@WebMethod
	public Bill[] listBillsWithoutRelation() {
		return trackedBills.toArray(new Bill[0]);
	}

	/**
	 * Creates a new relation between a bill and an invoice.
	 * 
	 * @param bill The bill to add to the relation.
	 * @param invoice The invoice to assign to the relation.
	 * @return The created relation.
	 */
	@WebMethod
	public Relation createRelation(Bill bill, Invoice invoice) {
		Relation rel = new Relation(bill, invoice);
		relations.add(rel);
		return rel;
	}
	
	/**
	 * Updates the given relation to the new values.
	 * 
	 * @param user The user that want s to receive the list.
	 * @param rel The relation to update.
	 */
	@WebMethod
	public void updateRelation(String user, Relation rel) {
		for (Relation r : relations) {
			if (r.relationId == rel.relationId) {
				relations.remove(r);
				relations.add(rel);
				return;
			}
		}
	}
	
	/**
	 * Marks the given relation as checked or double checked by the given user.
	 * 
	 * @param user The name of the user that checked the relation. 
	 * @param rel The relation that was checked.
	 */
	@WebMethod
	public void checked(String user, Relation rel) {
		rel.check(user);
		updateRelation(user, rel);
	}
}

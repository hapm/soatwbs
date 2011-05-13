package fhbrs.soa.teamwork.fhbuchen;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * The RelationServive allows you to manipulate and create Relations.
 * 
 * @author Markus
 */
@WebService
public class RelationService {
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
	 * Lists all relations saved in the database.
	 * 
	 * @param user The user that want s to receive the list.
	 * @return The list of relations.
	 */
	@WebMethod
	public List<Relation> listUncheckedRelations(String user) {
		List<Relation> result = new ArrayList<Relation>();
		//TODO receive the list of relations from the database
		return result;
	}

	/**
	 * Lists all relations saved in the database.
	 * 
	 * @return The list of relations.
	 */
	@WebMethod
	public List<Relation> listCheckedRelations(String user) {
		List<Relation> result = new ArrayList<Relation>();
		//TODO receive the list of relations from the database
		return result;
	}

	/**
	 * Lists all relations saved in the database.
	 * 
	 * @param user The user that want s to receive the list.
	 * @return The list of relations.
	 */
	@WebMethod
	public List<Relation> listInvoicesWithoutRelation(String user) {
		List<Relation> result = new ArrayList<Relation>();
		//TODO receive the invoices from the invoice service.
		return result;
	}

	/**
	 * Lists all relations saved in the database.
	 * 
	 * @param user The user that want s to receive the list.
	 * @return The list of relations.
	 */
	@WebMethod
	public List<Relation> listBillsWithoutRelation(String user) {
		List<Relation> result = new ArrayList<Relation>();
		//TODO receive the bills from the Bill service.
		return result;
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
		//TODO save the new relation to the database
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
		//TODO implement update
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

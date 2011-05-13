package fhbrs.soa.teamwork.fhbuchen;

import java.util.ArrayList;
import java.util.List;

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
	public List<Relation> listAllRelations() {
		List<Relation> result = new ArrayList<Relation>();
		return result;
	}

	/**
	 * Lists all relations saved in the database.
	 * 
	 * @return The list of relations.
	 */
	public List<Relation> listUncheckedRelations() {
		List<Relation> result = new ArrayList<Relation>();
		return result;
	}

	/**
	 * Lists all relations saved in the database.
	 * 
	 * @return The list of relations.
	 */
	public List<Relation> listCheckedRelations() {
		List<Relation> result = new ArrayList<Relation>();
		return result;
	}

	/**
	 * Lists all relations saved in the database.
	 * 
	 * @return The list of relations.
	 */
	public List<Relation> listInvoicesWithoutRelation() {
		List<Relation> result = new ArrayList<Relation>();
		return result;
	}

	/**
	 * Lists all relations saved in the database.
	 * 
	 * @return The list of relations.
	 */
	public List<Relation> listBillsWithoutRelation() {
		List<Relation> result = new ArrayList<Relation>();
		return result;
	}

	/**
	 * Creates a new relation between a bill and an invoice.
	 * 
	 * @param bill The bill to add to the relation.
	 * @param invoice The invoice to assign to the relation.
	 * @return The created relation.
	 */
	public Relation createRelation(Bill bill, Invoice invoice) {
		Relation rel = new Relation(bill, invoice);
		return rel;
	}
	
	/**
	 * Marks the given relation as checked or double checked by the given user.
	 * 
	 * @param user The name of the user that checked the relation. 
	 * @param rel The relation that was checked.
	 */
	public void checked(String user, Relation rel) {
	}
}

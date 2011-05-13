package fhbrs.soa.teamwork.fhbuchen;

import java.util.Date;

/**
 * Describes a Relation between a Bill and an Invoice.
 * 
 * @author Markus
 */
public class Relation {
	/**
	 * Saves the bill instance.
	 */
	private Bill bill;
	
	/**
	 * Saves the invoice instance.
	 */
	private Invoice invoice;
	
	/**
	 * Saves the status of the relation.
	 */
	private RelationStatus status;
	
	/**
	 * Saves the creator of the relation.
	 */
	private String creator;
	
	/**
	 * Saves the user, who doublechecked the relation.
	 */
	private String doubleChecker;
	
	/**
	 * Saves the time, this relation was last changed.
	 */
	public Date timestamp;

	/**
	 * Initializes a new instance of the Relation class.
	 * 
	 * @param bill The bill assigned to this relation.
	 * @param invoice The invoice assigned to this relation.
	 */
	public Relation(Bill bill, Invoice invoice) {
		this.setBill(bill);
		this.setInvoice(invoice);
	}

	/**
	 * Assigns the given bill in this relation.
	 * 
	 * @param bill The bill to assign.
	 */
	public void setBill(Bill bill) {
		this.bill = bill;
	}

	/**
	 * Gets the bill assigned to this relation.
	 * 
	 * @return The assigned bill.
	 */
	public Bill getBill() {
		return bill;
	}

	/**
	 * Assigns the given invoice to the relation.
	 * 
	 * @param invoice The invoice to assign.
	 */
	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

	/**
	 * Gets the invoice assigned to this relation.
	 * 
	 * @return The assigned invoice.
	 */
	public Invoice getInvoice() {
		return invoice;
	}

	public void setStatus(RelationStatus status) {
		this.status = status;
	}

	public RelationStatus getStatus() {
		return status;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getCreator() {
		return creator;
	}

	public void setDoubleChecker(String doubleChecker) {
		this.doubleChecker = doubleChecker;
	}

	public String getDoubleChecker() {
		return doubleChecker;
	}
}

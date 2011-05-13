package fhbrs.soa.teamwork.fhbuchen;

import java.util.Date;

import javax.persistence.Entity;

/**
 * Describes a Relation between a Bill and an Invoice.
 * 
 * @author Markus
 */
@Entity
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
	private Date timestamp;

	/**
	 * Initializes a new instance of the Relation class.
	 * 
	 * @param bill The bill assigned to this relation.
	 * @param invoice The invoice assigned to this relation.
	 */
	public Relation(Bill bill, Invoice invoice) {
		this.bill = bill;
		this.invoice = invoice;
		this.timestamp = new Date();
		this.status = RelationStatus.Unchecked;
	}
	
	/**
	 * Initializes a new instance of the Relation class.
	 * 
	 * @param bill The bill assigned to this relation.
	 * @param invoice The invoice assigned to this relation.
	 */
	public Relation(Bill bill, Invoice invoice, String user) {
		this.bill = bill;
		this.invoice = invoice;
		this.timestamp = new Date();
		this.status = RelationStatus.Checked;
		this.creator = user;
	}

	/**
	 * Assigns the given bill in this relation.
	 * 
	 * @param bill The bill to assign.
	 */
	public void setBill(Bill bill) {
		this.bill = bill;
		this.status = RelationStatus.Checked;
		this.timestamp = new Date();
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
		this.status = RelationStatus.Checked;
		this.timestamp = new Date();
	}

	/**
	 * Gets the invoice assigned to this relation.
	 * 
	 * @return The assigned invoice.
	 */
	public Invoice getInvoice() {
		return invoice;
	}
	
	/**
	 * Gets the status of the relation.
	 * 
	 * @return The relation status.
	 */
	public RelationStatus getStatus() {
		return status;
	}

	/**
	 * Gets the name of the user who created the relation.
	 * 
	 * This is null, if the relation was autogenerated and is set to 
	 * the user who first checks the relation.
	 * 
	 * @return The username.
	 */
	public String getCreator() {
		return creator;
	}

	/**
	 * Gets the name of the user who double checked the relation.
	 * 
	 * @return The username.
	 */
	public String getDoubleChecker() {
		return doubleChecker;
	}

	/**
	 * Gets the last time the relation was updated.
	 * 
	 * @return The date.
	 */
	public Date getTimestamp() {
		return timestamp;
	}
	
	/**
	 * Checks the relation to the next state.
	 * 
	 * @param user The user that performed the check.
	 */
	void check(String user) {
		switch(this.status) {
		case Unchecked:
			this.creator = user;
			this.timestamp = new Date();
			this.status = RelationStatus.Checked;
			break;
			
		case Checked:
			this.doubleChecker = user;
			this.timestamp = new Date();
			this.status = RelationStatus.DoubleChecked;
			break;
		}
	}
}

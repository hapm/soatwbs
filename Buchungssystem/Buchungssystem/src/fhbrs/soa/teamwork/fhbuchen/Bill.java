package fhbrs.soa.teamwork.fhbuchen;

//import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.util.Set;

@Entity
@NamedQuery(
	    name="listAllBills",
	    query="SELECT b FROM Bill b"
	)
public class Bill {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int billId;
	int billNr;
	
	//@Temporal(TemporalType.DATE)
	//Date date;
	String author, reciever;

	BillPosition[] positions;

	public Bill() {

	}

	public Bill(int billNr, /*Date date,*/ String author, String reciever,
			BillPosition[] positions) {
		this.billNr = billNr;
		//this.date = date;
		this.author = author;
		this.reciever = reciever;
		this.positions = positions;
	}

	/**
	 * @return the billId
	 */
	public int getBillId() {
		return billId;
	}

	/**
	 * @param billId the billId to set
	 */
	public void setBillId(int billId) {
		this.billId = billId;
	}

	public String getAuthor() {
		return this.author;
	}

	//public Date getDate() {
	//	return this.date;
	//}

	public int getBillNr() {
		return this.billNr;
	}

	public double getTotalAmount() {
		double amount = 0;
		
		if (this.positions == null)
			return amount;
		for (BillPosition position : this.positions) {
			amount += position.amount;
		}
		return amount;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	//public void setDate(Date date) {
	//	this.date = date;
	//}

	public void setBillNr(int billNr) {
		this.billNr = billNr;
	}

	public BillPosition[] getPositions() {
		return positions;
	}

	public void setPositions(BillPosition[] positions) {
		this.positions = positions;
	}
}

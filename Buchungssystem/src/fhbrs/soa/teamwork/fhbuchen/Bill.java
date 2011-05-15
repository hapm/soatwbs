package fhbrs.soa.teamwork.fhbuchen;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.util.Set;

@Entity
public class Bill {
	@Id
	int billId;
	int billNr;
	
	@Temporal(TemporalType.DATE)
	Date date;
	String author, reciever;

	@OneToMany(cascade = { CascadeType.ALL }, fetch = FetchType.EAGER, mappedBy= "bill")
	Set<BillPosition> positions;
	
	public Bill() {
		
	}

	public Bill(int billNr, Date date, String author, String reciever,
			Set<BillPosition> positions) {
		this.billNr = billNr;
		this.date = date;
		this.author = author;
		this.reciever = reciever;
		this.positions = positions;
	}

	String getAuthor() {
		return this.author;
	}

	Date getDate() {
		return this.date;
	}

	int getBillNr() {
		return this.billNr;
	}

	double getTotalAmount() {
		double amount = 0;
		for (BillPosition position : this.positions) {
			amount += position.amount;
		}
		return amount;
	}

	void setAuthor(String author) {
		this.author = author;
	}

	void setDate(Date date) {
		this.date = date;
	}

	void setBillNr(int billNr) {
		this.billNr = billNr;
	}
}

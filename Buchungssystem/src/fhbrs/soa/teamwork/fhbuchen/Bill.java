package fhbrs.soa.teamwork.fhbuchen;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bill {
	@Id
	int billId;
	int billNr;
	Date date;
	String author, reciever;
	List<BillPosition> positions;
	
	public Bill() {
		
	}

	public Bill(int billNr, Date date, String author, String reciever,
			List<BillPosition> positions) {
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

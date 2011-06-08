package fhbrs.soa.teamwork.fhbuchen;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Invoice {
	@Id
	int invoiceId;
	int invoiceNr;
	String author;
	String reciever;
	
	@Temporal(TemporalType.DATE)
	Date date;
	
	InvoicePosition[] positions;
	
	public Invoice() {
		
	}

	public Invoice(int invoiceNr, Date date, String author, String reciever,
			InvoicePosition[] positions) {
		this.invoiceNr = invoiceNr;
		this.date = date;
		this.author = author;
		this.reciever = reciever;
		this.positions = positions;
	}

	public int getInvoiceNr() {
		return invoiceNr;
	}

	public void setInvoiceNr(int billNr) {
		this.invoiceNr = billNr;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getReciever() {
		return reciever;
	}

	public void setReciever(String reciever) {
		this.reciever = reciever;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public InvoicePosition[] getPositions() {
		return positions;
	}

	public void setPositions(InvoicePosition[] positions) {
		this.positions = positions;
	}
}

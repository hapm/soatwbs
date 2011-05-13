package fhbrs.soa.teamwork.fhbuchen;

import java.util.Date;
import java.util.List;

public class Invoice {
	int invoiceNr;
	String author;
	String reciever;
	Date date;
	List<InvoicePosition> positions;

	public Invoice(int billNr, Date date, String author, String reciever,
			List<InvoicePosition> positions) {
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

	public List<InvoicePosition> getPositions() {
		return positions;
	}

	public void setPositions(List<InvoicePosition> positions) {
		this.positions = positions;
	}
}

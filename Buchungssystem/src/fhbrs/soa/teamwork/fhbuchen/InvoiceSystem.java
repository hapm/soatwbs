package fhbrs.soa.teamwork.fhbuchen;

import java.util.Date;
import java.util.Set;

public class InvoiceSystem {
	Invoice searchInvoice(int invoiceNr){
		return null;
	}
	Set<Invoice> listInvoices(){
		return null;
	}
	void updateInvoice(Invoice i){
		
	}
	Invoice createInvoice(int billNr, Date date, String author, String reciever,
			Set<InvoicePosition> positions){
		Invoice i = new Invoice(billNr, date,author,reciever,positions);
		return i;
	}
}

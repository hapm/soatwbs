package fhbrs.soa.teamwork.fhbuchen;

import java.util.Date;
import java.util.List;

public class InvoiceService {
	Invoice searchInvoice(int invoiceNr){
		return null;
	}
	List<Invoice> listInvoices(){
		return null;
	}
	void updateInvoice(Invoice i){
		
	}
	Invoice createInvoice(int billNr, Date date, String author, String reciever,
			List<InvoicePosition> positions){
		Invoice i = new Invoice(billNr, date,author,reciever,positions);
		return i;
	}
}

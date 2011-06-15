package fhbrs.soa.teamwork.fhbuchen;

import java.util.Date;
import java.util.Set;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class InvoiceSystem {
	public InvoiceSystem() {
		
	}
	
	@WebMethod
	public Invoice searchInvoice(int invoiceNr){
		return null;
	}
	
	@WebMethod
	public Invoice[] listInvoices(){
		return null;
	}
	
	@WebMethod
	public void updateInvoice(Invoice i){
		
	}
	
	@WebMethod
	public Invoice createInvoice(int invoiceNr, Date date, String author, String reciever,
			InvoicePosition[] positions){
		Invoice i = new Invoice(invoiceNr, date,author,reciever,positions);
		return i;
	}
}

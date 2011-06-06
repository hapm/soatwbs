package fhbrs.soa.teamwork.fhbuchen;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class BillSystem {
	@WebMethod
	public Bill searchBill(int billNr) {
		return null;
	}

	@WebMethod
	public Bill[] listBills() {
		Bill test = new Bill(123, new Date(), "Test", "test2", null );
		Bill[] test2 = new Bill[] { test, new Bill(321, new Date(), "Alles", "Klar", null ) };
		return test2;
	}

	@WebMethod
	public Bill createBill(int billNr, Date date, String author, String reciever,
			Set<BillPosition> positions) {
		Bill b = new Bill(billNr, date, author, reciever, positions);
		return b;
	}
	
	@WebMethod
	public void updateBill(Bill b){
		
	}
}

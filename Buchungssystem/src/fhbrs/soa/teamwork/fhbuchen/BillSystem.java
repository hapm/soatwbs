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
	public Set<Bill> listBills() {
		return null;
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

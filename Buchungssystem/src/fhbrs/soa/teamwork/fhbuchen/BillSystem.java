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
		if (positions == null) {
			positions = new HashSet<BillPosition>();
			positions.add(new BillPosition(2.5, 1, "test", 1, 2));
			positions.add(new BillPosition(2.0, 52, "test", 2, 42));
		}
		
		Bill b = new Bill(billNr, date, author, reciever, positions);
		return b;
	}
	
	@WebMethod
	public void updateBill(Bill b){
		
	}
}

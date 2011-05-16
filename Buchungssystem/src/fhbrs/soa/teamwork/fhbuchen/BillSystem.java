package fhbrs.soa.teamwork.fhbuchen;

import java.util.Date;
import java.util.Set;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class BillSystem {
	@WebMethod
	Bill searchBill(int billNr) {
		return null;
	}

	@WebMethod
	Set<Bill> listBills() {
		return null;
	}

	@WebMethod
	Bill createBill(int billNr, Date date, String author, String reciever,
			Set<BillPosition> positions) {
		Bill b = new Bill(billNr, date, author, reciever, positions);
		return b;
	}
	
	@WebMethod
	void updateBill(Bill b){
		
	}
}

package fhbrs.soa.teamwork.fhbuchen;

import java.util.Date;
import java.util.Set;

public class BillSystem {
	Bill searchBill(int billNr) {
		return null;
	}

	Set<Bill> listBills() {
		return null;
	}

	Bill createBill(int billNr, Date date, String author, String reciever,
			Set<BillPosition> positions) {
		Bill b = new Bill(billNr, date, author, reciever, positions);
		return b;
	}
	void updateBill(Bill b){
		
	}
}

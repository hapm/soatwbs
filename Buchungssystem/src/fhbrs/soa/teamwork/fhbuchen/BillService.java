package fhbrs.soa.teamwork.fhbuchen;

import java.util.Date;
import java.util.List;

public class BillService {
	Bill searchBill(int billNr) {
		return null;
	}

	List<Bill> listBills() {
		return null;
	}

	Bill createBill(int billNr, Date date, String author, String reciever,
			List<BillPosition> positions) {
		Bill b = new Bill(billNr, date, author, reciever, positions);
		return b;
	}
	void updateBill(Bill b){
		
	}
}

package fhbrs.soa.teamwork.fhbuchen;

import java.util.ArrayList;
import java.util.Set;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class BillSystem {
	//private EntityManager em;
	private ArrayList<Bill> bills;
	
	public BillSystem() {
		//EntityManagerFactory emf = Persistence.createEntityManagerFactory("Buchungssystem");
		//em = emf.createEntityManager();
		bills = new ArrayList<Bill>();
	} 
	
	@WebMethod
	public Bill searchBill(int billNr) {
		return null;
	}

	@WebMethod
	public Bill[] listBills() {
		//TypedQuery<Bill> q = em.createQuery("SELECT b FROM Bill b", Bill.class);
		return bills.toArray(new Bill[0]);
	}

	@WebMethod
	public Bill createBill(int billNr, /*Date date,*/ String author, String reciever,
			Set<BillPosition> positions) {
		//EntityTransaction tr = em.getTransaction();
		//tr.begin();
		Bill b = new Bill(billNr, /*date,*/ author, reciever, positions.toArray(new BillPosition[0]));
		bills.add(b);
		//em.persist(b);
		//tr.commit();
		return b;
	}
	
	@WebMethod
	public void updateBill(Bill b){
		
	}
}

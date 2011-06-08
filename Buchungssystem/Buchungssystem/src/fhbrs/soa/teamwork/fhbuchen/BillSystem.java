package fhbrs.soa.teamwork.fhbuchen;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

@WebService
public class BillSystem {
	private EntityManager em;
	
	public BillSystem() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Buchungssystem");
		em = emf.createEntityManager();
	} 
	
	@WebMethod
	public Bill searchBill(int billNr) {
		return null;
	}

	@WebMethod
	public Bill[] listBills() {
		TypedQuery<Bill> q = em.createQuery("SELECT b FROM Bill b", Bill.class);
		return q.getResultList().toArray(new Bill[0]);
	}

	@WebMethod
	public Bill createBill(int billNr, Date date, String author, String reciever,
			Set<BillPosition> positions) {
		EntityTransaction tr = em.getTransaction();
		tr.begin();
		Bill b = new Bill(billNr, date, author, reciever, positions.toArray(new BillPosition[0]));
		em.persist(b);
		tr.commit();
		return b;
	}
	
	@WebMethod
	public void updateBill(Bill b){
		
	}
}

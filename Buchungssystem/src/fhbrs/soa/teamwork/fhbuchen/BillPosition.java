package fhbrs.soa.teamwork.fhbuchen;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class BillPosition {
	@Id
	int positionId;
	double amount;
	int quantity;
	String description;
	int posNum;
	int articleNr;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="bill", unique = false)
	Bill bill;
	
	public BillPosition() {
		
	}

	public BillPosition(double amount, int quantity, String description,
			int posNum, int articleNr) {
		this.amount = amount;
		this.quantity = quantity;
		this.description = description;
		this.posNum = posNum;
		this.articleNr = articleNr;
	}

	double getAmount() {
		return this.amount;
	}

	int getQuantity() {
		return this.quantity;
	}

	String getDescription() {
		return this.description;
	}

	int getPosNum() {
		return this.posNum;
	}

	void setPosNum(int num) {
		this.posNum = num;
	}

	public int getArticleNr() {
		return articleNr;
	}

	public void setArticleNr(int articleNr) {
		this.articleNr = articleNr;
	}
}

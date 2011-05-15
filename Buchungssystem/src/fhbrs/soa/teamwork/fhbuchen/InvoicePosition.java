package fhbrs.soa.teamwork.fhbuchen;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class InvoicePosition {
	@Id
	int positionId;
	double weight;
	int quantity;
	String description;
	int posNum;
	
	@ManyToOne
	Invoice invoice;

	public InvoicePosition() {
		
	}
	
	public InvoicePosition(double weight, int quanitity, String description,
			int posNum) {
		this.weight = weight;
		this.quantity = quanitity;
		this.description = description;
		this.posNum = posNum;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPosNum() {
		return posNum;
	}

	public void setPosNum(int posNum) {
		this.posNum = posNum;
	}
}

package fhbrs.soa.teamwork.fhbuchen;

public class BillPosition {
	double amount;
	int quantity;
	String description;
	int posNum;

	public BillPosition(double amount, int quantity, String description,
			int posNum) {
		this.amount = amount;
		this.quantity = quantity;
		this.description = description;
		this.posNum = posNum;
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
}

class Accounting {
	public static double valueOfSupply;
	public static double vatRate;
	public static double expenseRate;
	// accounting�� �����

public void print() {
	System.out.println("Value of supply : "+ valueOfSupply);
	System.out.println("VAT : "+ getVAT() );
	System.out.println("Total : "+ getTotal() );
	System.out.println("Expense : "+ getExpense() );
	System.out.println("Income : "+ getIncome() );
	System.out.println("Dividend1 : "+ getDevidend1() );
	System.out.println("Dividend2 : "+ getDevidend2() );
	System.out.println("Dividend3 : "+ getDevidend3() );
}


	

	public double getDevidend1() {
		return getIncome() * 0.5;
	}
	public double getDevidend2() {
		return getIncome() * 0.3;
	}
	public double getDevidend3() {
		return getIncome() * 0.2;
	}

	public double getIncome() {
		return valueOfSupply - getExpense();
	}

	public double getExpense() {
		return valueOfSupply*expenseRate;
	}

	public double getTotal() {
		return valueOfSupply + getVAT();
	}

	private double getVAT() {
		// method�� ����� �ڵ�
		return valueOfSupply * vatRate;
	}
	
	// method�� ������ �ִ� �� ���� ���� ���������� ���ڴ�
	
	// �ν��Ͻ��� �ϳ��� Ŭ������ �����ؼ� ���� �ٸ� �������� ���� ���� ���� �޼ҵ带 ���� �������� ����� ���̴�.
	
	public static class AccountingClassApp {
		
		public static void main(String[] args) {
			// instance
			
			Accounting a1 = new Accounting();
			a1.valueOfSupply = 10000.0;
			a1.vatRate = 0.1;
			a1.expenseRate = 0.3;
			a1.print();
			
			Accounting a2 = new Accounting();
			a2.valueOfSupply = 20000.0;
			a2.vatRate = 0.05;
			a2.expenseRate = 0.2;
			a2.print();
			
			a1.print();
		}
}
}

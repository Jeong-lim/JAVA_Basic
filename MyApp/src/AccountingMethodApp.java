
public class AccountingMethodApp {
	public static double valueOfSupply;
	public static double vatRate;
	public static double expenseRate;
	public static void main(String[] args) {
		
		valueOfSupply = 10000.0;
		vatRate = 0.1;
		expenseRate = 0.3;
		print();
		
	}

	public static void print() {
		System.out.println("Value of supply : "+ valueOfSupply);
		System.out.println("VAT : "+ getVAT() );
		System.out.println("Total : "+ getTotal() );
		System.out.println("Expense : "+ getExpense() );
		System.out.println("Income : "+ getIncome() );
		System.out.println("Dividend1 : "+ getDevidend1() );
		System.out.println("Dividend1 : "+ getDevidend2() );
		System.out.println("Dividend1 : "+ getDevidend3() );
	}

	public static double getDevidend1() {
		return getIncome() * 0.5;
	}
	public static double getDevidend2() {
		return getIncome() * 0.3;
	}
	public static double getDevidend3() {
		return getIncome() * 0.2;
	}

	public static double getIncome() {
		return valueOfSupply - getExpense();
	}

	public static double getExpense() {
		return valueOfSupply*expenseRate;
	}

	public static double getTotal() {
		return valueOfSupply + getVAT();
	}

	private static double getVAT() {
		// method를 만드는 코드
		return valueOfSupply * vatRate;
	}
	
	// method는 관련이 있는 거 끼리 묶은 정리정돈의 상자다

}

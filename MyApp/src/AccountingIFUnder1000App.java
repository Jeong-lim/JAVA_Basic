
public class AccountingIFUnder1000App {

	public static void main(String[] args) {
		
		double valueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueOfSupply*vatRate;
		double total = valueOfSupply + vat;
		double expense = valueOfSupply*expenseRate;
		double income = valueOfSupply - expense;
		
		double devidend1 = income * 1;
		double devidend2 = income * 0;
		double devidend3 = income * 0;
		
		System.out.println("Value of supply : "+ valueOfSupply);
		System.out.println("VAT : "+ vat );
		System.out.println("Total : "+ total );
		System.out.println("Expense : "+ expense );
		System.out.println("Income : "+ income );
		System.out.println("Dividend1 : "+ devidend1 );
		System.out.println("Dividend1 : "+ devidend2 );
		System.out.println("Dividend1 : "+ devidend3 );
		
		// Alt+Shift+L = ���� �ٲٱ�
		// Find replace = Ctrl + F
		// Run Configuration ���� arg�� ���� �Է°��� ��ȯ�� �� ����
	}

}
package BankSystem;

public class Account {
	private String accountNo;
	private int balance;
	
//	게좌번호
	public Account(String accountNo) {
		this.accountNo = accountNo;
	}
	
//  입금 기능    
	public int deposit(int money) {
		balance += money;
		return balance;
	}
//	출금가능
	public int withdraw(int money) {
		balance -= money;
		return balance;
	}
//	잔고확인
	public void showBalance() {
		System.out.println(balance);
	}
}

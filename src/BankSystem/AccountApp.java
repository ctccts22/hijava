package BankSystem;

import java.util.Scanner;

public class AccountApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
			boolean run = true;
			int money;
			
			Account account = new Account("762902-01-393573");
			
			while(run) {
				System.out.println("");
				System.out.println("----------------------------------");
				System.out.println("1.예금ㅣ2.출금ㅣ3.잔고ㅣ4.종료");
				System.out.println("----------------------------------");
				System.out.println("선택>");
				
				int menuNo = sc.nextInt();
				
				switch(menuNo) {
				case 1 :
					System.out.println("예금액>");
					money = sc.nextInt();
					account.withdraw(money);
					break;
				
				case 2 :
					System.out.println("잔고액>");
					money = sc.nextInt();
					account.deposit(money);
					break;
					
				case 3 :
					System.out.println("프로그램 종료>");
					run = false;
					break;
					
				default :
					System.out.println("다시입력해주세요>");
					continue;
				
				}
			}
sc.close();
	}

}

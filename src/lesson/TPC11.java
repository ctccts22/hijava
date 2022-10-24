package lesson;

import kr.tpc.BookVO;

public class TPC11 {

	public static void main(String[] args) {
		// 책1권을 저장하기위해서 객체를 생성하시오.
		BookVO b = new BookVO();
		b.title="파이썬";
		b.price=16000;
		b.company="에이콘";
		b.page=700;
		
		System.out.println(b.title);
		System.out.println(b.price);
		System.out.println(b.company);
		System.out.println(b.page);
		

	}

}

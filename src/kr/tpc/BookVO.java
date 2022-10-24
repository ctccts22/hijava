package kr.tpc;
// 책(Object) -> 제목, 가격, 출판사, 페이지수.....
public class BookVO {
	public String title;
	public int price;
	public String company;
	public int page;
//	디폴트 생성자 생략
	public BookVO() {
//	초기화 작업
		this.title="자바";  //디스 생략가능
		this.price=14000;
		this.company="이지스";
		this.page=780;
 }
//	오버로딩
	public BookVO(String title, int price, String company, int page) {
		this.title=title;
		this.price=price;
		this.company=company;
		this.page=page;
	}
}
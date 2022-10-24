package lesson;

public class TPC09 {
	
	public static void main(String[] args) {
		int a=56;
		int b=40;
		//a+b=?
		TPC09 tpc=new TPC09(); //heapArea
		int v= tpc.sum(a,b);
		System.out.println(v); //96
	}

	public int sum(int a, int b) {
		int v=a+b;
		return v;
	}
}

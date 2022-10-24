package lesson;

import kr.tpc.OverLoad;

public class TPC16 {

	public static void main(String[] args) {
//	1+1=?, 23.4+56=? 56.7+79.9=?\
		
		OverLoad ov=new OverLoad();
		ov.hap(20, 50);
		ov.hap(23.4f, 56);
		ov.hap(56.7f, 78.9f);
	}

}

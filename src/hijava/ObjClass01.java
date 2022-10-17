package hijava;

public class ObjClass01 {

	public static void main(String[] args) {
		
		ProcureItemVO procureItemVO = new ProcureItemVO();
		
		System.out.println("아무것도 셋팅하지 않은 객체 ::: " + procureItemVO.toString());
		
		procureItemVO.setId(1);
		procureItemVO.setName("옥수수");
		procureItemVO.setPrice(10000);
		procureItemVO.setQuantity(2);
		
		System.out.println("옥수수VO : " + procureItemVO.toString());
		
	}
}

package hijava;
/**
 * 구매품목순서
 * @author ctcct
 *
 */
public class ProcureItemDocument {
	
	public int id;
	public String procureItemName;
	public String procureItemUnitName;
	public int procureItemQty;
	public int procureItemPrice;
	
	public int addProcureItemQtyPrice() {
		int result = 0;
		result = procureItemQty * procureItemPrice;
		return result;
	}
	
	public void showEachVariableValue() {
		System.out.println("id ::: " + procureItemName);
		System.out.println("procureItemName ::: " + procureItemName);
		System.out.println("procureItemUnitName ::: " + procureItemUnitName);
		System.out.println("procureItemQty ::: " + procureItemQty);
		System.out.println("procureItemPrice ::: " + procureItemPrice);
	}
	
	public String concatStringValues() {
		String returnValue = "";
		returnValue = "안녕하세요. " + " 구매문서품목 플레스입니다.";
		return returnValue;
	}
}

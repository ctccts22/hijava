package hijava;

public class ProcurementDocument {

	public int procureRequenstDocumentQty;
	public int orderRequenstDocumentQty;
	public int orderDocumentQty;
	public int contractDocumentQty;
	public int estimatedocumentQty;
	
	public int totalDocumentQtyDailyMake() {
		
		int totalDocument = procureRequenstDocumentQty + orderRequenstDocumentQty
				+ orderDocumentQty + contractDocumentQty + estimatedocumentQty;
		
		return totalDocument;
	}
	public int staticValueCalculateDailyDocument() {
		int totalDocuCnt = 0;
		totalDocuCnt = 10 + 5 + 1 + 3 + 5;
		
		return totalDocuCnt;
	}
}

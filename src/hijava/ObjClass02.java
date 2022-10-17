package hijava;

public class ObjClass02 {

	public static void main(String[] args) {
		
		ProcurementDocument procurementDocument = new ProcurementDocument();
		
		procurementDocument.procureRequenstDocumentQty = 10;
		procurementDocument.orderRequenstDocumentQty = 5;
		procurementDocument.orderDocumentQty = 3;
		procurementDocument.contractDocumentQty = 20;
		procurementDocument.estimatedocumentQty = 25;
		
		System.out.println(procurementDocument.procureRequenstDocumentQty);
		System.out.println(procurementDocument.orderRequenstDocumentQty);
		System.out.println(procurementDocument.orderDocumentQty);
		System.out.println(procurementDocument.contractDocumentQty);
		System.out.println(procurementDocument.estimatedocumentQty);
		
		int getTotalDocuQty = procurementDocument.totalDocumentQtyDailyMake();
			System.out.println("getTotalDocuQty ::: " + getTotalDocuQty);
			
		int getStatictotalDocuQty = procurementDocument.staticValueCalculateDailyDocument();
			System.out.println("getStatictotalDocuQty ::: " +getStatictotalDocuQty);
	}
}

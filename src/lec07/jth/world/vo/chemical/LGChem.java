package lec07.jth.world.vo.chemical;
/**
 * 엘지화학
 * @author ctcct
 *
 */
public class LGChem {

		private static LGChem lgChem = new LGChem();
		
		private LGChem() {
			
		}
		public static LGChem getInstance() {
			return lgChem;
		}
		private int salesAmount; //매출액
		private int propertyAmount; //자산액
		private int debtAmount; // 부채액
		private int capitalAmount; // 자본액
		private int totalEmployee; // 총 종업원
		private String headOfficeAddress; // 본점주소
		private String companyProperty; // 회사속성 (조선 it 화학 전자)
		private String companyName; //회사명


		public int getSalesAmount() {
			return salesAmount;
		}
		public void setSalesAmount(int salesAmount) {
			this.salesAmount = salesAmount;
		}
		public int getPropertyAmount() {
			return propertyAmount;
		}
		public void setPropertyAmount(int propertyAmount) {
			this.propertyAmount = propertyAmount;
		}
		public int getDebtAmount() {
			return debtAmount;
		}
		public void setDebtAmount(int debtAmount) {
			this.debtAmount = debtAmount;
		}
		public int getCapitalAmount() {
			return capitalAmount;
		}
		public void setCapitalAmount(int propertyAmount, int debtAmount) {
			this.capitalAmount = capitalAmount - debtAmount;
		}
		public int getTotalEmployee() {
			return totalEmployee;
		}
		public void setTotalEmployee(int totalEmployee) {
			this.totalEmployee = totalEmployee;
		}
		public String getHeadOfficeAddress() {
			return headOfficeAddress;
		}
		public void setHeadOfficeAddress(String headOfficeAddress) {
			this.headOfficeAddress = headOfficeAddress;
		}
		public String getCompanyProperty() {
			return companyProperty;
		}
		public void setCompanyProperty(String companyProperty) {
			this.companyProperty = companyProperty;
		}
		public String getCompanyName() {
			return companyName;
		}
		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}
		@Override
		public String toString() {
			return "LGChem [salesAmount=" + salesAmount + ", propertyAmount=" + propertyAmount + ", debtAmount="
					+ debtAmount + ", capitalAmount=" + capitalAmount + ", totalEmployee=" + totalEmployee
					+ ", headOfficeAddress=" + headOfficeAddress + ", companyProperty=" + companyProperty
					+ ", companyName=" + companyName + "]";
		}
	
		
}


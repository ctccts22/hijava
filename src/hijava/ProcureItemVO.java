package hijava;
/**
 * 구매품목
 * @author ctcct
 *
 */
public class ProcureItemVO {

	private int id;
	private String name;
	private int quantity;
	private int price;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "ProcureItemVO [id=" + id
				+ ", name=" + name 
				+ ", quantity=" + quantity 
				+ ", price=" + price + "]";
	}
	
	
	
}

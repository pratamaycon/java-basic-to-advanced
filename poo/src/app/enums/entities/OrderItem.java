package app.enums.entities;

public class OrderItem
{
	private Integer quantity;
    private Double price;
    
    private Product product;
	
	public OrderItem(){}
	
	public OrderItem(int quantity, double price ){
		this.quantity = quantity;
		this.price = price;
    }
    
    public OrderItem(int quantity, double price, Product product){
		this.quantity = quantity;
        this.price = price;
        this.product = product;
	}
	
	public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
	
	public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
	
	public Double subTotal(){
		return quantity * price;
    }
    
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", $");
        sb.append(String.format("%.2f", price));
		sb.append(quantity);
		sb.append(", Subtotal: $" );
		sb.append(String.format("%.2f", subTotal()));
        return sb.toString();
    }
}

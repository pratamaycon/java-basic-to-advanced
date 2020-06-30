package app.inheritance.entities;

/**
 * ImportedProduct
 */
public class ImportedProduct extends Product {

    private Double customsFee;

    public ImportedProduct() {}

    public ImportedProduct(String name, double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;

    }

    public double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(double customsFee) {
        this.customsFee = customsFee;
    }

    @Override
    public final String priceTag() {
        StringBuilder sb = new StringBuilder();
        sb.append(getName());
        sb.append(" $ ");
        sb.append(String.format("%.2f", totalPrice()));
        sb.append(" (Customs fee: $");
        sb.append(String.format("%.2f", customsFee));
        sb.append(")");
        return sb.toString();
    }

    public Double totalPrice() {
        return getPrice() + customsFee;
    }

}
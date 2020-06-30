package app.inheritance.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * UsedProduct
 */
public class UsedProduct extends Product {

    private final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Date manufactureData;

    public UsedProduct(){}

    public UsedProduct(String name, double price, Date manufactureData){
        super(name, price);
        this.manufactureData = manufactureData;
    }

    public Date getManufacture() {
        return manufactureData;
    }

    public void setManufacture(Date manufactureData) {
        this.manufactureData = manufactureData;
    }

    @Override
    public String priceTag() {
        StringBuilder sb = new StringBuilder();
        sb.append(getName());
        sb.append(" (used) $");
        sb.append(String.format("%.2f", getPrice()));
        sb.append(" (Manufacture date: )");
        sb.append(sdf.format(manufactureData));
        sb.append(")");
        return sb.toString();
    }
}
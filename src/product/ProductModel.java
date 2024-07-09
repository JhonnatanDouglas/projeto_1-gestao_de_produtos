package product;

public class ProductModel {
    private String barCode;
    private String name;
    private double priceItem;
    private int stock;

    public ProductModel(String barCode, String name, double priceItem, int stock) { 
        this.barCode = barCode;
        this.name = name;
        this.priceItem = priceItem;
        this.stock = stock;
    }

    public String getBarCode() {
        return barCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public double getPriceItem() {
        return priceItem;
    }

    public void setPriceItem(double newPriceItem) {
        this.priceItem = newPriceItem;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int newStock) {
        this.stock = newStock;
    }

    @Override
    public String toString() {
        return "ProductModel: {" +
                "barCode=' " + barCode + '\'' +
                ", name=' " + name + '\'' +
                ", priceItem= " + priceItem +
                ", stock= " + stock +
                '}';
    }
}
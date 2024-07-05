package product;

import java.util.ArrayList;
import java.util.List;

public class ProductModel {
    protected String productItem;
    protected int amountItem;
    protected double priceItem;
    protected List<ProductModel> productList;

    public ProductModel() {
        productList = new ArrayList<>();
    }

    public String getProductItem() {
        return this.productItem;
    }

    public int getAmountItem() {
        return this.amountItem;
    }

    public double getPriceItem() {
        return this.priceItem;
    }
}
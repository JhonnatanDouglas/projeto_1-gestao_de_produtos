package product;

import java.util.List;

public class ProductController extends ProductModel {
    
    // public String getProduct(String product, int amount, double  price ) {
        
    // }

    public void getAllProducts(List<ProductModel> productList) {
        productList.forEach(product -> {System.out.println(getProduct(product.getProductItem(), product.getAmountItem(), product.getPriceItem()));
        });
    }

    // protected createProduct(String product, int amount, double  price) {
    //     productList.add(product, amount, price);

    // }
}

package product;

import exceptions.NegativePriceException;
import exceptions.NotFoundException;
import java.util.ArrayList;
import java.util.List;

public class ProductController {
    private List<ProductModel> products = new ArrayList<>();    

    public String create(ProductModel item) throws NegativePriceException {
        if (item.getPriceItem() <= 0) {
            throw new NegativePriceException("Número negativo! Precisa ser um número positivo!");
        }
        products.add(item);
        return "Produto: " + item.getName() + " foi adicionado!";
    }

    public List<ProductModel> read() {
        return products;
    }

    public double retrievePrice(String barCode) throws NotFoundException{
        for (ProductModel product : products) {
            if (product.getBarCode().equals(barCode)) {
                return product.getPriceItem();
            }
        }
        
        throw new NotFoundException("Produto não encontrado!");
    }
}

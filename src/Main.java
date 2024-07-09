import exceptions.NegativePriceException;
import exceptions.NotFoundException;
import product.ProductController;
import product.ProductModel;

public class Main {
    public static void main(String[] args) {
        ProductController productController = new ProductController();

        try {
            ProductModel product1 = new ProductModel("123456", "Produto A", 1000, 10);
            ProductModel product2 = new ProductModel("789012", "Produto B", 1500, 5);

            System.out.println("");
            System.out.println(productController.create(product1));
            System.out.println(productController.create(product2));

            System.out.println("");
            System.out.println("Listagem de Produtos:");
            for (ProductModel product : productController.read()) {
                System.out.println(product);
            }
            
            System.out.println("");
            String barCode = "123456";
            System.out.println("Preço do produto com código de barras " + barCode + ": " + productController.retrievePrice(barCode) + " centavos.");

        } catch (NegativePriceException | NotFoundException e) {
            System.err.println(e.getMessage());
        }
    }
}

package oopsDesignQuestion.shoppingCart;
import java.util.ArrayList;

public class ProductCatalog {
	private ArrayList<Product> productList;

	public ProductCatalog() {
		productList = new ArrayList<Product>();

	}

	public void setPrductList(ArrayList<Product> productList) {
		this.productList = productList;
	}

	public ArrayList<Product> getProductList() {

		return productList;
	}

	public void addProduct(Product prod) {

		productList.add(prod);
	}
}

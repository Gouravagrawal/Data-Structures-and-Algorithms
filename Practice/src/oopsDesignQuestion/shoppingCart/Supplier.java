package oopsDesignQuestion.shoppingCart;
public class Supplier {

	private String supplierName;
	private String supplierAddress;
	private ProductCatalog productCatalog;

	public Supplier(String supplierName, String supplierAddress) {
		this.supplierName = supplierName;
		this.supplierAddress = supplierAddress;
		productCatalog = new ProductCatalog();
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getSupplierAddress() {
		return supplierAddress;
	}

	public void setSupplierAddress(String supplierAddress) {
		this.supplierAddress = supplierAddress;
	}

	public ProductCatalog getProductCatalog() {
		return productCatalog;
	}

	public void setProductCatalog(ProductCatalog productCatalog) {
		this.productCatalog = productCatalog;
	}

	public void createAddProduct(String productName, float productPrice,
			int productID) {
		Product p = new Product(productName, productPrice, productID);
		productCatalog.addProduct(p);

	}

	public void updateProductInfo(int id) {
		for (Product prod : productCatalog.getProductList()) {
			if (prod.getProductId() == id) {
				prod.setProductName("LENOVO");
			}
		}

	}

}

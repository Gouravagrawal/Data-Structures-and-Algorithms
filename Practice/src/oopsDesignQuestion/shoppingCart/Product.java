package oopsDesignQuestion.shoppingCart;

public class Product {

	private String productName;
	private float productPrice;
	private int productId;
	
	public Product(String productName, float productPrice,int productID){
		this.productName=productName;
		this.productPrice=productPrice;
		this.productId=productID;
	}
	
	public void setProductName(String productName){
		this.productName=productName;
	}
	
	public String getProductName(){
		return productName;
	}
	
	public void setProductPrice(float productPrice){
		
		this.productPrice=productPrice;
	}
	
	public float getProductPrice(){
		
		return productPrice;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getProductId() {
		// TODO Auto-generated method stub
		return productId;
	}
	
}

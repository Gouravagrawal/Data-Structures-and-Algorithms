package oopsDesignQuestion.shoppingCart;
import java.util.ArrayList;
import java.util.Scanner;


public class Controller {

	
	public static void main (String args[]){
		
		
		/*
		 * Creating the supplier
		 */
						
		Supplier supplier =new Supplier("eBay","Boston");
		supplier.createAddProduct("Dell", 1234,11);		
		supplier.createAddProduct("HP", 884,12);
		
		Supplier supplier1 =new Supplier("Amazon","san Faransico");
		supplier1.createAddProduct("A.c", 21234,13);		
		supplier1.createAddProduct("Freeze", 484,14);
	
		supplier.updateProductInfo(11);
		
		
		
		/*
		 * View the supplier and all its product 
		 */
		
		System.out.println("THE VIEW PART OF THE CODE");
		
		System.out.println("The supplier available in the system is ->>>"+ supplier.getSupplierName());
		System.out.println("The supplier available in the system is ->>>"+ supplier.getSupplierAddress());
		System.out.println("The products of the supplier are ->>>");
		
		for(Product prod:supplier.getProductCatalog().getProductList()){
			System.out.println("ProductName>>" +prod.getProductName());
			System.out.println("ProductPrice>>" + prod.getProductPrice());
		}
		
	}
}


// author: Ivy Seo 
// stage 1

import java.util.*;
import java.lang.*;
import java.io.*;
public class Book implements Serializable {
  private static final long serialVersionUID = 1L;

  private String name;
  private int quantity;
  private float salesPrice;
  private String id;
  
  private List <Manufacturer> manufacturer = new LinkedList();
  private static final String PRODUCT_STRING = "P";

  //Constructor
  public Product(name, quantity, salesPrice) {
    this.name = name;
    this.quantity = quantity;
    this.salesPrice = salesPrice;
    productID = PRODUCT_STRING + (ProductIdServer.instance()).getId();
  }

// invokes funcion getProductID()
  public int getId() { 
    return id;
  }
  
  public String getName() {
    return name; 
  }
  
  public int getQuantity() {
    return quantity
  }
  
  public float getSalesPrice() {
    return salesPrice;
  }
  
  public void setName(String newName) {
    name = newName;
  }
  
  public void setQuantity(int newQuantity) {
    quantity = newQuantity;
  }
  
  public void setSalesPrice(float newSalesPrice) {
    salesPrice = newSalesPrice;
  }
  
  public boolean equals(String id) {
    return this.id.equals(id);
  }

  public String toString() {
    String string = "Product ID " + id + " name " + name + " quantity " + quantity + " salesPrice " + salesPrice;
    return string;  
  }
}

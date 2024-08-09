package ra.entity;

import java.util.Scanner;

public class Product {
    private int productid;
    private String productName;
    private float price;
    private String description;
    private String created;
    private int categoryId;
    private int productStatus;

    // Constructor
    public Product(int productid, String productName, float price, String description,
                   String created, int categoryId, int productStatus) {
        this.productid = productid;
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.created = created;
        this.categoryId = categoryId;
        this.productStatus = productStatus;
    }

    // Getter and Setter methods (implement them)

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public int getCatalogId() {
        return categoryId;
    }

    public void setCatalogId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(int productStatus) {
        this.productStatus = productStatus;
    }

    // inputData method (implement it)
    public void InputProductId() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Product Id: ");
        productid = Integer.parseInt(sc.nextLine());
    }

    public void InputProductName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Category Name: ");
        productName = sc.nextLine();
    }
public  void InputProductPrice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Product Price: ");
        price = Float.parseFloat(sc.nextLine());
}
public String Created(){
    java.util.Date date = new java.util.Date();
        return created = String.valueOf(date);
}
    public void InputProductDescriptions() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Descriptions: ");
        description = sc.nextLine();
    }
public  void InputProductCategory() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Category Id: ");
        categoryId = Integer.parseInt(sc.nextLine());
}
    public void InputProductStatus() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Category Status:(0: Đang bán – 1: Hết hàng – 2: Không bán)");
        productStatus = Integer.parseInt(sc.nextLine());
    }
    // displayData method (implement it)

    public void displayProduct() {
        System.out.println("Product ID: " + productid);
        System.out.println("Product Name: " + productName);
        System.out.println("Product Price: " + price);
        System.out.println("Product Description: " + description);
        System.out.println("Product Category ID: " + categoryId);
        System.out.println("Product Status: " + productStatus);

    }
}
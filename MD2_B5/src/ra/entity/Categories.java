package ra.entity;

import java.util.Scanner;

public class Categories {
    private int categoryId;
    private String categoryName;
    private String descriptions;
    private boolean categoryStatus;

    // Constructor
    public Categories(int categoryId, String categoryName, String descriptions, boolean categoryStatus) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.descriptions = descriptions;
        this.categoryStatus = categoryStatus;
    }

    // Getter and Setter methods (implement them)

    public boolean isCategoryStatus() {
        return categoryStatus;
    }

    public void setCategoryStatus(boolean categoryStatus) {
        this.categoryStatus = categoryStatus;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
    // inputData method (implement it)

    public void InputCategoryId() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Category Id: ");
        categoryId = Integer.parseInt(sc.nextLine());
    }

    public void InputCategoryName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Category Name: ");
        categoryName = sc.nextLine();
    }

    public void InputDescriptions() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Descriptions: ");
        descriptions = sc.nextLine();
    }

    public void InputCategoryStatus() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Category Status: ");
        categoryStatus = Boolean.parseBoolean(sc.nextLine());
    }

    // displayData method (implement it)
    public void displayCategory() {
        System.out.println("Category Id: " + categoryId);
        System.out.println("Category Name: " + categoryName);
        System.out.println("Descriptions: " + descriptions);
        System.out.println("Category Status: " + categoryStatus);
    }
}

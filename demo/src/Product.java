import java.util.Scanner;

public class Product {

    //Fields
    private String name;
    private double price;
    private double discount;

    //Constructions
    public Product(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    //Getters and Setters

    public String getName() { return this.name; }

    public double getPrice() { return this.price; }

    public double getDiscount() { return this.discount; }

    public void setName(String name){ this.name = name; }

    public void setPrice(double price) { this.price = price; }

    public void setDiscount(double discount) { this.discount = discount; }

    //Methods

    public void input(){
        Scanner in = new Scanner(System.in);
        System.out.println("Input product name: ");
        String name = in.next();
        in.nextLine();
        System.out.println("Input product price: ");
        double price = in.nextDouble();
        in.close();
        this.name = name;
        this.price = price;
    }

    public void output(){
        System.out.println("Product Name: " + this.name);
        System.out.println("Product Price: " + this.price);
    }

    private double importTax(double price){
        return price * (12/100);
    }
    
}

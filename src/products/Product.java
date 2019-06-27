package products;

import java.math.RoundingMode;
import java.text.NumberFormat;

public abstract class Product {

    protected String code;
    protected String description;
    protected double price;
    protected static int count = 0; // a protected static variable

    //Q:Why is this necessary?
    //A: Empty constructors are need to create new instance
    public Product() {
     }

    public Product(String code, String description, double price){
        this.code = code;
        this.description = description;
        this.price = price;
    }

    // Get and set accessors for the code, description, and price instance variables

    //Redundant code
    @Override
    public String toString() {
        return "Code:                " + code + "\n" +
                "Description:        " + description + "\n" +
                "Price:              " + this.getFormattedPrice() + "\n";
    }

    protected String getFormattedPrice() {
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(2);
        nf.setMinimumFractionDigits(2);
        nf.setRoundingMode(RoundingMode.HALF_UP);
        return nf.format(price);
        // Use the NumberFormat class to format the price to 2 decimal places
    }

    public String returnFormattedPrice()
    {
        return getFormattedPrice();
    }


    // Create public access for the count variable
    //What is this supposed to count???
    public int getCount() {
        return count;
    }


    public String getCode(){
        return code;
    }
    public void setCode(String code){
        this.code = code;
    }

    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }



}
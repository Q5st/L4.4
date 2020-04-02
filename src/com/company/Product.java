package com.company;

public class Product {
    private String name;
    private int price;
    private int quantity;
    public static int tMExp =0;
    public static String stTMExp;
    public static int most =0;
    public static String stMOst;

    public Product(String name, int price, int quantity){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
        if (this.price>tMExp){
            tMExp=this.price;
            stTMExp=this.name;
        }
        if (this.quantity>most){
            most=this.quantity;
            stMOst=this.name;
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) { this.quantity = quantity; }

    public static void  print(){System.out.println("the most expensive: " + stTMExp + ", the biggest quantity: " +stMOst); }
}

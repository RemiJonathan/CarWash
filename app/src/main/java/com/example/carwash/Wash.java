package com.example.carwash;

public class Wash {
    final int OUTWASH = 5;
    final int INWASH = 10;
    final int DISCOUNT = 25;

    private int amount;
    private float price;
    private float discount;

    public Wash() {
        this.amount = 1;
        this.price = INWASH;
        this.discount = 0;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public float getTotalPrice(){
        return (price*amount)*((100-discount)/100);
    }
}

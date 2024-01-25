package com.driver;

public class Pizza {


    private int price;
    private Boolean isVeg;
    private String bill;
    public int extraToppingPrice;

    private int basicExtraToppingPrice;
    public int extraCheesePrice;
    private int basicExtraCheesePrice;
    private int pizzaBasePrice;
    private int paperBagPrice;
    private boolean takeAway;
    public boolean isDeluxe;



    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;

        this.basicExtraCheesePrice = 80;
        this.paperBagPrice = 20;
        if(isVeg){
            this.basicExtraToppingPrice = 70;
            this.pizzaBasePrice = 300;
            this.price = this.pizzaBasePrice;

        }
        else{
            this.basicExtraToppingPrice = 120;
              this.pizzaBasePrice = 400;
            this.price = this.pizzaBasePrice;
        }
        this.bill = "Base Price Of The Pizza: "+ this.pizzaBasePrice + "\n";


        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isDeluxe)
        this.extraCheesePrice = this.basicExtraCheesePrice;

    }

    public void addExtraToppings(){

        // your code goes here
        if(!isDeluxe)
        this.extraToppingPrice += this.basicExtraToppingPrice;


    }

    public void addTakeaway(){
        // your code goes here
        this.takeAway = true;



    }

    public String getBill(){
        // your code goes here
        if(this.extraCheesePrice != 0){
            this.price += this.extraCheesePrice;
            this.bill += "Extra Cheese Added: " + this.extraCheesePrice + "\n";
        }

        if(this.extraToppingPrice != 0) {
            this.price += this.extraToppingPrice;
            this.bill += "Extra Toppings Added: " + this.extraToppingPrice + "\n";
        }
            if(this.takeAway){
           this.price += this.paperBagPrice;
           this.bill += "Paperbag Added: " + this.paperBagPrice +"\n";
       }

        this.bill += "Total Price: "+ this.price + "\n";
        return this.bill;

    }
}

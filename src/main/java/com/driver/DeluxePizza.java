package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {

        super(isVeg);
        // your code goes here
        this.extraCheesePrice = 80;
        if(isVeg){
            this.extraToppingPrice = 70;

        }
        else{
            this.extraToppingPrice = 120;
        }

    }
}

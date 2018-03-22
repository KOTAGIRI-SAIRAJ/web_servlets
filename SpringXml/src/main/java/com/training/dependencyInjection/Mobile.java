package com.training.dependencyInjection;

public class Mobile {
    private Iphone iphone;

    public Mobile(Iphone iphone){
        this.iphone = iphone;
        System.out.println("Iphone was under the category of Phones");
    }

    public void callIphone() {
        iphone.show();
    }

}

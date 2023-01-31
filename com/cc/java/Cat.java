package com.cc.java;

public class Cat {
    
    public String name;
    public String furColor; 
    public int age;

    public String tellYourName() {
        return this.name;
    }

    public String tellYourFurColor() {
        return this.furColor;
    }
    
    public int tellYourAge() {
        return this.age;
    }

    public String tellYourAddress(){
        return "Blick von innen: " + this;
}
}

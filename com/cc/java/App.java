package com.cc.java;

public class App {
    
    public static void main(String[] args) {
    
      
    // Instanziierung class --> object / instance
    // Cat --> Referenztyp
    // cat --> Referenzvariable

    Cat cat = new Cat();

    cat.name = "Grizabella";
    cat.furColor = "white";
    cat.age = 29;


    output(cat.tellYourName());
    output(cat.tellYourFurColor());
    output(String.valueOf(cat.tellYourAge()));
       
    output("Blick von aussen " + cat);
    output(cat.tellYourAddress());  


    output("--------------------");

    Cat cat2 = new Cat();

    cat.name = "Alonzo";
    cat.furColor = "grey";
    cat.age = 35;

    
    output(cat.name);
    output(cat.furColor);
    output(String.valueOf(cat.age));
    
    output("Blick von aussen: "+  cat2);
    output(cat2.tellYourAddress());
    }

  public static void output(String outputStr) {
    System.out.println(outputStr);
  }
}


package com.cc.java;

public class App {
    
    public static void main(String[] args) {
    
    // Instanziierung class --> object / instance
    // Cat --> Referenztyp
    // cat --> Referenzvariable

    Cat cat = new Cat();
    System.out.println("Blick von aussen " + cat);
    output(cat.tellYourAddress());  


    System.out.println("--------------------");

    Cat cat2 = new Cat();
    output("Blick von aussen: "+  cat2);
    output(cat2.tellYourAddress());
    }

  public static void output(String outputStr) {
    System.out.println(outputStr);
  }
}


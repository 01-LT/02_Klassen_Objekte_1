package com.cc.java;

public class App {
    
    public static void main(String[] args) {

    // Instanziierung class --> object / instance
    // Cat --> Referenztyp
    // cat --> Referenzvariable
    Cat cat = new Cat();
    System.out.println("Blick von aussen " + cat);
    cat.tellYourAddress();  

    System.out.println("--------------------");

    Cat cat2 = new Cat();
    System.out.println("Blick von aussen: "+  cat2);
    cat2.tellYourAddress();
    }

  
}


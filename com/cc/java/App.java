package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        // Instanziierung  --> Erzeugen eines Objektes
        // System.out.println(new Cat());

        // cat --> Referenzvariable
        // Cat --> Referenztyp(Klasse)
        Cat cat = new Cat();
        System.out.println("Blick von Aussen: " + cat);
        cat.tellYourAdress();

        System.out.println("----------------------------------------------------");

        Cat cat2 = new Cat();
        System.out.println("Blick von Aussen: " + cat2);

        cat2.tellYourAdress();

    }

   

}

package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        // Instanziierung  --> Erzeugen eines Objektes
        // System.out.println(new Cat());

        // cat --> Referenzvariable
        // Cat --> Referenztyp(Klasse)
        Cat cat = new Cat();
        // IMPLIZITE Typumwandlung Cat --> String
        output("Blick von Aussen: " + cat);
        output("Blick von Innen: " + cat.getInstanceVariable()); 

        System.out.println("----------------------------------------------------");

        Cat cat2 = new Cat();
        output("Blick von Aussen: " + cat2);
        output("Blick von Innen: " + cat2.getInstanceVariable()); 

    }

      // Statische Methode, die in der Klasse ausgeführt wird ...
    public static void output(String outputStr) {

    System.out.println(outputStr);

   }

}

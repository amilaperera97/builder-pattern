package com;

import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        hello("Amila",null,value->{
            System.out.println("No lname "+value);
        });
  
        hello2("Amila",null,()->{
            System.out.println("No lname");
        });
    }

    static void hello(String fName, String lName, Consumer<String> callback) {
        System.out.println(fName);

        if (lName != null) {
            System.out.println(lName);
        } else {
            callback.accept(fName);
        }
    }

    static void hello2(String fName, String lName, Runnable callback) {
        System.out.println(fName);

        if (lName != null) {
            System.out.println(lName);
        } else {
            callback.run();
        }
    }

}

package com.nit;

import java.util.*;
import module java.base;
record Product(String name, Double price){

}
public class Main {
    public static void main(String[] args) {
       List<Product> list = new ArrayList<>();
       int noOfProduct = Integer.parseInt(IO.readln("Enter"));
       for(int i=1; i<=noOfProduct; i++){
        String name = IO.readln("Enter");
        double price = Double.parseDouble(IO.readln("Enter"));
        list.add(new Product(name, price));
       }   
    }
}

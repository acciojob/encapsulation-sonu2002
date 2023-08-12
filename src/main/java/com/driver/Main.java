package com.driver;

public class Main {

     public static void main(String[] args) {
          RWOnly rwOnlyObj = new RWOnly("John Doe");

//          rwOnlyObj.name = "Jane Smith"; // This will result in a compilation error
//          name has private access in com.driver.RWOnly


          // Try printing the name variable
//          System.out.println("Name: " + rwOnlyObj.name);

          rwOnlyObj.setName("Sonu");
          System.out.println(rwOnlyObj.getName());

     }


  
}
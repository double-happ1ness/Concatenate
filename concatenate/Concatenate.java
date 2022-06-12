/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concatenate;

import java.util.Scanner;

//public class Concatenate {
//  public static String Concatenate() {
//        Scanner myObj = new Scanner(System.in); 
//        System.out.println("Enter first word");
//        String firstWord = myObj.nextLine();       
//        Scanner newObj = new Scanner(System.in);
//        System.out.println("Enter second word");
//        String secondWord = newObj.nextLine();
//        System.out.println(firstWord + " " + secondWord);
//        return firstWord;
//        
//  }
//
//  public static void main(String[] args) {
//    Concatenate();
//  }
//}

public class Concatenate {
    private static String firstWord;
    private static String secondWord;

    public void Concatenate(String firstWord, String secondWord) {
        this.firstWord = firstWord;
        this.secondWord = secondWord;
    }

    public String getFirst() {
        return firstWord;
    }

    public String getSecond() {
        return secondWord;
    }

    public static Concatenate something() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter first word");
        String firstWord = myObj.nextLine();
        Scanner newObj = new Scanner(System.in);
        System.out.println("Enter second word");
        String secondWord = newObj.nextLine();
        return new Concatenate(firstWord, secondWord);
    }

    public static void main(String[] args) {
        Concatenate result = something();
        System.out.println(result.getFirst() + " " + result.getSecond());
    }

}



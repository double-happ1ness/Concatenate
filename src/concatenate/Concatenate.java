package concatenate;

import java.util.Scanner;

public class Concatenate {

    private static String firstWord, secondWord;

    public Concatenate(String firstWord, String secondWord) {
        Concatenate.firstWord = firstWord;
        Concatenate.secondWord = secondWord;
    }

    public String getFirst() {
        return firstWord;
    }

    public String getSecond() {
        return secondWord;
    }

    public String concat() {
        return firstWord + " " + secondWord;
    }

    public static Concatenate input() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter first word");
        firstWord = myObj.nextLine();
        System.out.println("Enter second word");
        secondWord = myObj.nextLine();
        return new Concatenate(firstWord, secondWord);
    }

    public static void main(String[] args) {
        Concatenate result = input();
        System.out.println(result.concat());
    }

}

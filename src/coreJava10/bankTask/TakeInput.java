package coreJava10.bankTask;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TakeInput {
    static Scanner  scanner = new Scanner(System.in);
    public static String readString(){
        String inString = null;
        try {
            inString = scanner.next();
        } catch (InputMismatchException e) {
            System.out.println("Enter Valid String");
        }
        return  inString;
    }
    public static String readString(String prompt){
        System.out.print(prompt);
        String inString = null;
        try {
            inString = scanner.next();
        } catch (InputMismatchException e) {
            System.out.println("Enter Valid String");
        }
        return  inString;
    }
    public static Double readDouble(){
        Double inDouble = null;
        try {
            inDouble = Double.valueOf(scanner.next());
        }
        catch (InputMismatchException | NumberFormatException e){
            System.out.println("Enter valid Double value");
        }
        return inDouble;
    }
    public static Integer readInteger(){
        Integer inInteger = null;
        try {
            inInteger = Integer.valueOf(scanner.next());
        } catch (InputMismatchException | NumberFormatException e) {
            System.out.println("Enter valid Integer");
        }
        return inInteger;
    }
    public static Integer readInteger(String prompt){
        Integer inInteger = null;
        try {
            inInteger = Integer.valueOf(scanner.next());
        } catch (InputMismatchException | NumberFormatException e) {
            System.out.println("Enter valid Integer");
        }
        return inInteger;
    }
    public static Integer nullCheck(Integer inInteger){
        if(inInteger==null) return  0;
        else return inInteger;
    }
}

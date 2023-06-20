package coreJava5;

public class Overload {
    int num1 =10,num2 =20;
    int i,j;
    void sum(){
        int sum = num1+num2;
        System.out.println("Sum is :"+sum);
    }
    void sum(int num1){
        int sum = num1+num2;
        System.out.println("Sum is: "+sum);
    }
    int sum(int i, int j){
        return  i+j;
    }
}

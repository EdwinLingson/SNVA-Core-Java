package coreJava5;

public class OverloadSub extends Overload{
int sum(int i, int j){
    return  i;
}
void sum(int i, int j, int k){
    System.out.println("Sum in SubClass: " +(i+j+k));
}
}

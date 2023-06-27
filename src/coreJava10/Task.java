package coreJava10;

public class Task {
    static void arithemetic() throws ArithmeticException{
        throw new ArithmeticException("Arithemtic");
    }
    public static void main(String[] args) {
//        arithemetic();
        try {
//            System.out.println(1/0);
            try {
                arithemetic();
            } catch (ArithmeticException e) {
                System.out.println("Arithemetic");;
            }

            try {
                int[] arr = {1,2,3};
//                arr[5] =100;
                throw new ArrayIndexOutOfBoundsException();
            }catch (ArithmeticException e ){
                System.out.println("Arithmetic exception Caught");
            }
//            throw new ArithmeticException() ;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array OOB Exception");
        }
    }
}

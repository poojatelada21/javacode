import java.io.*;
public class factorial{
    public static void main(String args[]){
        int factorial=1, number=5;
        for(int i=1; i<=number; i++){
            factorial=factorial*i;
        }
        System.out.println("factorial of"+number+"is"+factorial);
    }
}
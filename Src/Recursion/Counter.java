package Recursion;

public class Counter {

    public static void main(String[] args){
        // Logic Before Recursion

        // Logic After Recursion

    }
    public void counter(int n){
        if(n <= 0){
            return;
        }
        System.out.println("loop " + n);
        counter(n-1);
    }
}
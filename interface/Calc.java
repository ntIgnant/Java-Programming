// This class 'Calc' will implement the interface 'Arithmetic'
public class Calc implements Arithmetic {

    @Overrride
    public double add(double a, double b){
        int result = a + b;
        return result;
    }

    @Overrride
    public double sub(double a, double b){
        int result = a - b;
        return result;
    }

    @Overrride
    public double mult(double a, double b){
        int result = a * b;
        return result;
    }

    @Override
    public double div(double a, double b){
        if(b == 0){
            throw new ArithmeticException("Cannot Divide by zero!"); // Throw zero division error if b = 0
        }
        else{
            int result = a / b;
            return result;
        }
    }

}
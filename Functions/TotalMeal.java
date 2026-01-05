public class TotalMeal {

    // Meal Price calculation Function logic
    public static double calcMealPrice(double tipRate, double taxRate, double listedPrice){
        double tip = tipRate * listedPrice;
        double tax = taxRate * listedPrice;
        double result = listedPrice + tip + tax;

        System.out.println("The total price of the meal was calculated!");

        // Return the total Price
        return result;
    }

    // Main Function
    public static void main(String[] args){
        // Create the variables for the tipRate, taxRate, and listedPrice
        double tipRat = 0.2;
        double taxRat = 0.08;
        double listedPri = 15;

        double totalPriceMeal = calcMealPrice(tipRat, taxRat, listedPri); // This should receive the returned value of the function


        // This is not necesary, when println is used, it formats everything into STRING type
//        // Convert the double into a string
//        String strTotalPriceMeal = Double.toString(totalPriceMeal);

        System.out.println("Final Meal Price: " + totalPriceMeal);
    }
}
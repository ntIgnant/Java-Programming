public class Ola {
    public static void main(String[] args){
        int number = 33;
        long long_number = 999999999; // ....... A masive value
        boolean flag = true; // Or false
        float piFloat = 3.1415926f;
        double piDouble = 3.141592653589793;

        // Variabes explicitly marked as CONSTANTS
        final int person_age = 11;

//        person_age = 12; // This would result in an error because a constant cannot be changed

        System.out.printf("The Age of This Person is %d\n", person_age);
    }
}

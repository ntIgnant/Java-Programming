public class basicString {

    public static void main(String[] args){
        String studentName = "Oscar";
        int studentAge = 19;
        double studentGPA = 2.8;
        String studentCountry = "Spain";

        // Call the static function
        studentInfo(studentName, studentAge, studentGPA, studentCountry);

        // Final message
        System.out.println("Byeeee.");
    }

    static void studentInfo(String name, int age, double gpa, String country){
        System.out.println("This is " + name + " and is " + age + " years old");

        // Case where the stuent is older than 20
        if (age > 20) {
            System.out.println("Yeah he's kinda old...");
        }

        // Message depending the differnet GPA of the student (good, bad, dead)

        String gpaMsg = ""; // Empty String for the gpa message depending on the value of it
        if (gpa >= 3.2){

            gpaMsg = " it's heavy... ";
        }
        else {
            gpaMsg = " it's alr ";
        }

        System.out.println("Abou the GPA of " + name + " well..." + gpaMsg);
    }

}
public class Main 
{
    public static void main(String[] args) 
    {
        // double forward slash for single line comments
        /* forward+star for multi-line 
        comments like this */

        // print command
        System.out.println("Hello World!");

        // defining variables requires you to state its type (String, [float, double] depending on magnitude, bool, char, [int, short, long, byte] depending on magnitude)
        String name = "Steve"; // strings MUST have DOUBLE quotes
        System.out.println("Name: " + name);
        int age = 24;
        System.out.println("Age: " + age);
        final int lifeExpectancy = 70; // final variables cannot have their value re-assined
        System.out.println("Life expentacy: " + lifeExpectancy);
        // multiple variables can be assigned on the same line

        //logical operators
        // AND &&, OR ||, NOT !
        // use Math. for mathematical operations

        if (age > lifeExpectancy) {
            System.out.println("You are dead");
        }
        else if (age == lifeExpectancy) {
            System.out.println("Death Bed");
        }
        else {
            System.out.println("Alive");
        }
        // variable = (condition) ? expressionTrue :  expressionFalse; can be used as conditional (if, else)short hand
        // can also use switch statement for multiple cases

        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        for (int j = 0; i < 5; i++) {//(executed once, condition, executed after first time)
            System.out.println(j);
        }

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String u : cars) { // iterates through array
            System.out.println(u);
        }
    }
}
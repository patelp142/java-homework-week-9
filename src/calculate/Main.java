package calculate;

import java.util.Scanner;

/**
 * 1. Write a java program using the following descriptions
 * 1. Create one package with name calculate
 * 2. Create two class with name “Calculator” and “Main”
 * 3. Create four methods with manes “addition”, “subtraction”, “division”, and “multiplication”. All methods are instance methods and it doesn’t return anything. But it has two parameters with the names “int a” and “int b”. Also each method has System.out.println(). This prints the result. Also create one more method with the name “calculateResult” with three parameters with name int a, int b and char symbol. Write the logic in the calculateResult method that when the user enters first number and second number and symbol based on symbol it does calculate.
 * 4. Write a “main” method into the main class. It has a scanner that takes user input. Also write the logic that it ask user to “Enter first Number:”, “Enter second Number:” “Please enter one of symbol +,-,*, /:” if user enter + symbol result like “Addition of 5 and 10 is: 15” and respective for other symbols.
 * 5. With the result it’s also print one more message “Would you like to do more calculation Please enter “Y” or “N” :” (Hint use while loop if user enter Y program asking the user to enter First Number, and if user enter N programme should terminate)
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char sign = 'Y';

        while (sign == 'Y' || sign == 'y') {
            System.out.println("Please enter First number:");
            int a = input.nextInt();
            System.out.println("Please enter Second number:");
            int b = input.nextInt();
            System.out.println("Please Enter one of Symbol (+,-,*,/) : ");
            char symbol = input.next().charAt(0);
            Calculator obj = new Calculator();
            obj.calculateResult(a, b, symbol);
            System.out.println("Would you like to do more calculation? Please enter “Y” or “N” :");
            sign = input.next().charAt(0);
        }
        input.close();
    }
}

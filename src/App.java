/*
 * Yuepeng Xiong
 * CSI 2300 - Metric Converter
 * 9/19/24
 * 
 * Ask for user input based on what metric unit they desire, then keep asking the user for inputs until enter a exit condition
 */
 import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int userInput; // for the decision of what metric conversion to do
        float numberToConvert = 0; //for the value of the imperial unit to convert to metric

        System.out.println("Welcome to Metric Converter.");
        System.out.println("Please enter the number of your desired conversion:");
        System.out.println("1: Miles to Kilometers");
        System.out.println("2: Fahrenheit to Celsius");
        System.out.println("3: Pounds to Stone");
        System.out.println("4: Pounds to Kilograms");
        userInput = scanner.nextInt();

        //Accepts input from 1-4 only. Anything outside does not pass the while loop.
        while(userInput < 1 || userInput > 4){
            System.out.println("Please enter a number between 1 to 4:");
            userInput = scanner.nextInt();
        }
        
        //This while loops now uses numberToConvert as its condition to exit the while loop. Uses userInput to determine 
        //the choice of the user from the first one.
        while(numberToConvert != -1){
            if (userInput == 1){
                System.out.print("Enter the miles you want to convert to kilometers (-1 to exit): ");
                numberToConvert = scanner.nextFloat();
                
                // this solves a bug when you input -1, it does the calculation of -1 and then exit
                if (numberToConvert == -1){ 
                    break;
                }

                System.out.println(numberToConvert + " miles converts to " + (numberToConvert * 1.60934) + " kilometers");
            } else if (userInput == 2) {
                System.out.print("Enter the tempurature in Fahrenheit to convert to Celsius (-1 to exit): ");
                numberToConvert = scanner.nextFloat();

                // this solves a bug when you input -1, it does the calculation of -1 and then exit
                if (numberToConvert == -1){
                    break;
                }

                System.out.println(numberToConvert + " degrees farenheit converts to " + ((numberToConvert - 32) / (1.8)) + " celsius");
            }  else if (userInput == 3) {
                System.out.print("Enter the pounds of the object to convert to stone (-1 to exit): ");
                numberToConvert = scanner.nextFloat();

                // this solves a bug when you input -1, it does the calculation of -1 and then exit
                if (numberToConvert == -1){
                    break;
                }

                System.out.println(numberToConvert + " pounds converts to " + (numberToConvert / 14) + " stone");
            } else if (userInput == 4) {
                System.out.print("Enter the pounds of the object to convet to kilograms (-1 to exit): ");
                numberToConvert = scanner.nextFloat();

                // this solves a bug when you input -1, it does the calculation of -1 and then exit
                if (numberToConvert == -1){
                    break;
                }

                System.out.println(numberToConvert + " pounds converts to " + (numberToConvert / 2.20462) + " kilograms");
            } else {

                //not even needed but it looks better with the else at the end
                System.out.println("There seems to be an error to the varible userInput. This program will exit");
                numberToConvert = -1;
            }//exit if
        }//exit while
        System.out.println("Program exited sucessfully.");
    }//exit main
}//exit class

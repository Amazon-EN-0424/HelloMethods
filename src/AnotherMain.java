import java.util.Arrays;
import java.util.Scanner;

public class AnotherMain {
    public static void main(String[] args) {


//        A program that will ask for a word / phrase and a letter. I will count how many times the letter is present in the input
//        input: Hello World
//        input: e
//        output 1
//        input: Hello World
//        input: l
//        output 3

//        String.valueOf(4l);
//        String name = "Salvatore";
//        name.length();
        var scanner = new Scanner(System.in);
        System.out.println("Enter the phrase you want to analyze");
        System.out.println("Type '/exit' to exit the program");
        var input = scanner.nextLine();
        while(!input.equalsIgnoreCase("/exit")){
//            ask the letter to be counted
            System.out.println("Enter a character to be looked for:");
            var letterToBeCounted = scanner.nextLine();
            if(letterToBeCounted.trim().length() == 1) {
                var validatedCharacter = letterToBeCounted.charAt(0);
                var result = StringAnalyzer.countSpecificCharactersInAString(input, validatedCharacter);
                System.out.println("We have found: " +
                        result + " matches for letter " + validatedCharacter) ;
            } else {
                System.out.println("Invalid input");
                input = scanner.nextLine();
            }

//            call our analysis method
//            return the result


        }

    }
}

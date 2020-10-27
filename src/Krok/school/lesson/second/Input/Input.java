package Krok.school.lesson.second.Input;

import java.util.Scanner;

public interface Input {
    static String inputString(String message){
        Scanner input = new Scanner(System.in);
        String line;
        try {
            System.out.println(message);
            line = input.nextLine();
            if (line.isEmpty()){
                throw new NullPointerException();
            }
        }   catch (NullPointerException e){
            System.out.println("Incorrect input. Enter a non-empty string.");
            line = inputString(message);
        }

        return line;
    }
}

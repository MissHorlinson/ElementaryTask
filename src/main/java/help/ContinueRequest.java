package help;

import java.util.Scanner;

public class ContinueRequest {

    public static boolean userAnswer(String action){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter y - Yes, if you want to continue " + action + "?");
        String answer = in.nextLine();
        answer = answer.toUpperCase();

        if(answer.equals("Y") || answer.equals("YES"))
            return true;
        else
            return false;
    }
}

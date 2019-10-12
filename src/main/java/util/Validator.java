package util;

public class Validator {
    public static boolean userAnswer(String action){

        Input input = new Input();
        Helper helper = new Helper();

        helper.continueRequest(action);
        String answer = input.getString();
        answer = answer.toUpperCase();

        if(answer.equals("Y") || answer.equals("YES"))
            return true;
        else
            return false;
    }
}

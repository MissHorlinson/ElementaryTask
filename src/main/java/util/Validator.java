package util;

public class Validator {

    public Validator() { }

    public boolean userAnswer(String answer) {
        answer = answer.toUpperCase();
        if(answer.equals("Y") || answer.equals("YES"))
            return true;
        else
            return false;
    }
}

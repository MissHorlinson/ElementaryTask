package servise;

import util.Helper;
import util.Input;
import util.Validator;

public class TaskChoice {

    public void runChosenTask(){
        boolean shouldContinue = true;
        Run run;
        Input input = new Input();

        while (shouldContinue) {

            Helper.startInstruction();
            int task = input.getInt();

            switch (task) {
                case 1:
                    Helper.chessBoardDescription();
                    run = new Run();
                    run.chessRun();
                    break;
                case 2:
                    Helper.envelopesCompareDescription();
                    run = new Run();
                    run.envelopeRun();
                    break;
            }
            shouldContinue = Validator.userAnswer("program");
        }
    }
}


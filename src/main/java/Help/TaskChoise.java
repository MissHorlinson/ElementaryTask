package Help;

import Help.ContinueRequest;
import Help.Run;

import java.util.Scanner;

public class TaskChoise {

    static Scanner in = new Scanner(System.in);
    int task;

    public TaskChoise() {}

    public TaskChoise(int task){
        this.task = task;
    }

    public int getTask() {return this.task; }

    public void  setTask(int number) {this.task = number; }

    public void runChosenTask(){
        boolean shouldContinue = true;
        Run run;


        while (shouldContinue) {
            System.out.println("Input:\n   1 for ChessBoard task\n   2 for Envelope compare task\n____________________________________");

            //Help.InstructionAndParse.isNumber();
            task = in.nextInt();

            switch (task) {
                case 1:
                    InstructionAndParse.chessBoardDescription();
                    run = new Run();
                    run.chessRun();
                    break;
                case 2:
                    InstructionAndParse.envelopesCompareDescription();
                    run = new Run();
                    run.envelopeRun();
                    break;
            }
            shouldContinue = ContinueRequest.userAnswer("program");
        }
    }
}


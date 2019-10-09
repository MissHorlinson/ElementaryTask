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
            task = in.nextInt();
            switch (task) {
                case 1:
                    Instruction.chessBoardDescription();
                    run = new Run();
                    run.chessRun();
                    break;
                case 2:
                    Instruction.envelopesCompareDescription();
                    run = new Run();
                    run.envelopeRun();
                    break;
            }
            shouldContinue = ContinueRequest.userAnswer("program");
        }
    }
}


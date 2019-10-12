package util;

import java.util.Scanner;

public class Input {
    Scanner scanner = new Scanner(System.in);

    public int getInt(){
        return scanner.nextInt();
    }

    public float getFloat(){
        return scanner.nextFloat();
    }

    public String getString(){
        return scanner.nextLine();
    }

    public String getNext(){
        return scanner.next();
    }

    public boolean isNext(){
        return scanner.hasNext();
    }
}

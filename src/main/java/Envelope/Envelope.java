package Envelope;

public class Envelope implements Comparable<Envelope> {
    float sideA;
    float sideB;
    float sideC;
    float sideD;

    float width;
    float height;

    public Envelope() { }

    public Envelope(float sideA, float sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }
  /*  public Envelope(float arr[])
    {
        this.sideA = arr[0];
        this.sideB = arr[1];
        this.sideC = arr[2];
        this.sideD = arr[3];
    }*/

    public float getSideA(){
        return this.sideA;
    }

    public float getSideB(){
        return this.sideB;
    }

    public float getSideC() { return this.sideC; }

    public float getSideD() { return this.sideD; }


    public float getHeight() {return this.height; }

    public float getWidth() {return this.width; }


    public void setSideA(float sideA) {this.sideA = sideA; }

    public void setSideB(float sideB) {this.sideB = sideB; }

    public void setSideC(float sideC) {this.sideC = sideC; }

    public void setSideD(float sideD) {this.sideD = sideD; }

   public void identifySide(){
       if(this.sideA > this.sideB){
           width = sideA;
           height = sideB;
       } else {
           width = sideB;
           height = sideA;
       }
   }

   //@Override
    public int compareTo(Envelope envelope) {
       identifySide();
       if(this.getHeight() > envelope.getHeight()) {
           if(this.getWidth() > envelope.getWidth()) {
               return 1;
           }
       }
       return 0;
   }


    /*public void compareMethod(){

        double diagonal1, diagonal2;

        diagonal1 = Math.sqrt((Math.pow(sideA, 2) + Math.pow(sideB, 2)));
        diagonal2 = Math.sqrt((Math.pow(sideC, 2) + Math.pow(sideD, 2)));

        if((sideA > sideC && sideB > sideD) || (sideA > sideD && sideB > sideC) ||
                (sideC > sideA && sideD > sideB) || (sideD > sideA && sideC > sideB) ||
                (sideA > diagonal2 && sideB > diagonal2) || (sideC > diagonal1 && sideD > diagonal1)){
            System.out.println("Yes you can input one envelope in the other");
        } else{
            System.out.println("No you can`t input one envelope in the other");
        }
    }*/
}

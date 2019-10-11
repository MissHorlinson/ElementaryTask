package envelope;

public class Envelope implements Comparable {
    private float sideA;
    private float sideB;
    private float width;
    private float height;

    public Envelope() { }

    public Envelope(float sideA, float sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public float getSideA(){
        return this.sideA;
    }

    public float getSideB(){
        return this.sideB;
    }

    public float getHeight() {return this.height; }

    public float getWidth() {return this.width; }

    public void setSideA(float sideA) {this.sideA = sideA; }

    public void setSideB(float sideB) {this.sideB = sideB; }


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
    public int compareTo(Object o) {
        Envelope envelope = (Envelope)o;
       identifySide();
       if(this.getHeight() > envelope.getHeight()) {
           if(this.getWidth() > envelope.getWidth()) {
               return 1;
           }
       }
       return 0;
   }
}

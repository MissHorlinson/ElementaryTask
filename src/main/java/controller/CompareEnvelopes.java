package controller;

import model.Envelope;
import util.Helper;
import util.Input;
import util.Output;


public class CompareEnvelopes {

    private static Input input = new Input();

    Envelope envelopeOne = new Envelope(envelope("first"), envelope("first"));

    Envelope envelopeTwo = new Envelope(envelope("second"), envelope("second"));


        public void envelopesCompare () {
            if (envelopeOne.compareTo(envelopeTwo) == 1) {
                System.out.println("Yes you can input one envelope in the other");
            } else if (envelopeTwo.compareTo(envelopeOne) == 1) {
                System.out.println("Yes you can input one envelope in the other");
            } else
                System.out.println("No you can`t input one envelope in the other");
        }

        public float envelope(String number){
            float sideValue = 0;
            Helper.envelopeInstruction(number);
            while (sideValue <= 0) {
                Output.negativeNumber();
                sideValue = input.getFloat();
            }
            return sideValue;
    }
}



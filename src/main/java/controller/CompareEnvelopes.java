package controller;
import servise.InstructionAndParse;
import model.Envelope;


public class CompareEnvelopes {

        Envelope envelopeOne = new Envelope(InstructionAndParse.envelope("first"),
                InstructionAndParse.envelope("first"));

        Envelope envelopeTwo = new Envelope(servise.InstructionAndParse.envelope("second"),
                servise.InstructionAndParse.envelope("second"));


        public void envelopesCompare () {
            if (envelopeOne.compareTo(envelopeTwo) == 1) {
                System.out.println("Yes you can input one envelope in the other");
            } else if (envelopeTwo.compareTo(envelopeOne) == 1) {
                System.out.println("Yes you can input one envelope in the other");
            } else
                System.out.println("No you can`t input one envelope in the other");
        }
}



package Envelope;
import Help.InstructionAndParse;


public class CompareEnvelopes {
    Envelope envelopeOne = new Envelope(InstructionAndParse.envelopeInstructionAndParse("first"),
            InstructionAndParse.envelopeInstructionAndParse("first"));

    Envelope envelopeTwo = new Envelope(Help.InstructionAndParse.envelopeInstructionAndParse("second"),
            Help.InstructionAndParse.envelopeInstructionAndParse("second"));

    public void envelopesCompare() {
        if (envelopeOne.compareTo(envelopeTwo) == 1) {
            System.out.println("Yes you can input one envelope in the other");
        } else if (envelopeTwo.compareTo(envelopeOne) == 1) {
            System.out.println("Yes you can input one envelope in the other");
        } else
            System.out.println("No you can`t input one envelope in the other");
    }
}



package controller;

import model.Envelope;
import util.*;

public class CompareEnvelopes {
    private Input  input = new Input();
    private Output output = new Output();
    private Parser parser = new Parser();

    public CompareEnvelopes() { }

    Envelope envelopeOne = new Envelope(envelope("first"), envelope("first"));
    Envelope envelopeTwo = new Envelope(envelope("second"), envelope("second"));

    public float envelope(String number) {
        float side = 0;
        output.envelopeInstruction(number);
        while (side <= 0) {
            output.negativeNumber();
            side = parser.toFloat(input.getString());
        }
        return side;
    }

    public void envelopesCompare () {
        if (envelopeOne.compareTo(envelopeTwo) == 1) {
            output.envelopeInput();
        } else if (envelopeTwo.compareTo(envelopeOne) == 1) {
            output.envelopeInput();
        } else
            output.envelopeNotInput();
    }
}



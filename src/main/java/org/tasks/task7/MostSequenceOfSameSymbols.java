package org.tasks.task7;

import org.tasks.exceptions.EmptyLineException;

public class MostSequenceOfSameSymbols {
    String line;

    public MostSequenceOfSameSymbols(String line) throws EmptyLineException {
        if (line.isEmpty()) {
            throw new EmptyLineException("Line is empty");
        }
        this.line = line;
    }

    public int lengthSequence() {
        int seqLength = 0, maxSeqLength = 0, lineLength = line.length();

        for (int currentSymbol = 0; currentSymbol < lineLength-1; currentSymbol++) {

            char cur = line.charAt(currentSymbol), next = line.charAt(currentSymbol + 1);

            if ((cur == next) && (seqLength != 0)) {
                seqLength++;
            } else if ((cur == next) && (seqLength == 0)) {
                seqLength = 2;
            } else {
                if (seqLength > maxSeqLength) {
                    maxSeqLength = seqLength;
                }
                seqLength = 0;
            }
        }
        return maxSeqLength;
    }
}

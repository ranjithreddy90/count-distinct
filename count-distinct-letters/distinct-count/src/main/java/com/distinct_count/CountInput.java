package com.distinct_count;
import java.util.ArrayList;

public class CountInput {
 
    private static final String inputMessage = "Received date range";
 
    public static void main(String[] args) {
        System.out.println(inputMessage);
        parseSentence(inputMessage);
    }
 
    public static String parseSentence(String sentence) {
        sentence = sentence + ".";
        String parsedSentence = "";
        StringBuffer stringBuffer = new StringBuffer();
        for (int loopCounter = 0; loopCounter < sentence.length(); loopCounter++) {
            if (!Character.isAlphabetic(sentence.charAt(loopCounter))
                    || sentence.charAt(loopCounter) == ' ') {
 
                int wordLength = stringBuffer.length();
                stringBuffer = new StringBuffer(parseWord(stringBuffer.toString()));
                while (stringBuffer.length() <= wordLength) {
                    stringBuffer.append(" ");
                }
                stringBuffer.setCharAt(wordLength, sentence.charAt(loopCounter));
                parsedSentence = parsedSentence.concat(stringBuffer.toString());
                stringBuffer.setLength(0);
            } else if (Character.isAlphabetic(sentence.charAt(loopCounter))) {
                stringBuffer.append(sentence.charAt(loopCounter));
 
            }
        }
        parsedSentence = parsedSentence.substring(0,
                parsedSentence.length() - 1);
        System.out.println(parsedSentence);
        return parsedSentence.trim();
    }
 
    private static String parseWord(String word) {
 
        ArrayList<Character> duplicateCharsList = new ArrayList<Character>();
        int distinctCharCount = 0;
        if (word.length() <= 2) {
            return word;
        }
        for (int loopCounter = 1; loopCounter < word.length() - 1; loopCounter++) {
            if (!duplicateCharsList.contains(word.charAt(loopCounter))) {
                duplicateCharsList.add(word.charAt(loopCounter));
                distinctCharCount++;
            }
        }
 
        return word.charAt(0) + Integer.toString(distinctCharCount)
                + word.charAt(word.length() - 1);
    
    }
}
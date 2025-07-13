package com.java.coding.problems;

import java.util.*;

public class WordLadder {

  static int wordLadder(List<String> inputList, String start, String target) {
    int res = 0;
    int startLength = start.length();
    Set<String> wordSet = new HashSet<>(inputList);
    Queue<String> wordsQueue = new LinkedList<>();

    wordsQueue.add(start);

    while (!wordsQueue.isEmpty()) {

      int length = wordsQueue.size();
      res++;

      for (int i = 0; i < length; i++) {
        String word = wordsQueue.poll();

        for (int j = 0; j < startLength; j++) {

          char[] wordArr = word.toCharArray();
          char ch = wordArr[j];

          for (char c = 'a'; c <= 'z'; c++) {
            wordArr[j] = c;
            String newWord = new String(wordArr);

            if (!wordSet.contains(newWord)) continue;

            if (newWord.equals(target)) return res + 1;

            wordSet.remove(newWord);

            wordsQueue.add(newWord);
          }

          wordArr[j] = ch;
        }
      }
    }
    return 0;
  }
}

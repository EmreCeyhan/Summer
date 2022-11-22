package com.sparta;

public class Summer {
    public static void main(String[] args) {
        int[] myInts = {1, 2, 3, 4, 5};
        String[] words = {"the", "cat", "in", "the", "hat", "that"};
        Summer summer = new Summer();
        System.out.println(summer.sumArray(myInts));

        System.out.println(countWords(words, 't'));
    }
    public static int sumArray(int[] theInts){
        int total = 0;
        for (int i = 0; i < theInts.length; i++)
            total += theInts[i];

        return total;
    }
    public static int countWords(String[] strings, char c)
    {
        int counter = 0;
        for(int i = 0; i < strings.length; i++)
        {
            char firstLetter = strings[i].charAt(0);
            if(firstLetter == c)
            {
                counter++;
            }
        }
        return counter;
    }
}

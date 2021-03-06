/*
Number letter counts
Problem 17

If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.

If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?

NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. The use of "and" when writing out numbers is in compliance with British usage.
/*

import java.io.*;
import java.lang.Math;

public class problem17
{
  public static void main(String[] args)
  {
    long totalLetters=0;
    for (int i=1;i<=1000;i++)
    {
      String temp = toWords(i);
      totalLetters += temp.length();
    }
    System.out.println(totalLetters);
  }
  
  private static String toWords(int x)
  {
    String[] underTen = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    String[] tenToTwenty = {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
    String[] byTens = {"zero","ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
    String and = "and";
    String hundred = "hundred";
    String thousand = "thousand";
    
    if (x==1000)
      return underTen[1]+thousand;
    
    String answer = "";
    boolean aboveHundred = false;
    
    if (x>99)
    {
      int temp = (int)(x/100);
      x = x%100;
      answer+=underTen[temp]+hundred;
      aboveHundred = true;
    }
      if (x>19)
      {
        if (aboveHundred)
          answer+=and;
        int temp = (int)(x/10);
        answer+=byTens[temp];
        x = x%10;
        if (x!=0)
          answer+=underTen[x];
      }
      else if (x>9)
      {
        if (aboveHundred)
          answer+=and;
        x%=10;
        answer+=tenToTwenty[x];
      }
      else if (x>0)
      {
        if (aboveHundred)
          answer+=and;
        answer+=underTen[x];
      }
      
      return answer;
  }
}

/*
Largest palindrome product
Problem 4

A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
*/

import java.io.*;
import java.math.*;
import java.util.Vector;

public class problem4
{
  public static void main(String[] args)
  {
    int max=0;
    for (int num1=999; num1>99; num1--)
    {
      for (int num2=999; num2>99; num2--)
      {
        int testNum=num1*num2;
        if (isPalindrome(testNum))
        {
          if (testNum > max)
          {
            max=testNum;
          }
        }
      }
    }
    System.out.println(max);
  }
  
  private static boolean isPalindrome(int x)
  {
    Vector<Integer> num = arrayOfNumber(x);
    int i=0;
    int j=num.size()-1;
    if (j%2==0)
    {
      while (i<j)
      {
        if (num.get(i)!=num.get(j))
        {
          return false;
        }
        i++;
        j--;
      }
    }
    else
    {
      while (i!=j)
      {
        if (num.get(i)!=num.get(j))
        {
          return false;
        }
        i++;
        j--;
      }
    }
    return true;
  }
  
  private static Vector<Integer> arrayOfNumber(int x)
  {
    Vector<Integer> num = new Vector<Integer>();
    while (x != 0)
    {
      num.add(0, x%10);
      Math.floor(x/10);
    }
    return num;
  }
}

/*
Smallest multiple
Problem 5

2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/

import java.io.*;
import java.math.*;

public class problem5
{
  public static void main(String[] args)
  {
    int num=0;
    for (int i=1; i>0; i++)
    {
      num=(20*i);
      for (int j=19; j>2; j--)
      {
        if ((j==5) || (j==10))
          continue;
        if (num%j!=0)
          break;
        if (j==3)
        {
          System.out.println(num);
        }
      }
    }
  }
}

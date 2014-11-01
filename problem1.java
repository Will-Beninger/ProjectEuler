/*
Multiples of 3 and 5
Problem 1

If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
*/

import java.io.*;

public class problem1
{
  public static void main(String[] args)
  {
    int answer=0;
    for (int i=3; i<1000; i+=3)
    {
      answer+=i;
    }
    for (int i=5; i<1000; i+=5)
    {
      if (!(i%3==0))
        answer+=i;
    }
    System.out.println(answer);
  }
}

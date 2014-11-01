/*
Special Pythagorean triplet
Problem 9

A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
a2 + b2 = c2

For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
*/

import java.io.*;
import java.lang.Math;

public class problem9
{
  public static void main(String[] args)
  {
    for (int a=1; a<999; a++)
    {
      for (int b=2; b<999; b++)
      {
        if ((a+b)>=1000)
          break;
        double c = (a*a)+(b*b);
        c=Math.sqrt(c);
        if ((c%1 == 0) && ((a+b+c) == 1000))
        {
          System.out.println(a*b*(int)c);
          System.exit(1);;
        }
      }
    }
  }
}

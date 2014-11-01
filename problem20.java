/*
Factorial digit sum
Problem 20

n! means n × (n − 1) × ... × 3 × 2 × 1

For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

Find the sum of the digits in the number 100!
*/

import java.io.*;
import java.math.BigInteger;

public class problem20
{
  public static void main(String[] args)
  {
      BigInteger result = BigInteger.valueOf(100);
      BigInteger total = BigInteger.valueOf(0);
      for (int i = 99;i>1;i--)
      {
         result = result.multiply(BigInteger.valueOf(i));
      }
      while(!result.equals(BigInteger.valueOf(0)))
      {
         BigInteger[] temp = result.divideAndRemainder(BigInteger.valueOf(10));
         result = temp[0];
         total = total.add(temp[1]);
      }
      System.out.println(total.toString());
   }
}

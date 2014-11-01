/*
Power digit sum
Problem 16

215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

What is the sum of the digits of the number 21000?
*/

import java.io.*;
import java.lang.Math;
import java.math.BigInteger;

public class problem16
{
  public static void main(String[] args)
  {
    BigInteger a = (BigInteger.valueOf(2)).pow(1000);
    BigInteger sumOfDigits = BigInteger.ZERO;
    while (a.compareTo(BigInteger.ZERO)!=0)
    {
      BigInteger[] step = a.divideAndRemainder(BigInteger.valueOf(10));
      sumOfDigits = sumOfDigits.add(step[1]);
      a = step[0];
    }
    System.out.println(sumOfDigits);
  }
}

/*
Summation of primes
Problem 10

The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
*/

import java.io.*;
import java.lang.Math;

public class problem10
{
  public static void main(String[] args)
  {
    long answer=0;
    for (int i=2; i<2000000; i++)
    {
      if (isPrime(i))
        answer+=i;
    }
    System.out.println(answer);
  }
  private static boolean isPrime(long x)
  {
    for (long n=2; n*n<=x; n++)
    {
      if (x%n==0)
      {
        return false;
      }
    }
    return true;
  }
}

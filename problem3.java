/*
Largest prime factor
Problem 3

The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
*/

import java.io.*;
import java.math.*;

public class problem3
{
  public static void main(String[] args)
  {
    long start = 600851475143L;
    for (long n=2; n*n<=start; n++)
    {
      if (start%n==0 && isPrime(n))
      {
        System.out.println(n);
      }
    }
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

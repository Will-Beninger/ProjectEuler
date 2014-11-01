/*
Longest Collatz sequence
Problem 14

The following iterative sequence is defined for the set of positive integers:

n → n/2 (n is even)
n → 3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:
13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1

It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?

NOTE: Once the chain starts the terms are allowed to go above one million.
*/

import java.io.*;
import java.lang.Math;

public class problem14
{
  public static void main(String[] args)
  {
    long longestChainNum=0;
    int longestChain=0;
    for (long x = 999999L; x>0L; x--)
    {
      long test = x;
      int chain = 0;
      while (test!=1)
      {
        if (test%2==0)
          test/=2;
        else
          test = (test*3)+1;
        chain++;
      }
      if (chain>longestChain)
      {
        longestChain=chain;
        longestChainNum = x;
      }
    }
    
    System.out.println(longestChainNum);
  }
}

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
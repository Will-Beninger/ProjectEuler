import java.io.*;
import java.math.*;

public class problem7
{
  public static void main(String[] args)
  {
    int counter=0;
    for (int i=2; i>0; i++)
    {
      if (isPrime(i))
      {
        counter++;
        if (counter==10001)
        {
          System.out.println(i);
          break;
        }
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
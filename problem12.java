import java.io.*;
import java.lang.Math;

public class problem12
{
  public static void main(String[] args)
  {
    int i = 1;
    int j = 1;
    boolean found = false;
    while (!found)
    {
      if (divisors(i) > 500)
      {
        System.out.println(i);
        found = true;
      }
      else
      {
        i=((j)*(j+1))/2;
        j++;
      }
    }
  }
  
  public static int divisors (int n)
  {
    int counter = 0;
    for (int i = 1; i*i <= n; i++)
    {
      if (n % i == 0)
        counter+=2;
    }
    return counter;
  }
}
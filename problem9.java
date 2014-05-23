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
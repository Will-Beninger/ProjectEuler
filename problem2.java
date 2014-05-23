import java.io.*;

public class problem2
{
  public static void main(String[] args)
  {
    long answer=0L;
    long one=1L;
    long two=2L;
    long max = 4000000L;
    while (two < max)
    {
      if (two%2==0)
        answer+=two;
      long temp = one + two;
      one = two;
      two = temp;
    }
    System.out.println(answer);
  }
}
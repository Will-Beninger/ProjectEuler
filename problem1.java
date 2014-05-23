import java.io.*;

public class problem1
{
  public static void main(String[] args)
  {
    int answer=0;
    for (int i=3; i<1000; i+=3)
    {
      answer+=i;
    }
    for (int i=5; i<1000; i+=5)
    {
      if (!(i%3==0))
        answer+=i;
    }
    System.out.println(answer);
  }
}
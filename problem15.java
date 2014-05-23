import java.io.*;
import java.lang.Math;

public class problem15
{
  public static void main(String[] args)
  {
    myGrid15 twentyByTwenty = new myGrid15(20, 20);
    
    for (int i=0;i<=20;i++)
    {
      System.out.println(twentyByTwenty.getPath(i,20-i));
    }
  }
}
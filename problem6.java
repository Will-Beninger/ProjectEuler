import java.io.*;
import java.math.*;

public class problem6
{
  public static void main(String[] args)
  {
    long sumOfSquares=0;
    long squareOfSums=0;
    for (int i=0; i<=100; i++)
    {
      sumOfSquares+=(i*i);
      squareOfSums+=i;
    }
    squareOfSums*=squareOfSums;
    System.out.println((squareOfSums-sumOfSquares));
  }
}
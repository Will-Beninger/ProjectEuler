import java.io.*;
import java.math.BigInteger;

public class problem20
{
  public static void main(String[] args)
  {
      BigInteger result = BigInteger.valueOf(100);
      BigInteger total = BigInteger.valueOf(0);
      for (int i = 99;i>1;i--)
      {
         result = result.multiply(BigInteger.valueOf(i));
      }
      while(!result.equals(BigInteger.valueOf(0)))
      {
         BigInteger[] temp = result.divideAndRemainder(BigInteger.valueOf(10));
         result = temp[0];
         total = total.add(temp[1]);
      }
      System.out.println(total.toString());
   }
}

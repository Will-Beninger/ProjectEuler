import java.io.*;
import java.lang.Math;

public class problem67
{
  public static void main(String[] args)
  {
    //15 being the number of rows
    long[][] pyramidArray = new long[100][];
    BufferedReader br = null;
    File pyramidFile = new File("problem67.txt");
    if (!(pyramidFile.exists()))
      System.exit(-1);
    try
    {
      br = new BufferedReader(new FileReader(pyramidFile));
      String line;
      String delim = "[ ]";
      int ctr = 0;
      while ((line=br.readLine()) != null)
      {
        String[] tokens = line.split(delim);
        long[] tempArray = new long[tokens.length];
        for (int i=0; i<tokens.length; i++)
        {
          tempArray[i] = (Long.parseLong(tokens[i]));
        }
        pyramidArray[ctr++] = tempArray;
      }
    } catch (IOException ex)
    {
      //report
    } finally
    {
      try {
        br.close();
      } catch (Exception ex) {}
    }
    
    //Flatten Triangle
    for (int curRow=pyramidArray.length-2; curRow >= 0; curRow--)
    {
      for (int column=0; column<pyramidArray[curRow].length; column++)
      {
        pyramidArray[curRow][column] += Math.max(pyramidArray[curRow+1][column],pyramidArray[curRow+1][column+1]);
      }
    }
    System.out.println(pyramidArray[0][0]);
  }
}
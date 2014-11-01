/*
Maximum path sum II
Problem 67

By starting at the top of the triangle below and moving to adjacent numbers on the row below, the maximum total from top to bottom is 23.

3
7 4
2 4 6
8 5 9 3

That is, 3 + 7 + 4 + 9 = 23.

Find the maximum total from top to bottom in triangle.txt (right click and 'Save Link/Target As...'), a 15K text file containing a triangle with one-hundred rows.

NOTE: This is a much more difficult version of Problem 18. It is not possible to try every route to solve this problem, as there are 299 altogether! If you could check one trillion (1012) routes every second it would take over twenty billion years to check them all. There is an efficient algorithm to solve it. ;o)
*/

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

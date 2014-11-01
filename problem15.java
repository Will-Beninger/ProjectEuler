/*
Lattice paths
Problem 15

Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, there are exactly 6 routes to the bottom right corner.

How many such routes are there through a 20×20 grid?
*/

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

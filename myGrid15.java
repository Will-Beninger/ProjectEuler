/*
Lattice paths
Problem 15

Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, there are exactly 6 routes to the bottom right corner.

How many such routes are there through a 20×20 grid?
*/

public class myGrid15
{
  private int xSize, ySize;
  private myPoint15 origin, end;
  
  public myGrid15(int x, int y)
  {
    xSize=x;
    ySize=y;
    
    //Create origin
    origin = new myPoint15(null, null);
    origin.setPaths(1);
    
    //Create first column
    myPoint15 columnIterator = null;
    for (int j=ySize; j>=0; j--)
    {
      if (j==ySize)
        columnIterator = origin;
      else
        columnIterator = new myPoint15(null, columnIterator);
    }
    
    //Create an iterator to follow on the left hand side to do linking
    myPoint15 leftSideIterator = null;
    myPoint15 topOfLastColumn = null;
    columnIterator = null;
    for (int i=1; i<=xSize; i++)
    {
      if (i==1)
      {
        leftSideIterator = origin;
      }
      else
      {
        leftSideIterator = topOfLastColumn;
      }
      for (int j=ySize; j>=0; j--)
      {
        if (j==ySize)
        {
          columnIterator = new myPoint15(leftSideIterator, null);
          topOfLastColumn = columnIterator;
        }
        else
        {
          columnIterator = new myPoint15(leftSideIterator, columnIterator);
        }
        
        if (j!=0)
        {
          leftSideIterator = leftSideIterator.getCD();
        }
      }
    }
    
    end = columnIterator;
  }
  
  public long totalPaths()
  {
    return end.getPaths();
  }
  
  public long getPath(int x, int y)
  {
    myPoint15 iterator = origin;
    for (int i=0;i<x;i++)
    {
      iterator = iterator.getCR();
    }
    for (int j=ySize; j>y; j--)
    {
      iterator = iterator.getCD();
    }
    return iterator.getPaths();
  }
}

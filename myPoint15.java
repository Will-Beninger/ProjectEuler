public class myPoint15
{
  private myPoint15 parentLeft, parentUp;
  private myPoint15 childRight, childDown;
  private long paths;
  
  public myPoint15 (myPoint15 pl, myPoint15 pu)
  {
    paths = 0;
    if (pl != null)
    {
      parentLeft = pl;
      parentLeft.setCR(this);
      paths += parentLeft.getPaths();
    }
    if (pu != null)
    {
      parentUp = pu;
      parentUp.setCD(this);
      paths += parentUp.getPaths();
    }
  }
  
  public long getPaths() {return paths;}
  public void setPaths(long p) {paths=p;}
  
  public myPoint15 getPL() {return parentLeft;}
  public myPoint15 getPU() {return parentUp;}
  public void setPL(myPoint15 p) {parentLeft=p;}
  public void setPU(myPoint15 p) {parentUp=p;}
  
  public myPoint15 getCR() {return childRight;}
  public myPoint15 getCD() {return childDown;}
  public void setCR(myPoint15 p) {childRight=p;}
  public void setCD(myPoint15 p) {childDown=p;}
  
  public void recalcPaths()
  {
    paths = 0;
    if (parentLeft != null)
    {
      paths += parentLeft.getPaths();
    }
    else if (parentUp != null)
    {
      paths += parentUp.getPaths();
    }
  }
}
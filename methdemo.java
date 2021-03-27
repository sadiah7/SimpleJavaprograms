class demo //method overloading example 
{
  //int a,b,c;
  void add(int x)
  {
    //a=x;
    System.out.println("add = " + (x+x));
  }
  void add(int x,int y)
  {
    //a=x;
    //b=y;
    System.out.println("add = " + (x+y));
  }
  void add(int x,int y, int z)
  {
    //a=x;
    //b=y;
    //c=z;
    System.out.println("add = " + (x+y+z));
  }
}
class methdemo
{
  public static void main(String args[])
  {
    demo d1 = new demo();
    d1.add(10);
    d1.add(10,20);
    d1.add(10,20,30);
  }
}

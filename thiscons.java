class thisdemo
{
  int a;
  thisdemo()
  {
    a=10;
    System.out.println(a);
  }
  thisdemo(int x)
  {
    this(); //should be first statement of the code
// this() -> it calls the default constructor
    a=x;
    System.out.println(a);
  }
}
class thiscons
{
  public static void main(String[] args)
  {
  //thisdemo d1 = new thisdemo();
  thisdemo d2 = new thisdemo(100);
  }
}
// output of the program is
//10
//100

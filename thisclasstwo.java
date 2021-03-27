class thisdemo
{
  int a;
  void show(int x)
  {
    a = x;
  }
  void show()
  {
    this.show(200); // control goes to show(int x)
    // hence a gets value 200 then control returns back to this function
    System.out.println("a =" + a);
  }
}
class thisclasstwo
{
  public static void main(String[] args)
  {
  thisdemo d1 = new thisdemo();
  d1.show();
  }
}
// output is 200

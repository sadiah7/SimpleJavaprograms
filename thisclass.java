class thisdemo
{
  int a;
  void set(int a)
  {
    this.a = a; //it shows class instance variable value is equal to reference value
  }
  void show()
  {
    System.out.println("a =" + a);
  }
}
class thisclass
{
  public static void main(String[] args)
  {
  thisdemo d1 = new thisdemo();
  d1.set(100);
  d1.show();
  }
}

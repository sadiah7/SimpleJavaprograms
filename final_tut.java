final class A
{
  void show()
  {
  }
}
class B extends A
{
  void show()
  {
  }
}
class final_tut
{
  public static void main(String[] args) {
    final int a = 100; // like const keyword in C
    // a = 20;
    /* final_tut.java:5: error: cannot assign a value to
final variable a
    a = 20;
    ^  */
    System.out.println(a);
  }
}
/*
if method inside class A is declared as final
final_tut.java:9: error: show() in B cannot overri
de show() in A
  void show()
       ^
  overridden method is final
1 error
*/

/*
if class A is declared as final
final_tut.java:7: error: cannot inherit from final
 A
class B extends A
                ^
1 error
*/

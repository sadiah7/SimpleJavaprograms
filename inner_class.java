abstract class car
{
  abstract void method1();
}
 // class outer
 // {
 //   int b =10;
 //    class inner
 //   {
 //     int a = 20;
 //     void innermethod()
 //     {
 //       System.out.println("innerclass innermethod");
 //     }
 //   }
 // }
class inner_class
{
  public static void main(String[] args)
  {
    // when class is static we declare it like this
    //outer.inner obj = new outer.inner();

    //when class is non static
    // outer obj = new outer();
    // outer.inner obj1 = obj.new inner();
    // obj1.innermethod();
    // System.out.println(obj1.a);
    // // cannot access data of outer class using inner class
    car c1 = new car()
    {
      public void method1()
      {
        System.out.println("anonymous class method");
      }
    };
    c1.method1();
  }
}

class prog3
{
  public static void main(String[] args) {
    int a[] = {10,20,30,40};
    double sum=0,avg;
    for(int i=0;i<4;i++)
    {
      sum = sum + a[i];
    }
    avg = sum / 4;
    System.out.println("sum = " + sum + " avg = " +avg);
  }
}

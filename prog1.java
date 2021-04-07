class prog1
{
  public static void main(String[] args) {
    int count =0 ,sum=0;
    for(int i =100;i<200;i++)
    {
      if(i%7==0)
      {
        count++;
        sum = sum + i;
      }
    }
    System.out.println("total number is = "+count);
    System.out.println("sum = "+sum);
  }
}

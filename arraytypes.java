class arraytypes
{
  public static void main(String[] args)
  {
    int arr[] = new int[7];
    arr[0]=100; // multiplied every element by 10
    arr[1]=200;
    arr[2]=300;
    arr[3]=400;
    arr[4]=500;
    for(int i=0;i<arr.length;i++)
    {
      System.out.println(arr[i]);
    }
    int a[][] = new int[3][2];
    a[0][0]=1;
    a[0][1]=2;
    a[1][0]=3;
    a[1][1]=4;
    a[2][0]=5;
    a[2][1]=6;
    for(int i=0;i<a.length;i++)
    {
      for(int j=0;j<a[i].length;j++)
      {
        System.out.print(a[i][j]);
      }
      System.out.println();
    }
    int ar[][] = new int[3][];
    ar[0] = new int [1];
    ar[1] = new int[2];
    ar[2] = new int[3];
    ar[0][0]=1;
    ar[1][0]=2;
    ar[1][1]=3;
    ar[2][0]=4;
    ar[2][1]=5;
    ar[2][2]=6;
    for(int i=0; i < ar.length;i++)
    {
      for(int j=0; j< ar[i].length;j++)
      {
        System.out.print(ar[i][j]);
      }
      System.out.println();
    }
  }
}

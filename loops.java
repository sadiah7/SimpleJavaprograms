class loops
{
    public static void main(String args[])
    {
       int n=5,i;
       i=1;
       while(i<=n)
       {
         System.out.println(i + "while loop");
         i++;
       }
       i=1;
       do
       {
        System.out.println(i + "do while loop");
        i++;
       } while (i<=n);

       for(i=1; i<=n ;i++)
       {
         System.out.println(i + "for loop");
       }
    }
}

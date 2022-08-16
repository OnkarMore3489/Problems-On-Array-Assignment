/*
3. Write Java program which accept N numbers from user and display 
all such elements which are even and divisible by 5.
Input : N : 6
Elements :85 66 3 80 93 88
Output : 80
 */
import java.util.Scanner;
class program32_3
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iSize=0,i=0;
        System.out.println("Enter the size : ");
        iSize=sobj.nextInt();
     
        int Arr[]=new int[iSize];

        System.out.println("Enter the Elements : ");
        for(i=0;i<Arr.length;i++)
        {
          Arr[i]=sobj.nextInt();
        }
         
        ArrayDemo adobj = new ArrayDemo();
        adobj.Display(Arr);
    }
}
class ArrayDemo
{
    public void Display(int Brr[])
    {
        int i=0;
        for(i=0;i<Brr.length;i++)
        {
            if(Brr[i]%5==0 && Brr[i]%2==0)
            {
                System.out.print(Brr[i]+" ");
            }
        }
    }
}
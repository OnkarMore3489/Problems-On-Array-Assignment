/*
1. Write Java program which accept N numbers from user and return 
difference between summation of even elements and summation of 
odd elements.
Input : N : 6
Elements :85 66 3 80 93 88
Output : 53 (234 - 181)
 */
import java.util.Scanner;
class program32_1
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iSize=0,i=0,iRet;
        System.out.println("Enter the size : ");
        iSize=sobj.nextInt();
     
        int Arr[]=new int[iSize];

        System.out.println("Enter the Elements : ");
        for(i=0;i<Arr.length;i++)
        {
          Arr[i]=sobj.nextInt();
        }
         
        ArrayDemo adobj = new ArrayDemo();
         iRet=adobj.Difference(Arr);
         System.out.println("Difference between summation of even number and summetion of odd number is :"+iRet);
    }
}
class ArrayDemo
{
    public int Difference(int Brr[])
    {
        int SumEven=0,SumOdd=0,i=0;
        for(i=0;i<Brr.length;i++)
        {
            if(Brr[i]%2==0)
            {
                SumEven+=Brr[i];
            }
            else
            {
                SumOdd+=Brr[i];
            }
        }
        return SumEven-SumOdd;
    }
}
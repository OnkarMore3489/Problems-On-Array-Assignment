/*
1. Write java program which accept N numbers from user and accept 
one another number as NO , check whether NO is present or not.
Input : N : 6
NO: 66
Elements :85 66 3 66 93 88
Output : TRUE
Input : N : 6
NO: 12
Elements :85 11 3 15 11 111
Output : FALSE
 */
import java.util.Scanner;
class program34_1
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iSize=0,iValue=0,i=0;
        boolean bRet=false;

        System.out.println("Enter the size : ");
        iSize=sobj.nextInt();
        
        int Arr[] = new int[iSize];

        System.out.println("Enter the elements : ");
        for(i=0;i<Arr.length;i++)
        {
            Arr[i]=sobj.nextInt();
        }
        System.out.println("Enter that Number which u want to check that number is present or not");
        iValue=sobj.nextInt();
        
        Number nobj = new Number();
        bRet=nobj.Check(Arr,iValue);
        if(bRet==true)
        {
            System.out.println("Number is present");
        }
        else
        {
            System.out.println("Number is Not present");
        }
    }
}
class Number
{
    public boolean Check(int Brr[],int iNo)
    {
        int i=0;
        boolean bResult=false;
        for(i=0;i<Brr.length;i++)
        {
            if(Brr[i]==iNo)
            {
              bResult=true;
              break;
            }
            else
            {
                bResult=false;
            }
        }
        return bResult;
    }
}
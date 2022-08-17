/*
5. Write java program which accept N numbers from user and return 
product of all odd elements.
Input : N : 6
Elements :15 66 3 70 10 88
Piyush Khairnar : 7588945488 आम्ही Technical संस्कार करतो !!! ©Marvellous Infosystems Page 3
Marvellous Logic Building Assignment : 34 
Output : 45
Input : N : 6
Elements :44 66 72 70 10 88
Output : 0
 */
import java.util.Scanner;
class program34_1
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iSize=0,i=0;
        int iRet=0;

        System.out.println("Enter the size : ");
        iSize=sobj.nextInt();
        
        int Arr[] = new int[iSize];

        System.out.println("Enter the elements : ");
        for(i=0;i<Arr.length;i++)
        {
            Arr[i]=sobj.nextInt();
        }

        Number nobj = new Number();
        iRet=nobj.Product(Arr);
        System.out.println("product of odd numbers is : "+iRet);
    }
}
class Number
{
    public int Product(int Brr[])
    {
        int i=0;
        int iResult=0,mult=1;
        for(i=0;i<Brr.length;i++)
        {
            if(Brr[i]%2!=0)
            {
                iResult=mult*=Brr[i];
            }
        }
        return iResult;
    }
}
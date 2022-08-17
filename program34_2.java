/*
2. Write java program which accept N numbers from user and accept 
one another number as NO , return index of first occurrence of that 
NO.
Input : N : 6
NO: 66
Elements :85 66 3 66 93 88
Output : 1
Input : N : 6
Piyush Khairnar : 7588945488 आम्ही Technical संस्कार करतो !!! ©Marvellous Infosystems Page 1
Marvellous Logic Building Assignment : 34 
NO: 12
Elements :85 11 3 15 11 111
Output : -1
 */
import java.util.Scanner;
class program34_2
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iSize=0,iValue=0,i=0;
        int iRet=0;

        System.out.println("Enter the size : ");
        iSize=sobj.nextInt();
        
        int Arr[] = new int[iSize];

        System.out.println("Enter the elements : ");
        for(i=0;i<Arr.length;i++)
        {
            Arr[i]=sobj.nextInt();
        }
        System.out.println("Enter that Number which u want to find First Occurence : ");
        iValue=sobj.nextInt();
        
        Number nobj = new Number();
        iRet=nobj.FirstOcc(Arr,iValue);
        System.out.println("First occurence of number is : "+iRet);
    }
}
class Number
{
    public int FirstOcc(int Brr[],int iNo)
    {
        int i=0;
        int iResult=0;
        for(i=0;i<Brr.length;i++)
        {
            if(Brr[i]==iNo)
            {
              iResult=i;
              break;
            }
            else
            {
                iResult=-1;
            }
        }
        return iResult;
    }
}
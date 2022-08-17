/*
3. Write java program which accept N numbers from user and accept 
one another number as NO , return index of last occurrence of that NO.
Input : N : 6
NO: 66
Elements :85 66 3 66 93 88
Output : 3
Input : N : 6
NO: 93
Elements :85 66 3 66 93 88
Output : 4
Input : N : 6
NO: 12
Elements :85 11 3 15 11 111
Output : -1
 */
import java.util.Scanner;
class program34_3
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
        iRet=nobj.LastOcc(Arr,iValue);
        System.out.println("Last occurence of number is : "+iRet);
    }
}
class Number
{
    public int LastOcc(int Brr[],int iNo)
    {
        int i=0;
        int iResult=-1;
        for(i=0;i<Brr.length;i++)
        {
            if(Brr[i]==iNo)
            {
              iResult=i;
            }
        }
        return iResult;
    }
}


// class Number
// {
//     public int LastOcc(int Brr[],int iNo)
//     {
//         int i=0;
//         int iResult=-1;
//         for(i=Brr.length-1;i>=0;i--)
//         {
//             if(Brr[i]==iNo)
//             {
//               iResult=i;
//               break;
//             }
//         }
//         return iResult;
//     }
// }
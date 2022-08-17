/*
4. Write java program which accept N numbers from user and accept 
Range, Display all elements from that range
Input : N : 6
Start: 60
End : 90
Elements :85 66 3 76 93 88
Output : 66 76 88
Input : N : 6
Start: 30
End : 50
Elements :85 66 3 76 93 88
Output :
 */
import java.util.Scanner;
class program34_3
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iSize=0,iStart=0,iEnd=0,i=0;
        int iRet=0;

        System.out.println("Enter the size : ");
        iSize=sobj.nextInt();
        
        int Arr[] = new int[iSize];

        System.out.println("Enter the elements : ");
        for(i=0;i<Arr.length;i++)
        {
            Arr[i]=sobj.nextInt();
        }
        System.out.println("Enter the Range : ");
        iStart=sobj.nextInt();
        iEnd=sobj.nextInt();
        
        Number nobj = new Number();
        nobj.Display(Arr,iStart,iEnd);
    }
}
class Number
{
    public void Display(int Brr[],int iNo1,int iNo2)
    {
        int i=0;
        int iResult=-1;
        for(i=0;i<Brr.length;i++)
        {
            if(Brr[i]>=iNo1 && Brr[i]<=iNo2)
            {
              System.out.print(Brr[i]+" ");
            }
        }
    }
}
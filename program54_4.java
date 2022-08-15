/*
 4. Write Java program which accept array of characters from user and 
return difference between frequency of capital and frequency of small 
characters.
Input : b N e B R b A I O G i
Output : 3 (7 - 4)
 */
import java.util.*;

class program54_4
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        int size1=0;
        System.out.println("Enter size1 : ");
        size1=sobj.nextInt();
        Calculate cobj = new Calculate(size1);
        cobj.Accept();
        int cnt=cobj.Difference();
        System.out.println("difference between frequency of capital and frequency of small characters : "+cnt);    
    }
}
class ArrayX
{
    public char Arr[];

    public ArrayX(int size1)
    {
        Arr=new char[size1];
    }
    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        char c='\0';

        System.out.println("Enter the Character String in 1st Array : ");
        Arr=sobj.next().toCharArray();

        for(int i=0;i<Arr.length;i++)
        {
            System.out.println(Arr[i]);
        }
    }
    public void Display()
    {
        for(int i=0;i<Arr.length;i++)
        {
            System.out.print(Arr[i]+" ");
        }
    }
}
class Calculate extends ArrayX
{
    public Calculate(int size1)
    {
        super(size1);
    }
    public int Difference()
    {   
        int iCnt1=0,iCnt2=0;

        for(int i=0;i<Arr.length;i++)
        {
           if(Arr[i] >='A' && Arr[i] <='Z')
           {
            iCnt1++;
           }
           else if(Arr[i] >='a' && Arr[i] <='z')
           {
            iCnt2++;
           }
        }
        return iCnt1-iCnt2;
    }
}

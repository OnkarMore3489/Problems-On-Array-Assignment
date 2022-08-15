/*
 1. Write java program which accept array from user and reverse each 
number of that array.
Input : 89 687 56 549 87 9
Output : 98 786 65 945 78 9
 */
import java.util.*;

class program53_1
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        int size1=0;
        System.out.println("Enter size1 : ");
        size1=sobj.nextInt();

        Calculate cobj = new Calculate(size1);
        cobj.Accept();
        cobj.Reverse();
    }
}
class ArrayX
{
    public int Arr[];

    public ArrayX(int size1)
    {
        Arr=new int[size1];
    }
    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Element in 1st Array : ");
        for(int i=0;i<Arr.length;i++)
        {
            Arr[i]=sobj.nextInt();
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
    public void Reverse()
    {
        for(int i=0;i<Arr.length;i++)
        {
            int idigit=0,iRev=0;
            while(Arr[i]!=0)
            {
                idigit=Arr[i]%10;
                iRev=(iRev*10)+idigit;
                Arr[i]/=10;
            }
            Arr[i]=iRev;
        }
        System.out.println("Reversed Array is : ");
        super.Display();
    }
}
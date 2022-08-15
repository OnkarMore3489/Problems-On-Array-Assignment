/*
 2. Write a java program which accept two two arrays from user and 
display minimum element of each array.
Input : 2 9 7 5 2 3
        9 3 5 5
Output : 2 3
 */
import java.util.*;

class program52_2
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        int size1=0,size2=0;
        System.out.println("Enter size1 : ");
        size1=sobj.nextInt();
        System.out.println("Enter size2 : ");
        size2=sobj.nextInt();

        Calculate cobj = new Calculate(size1, size2);
        cobj.Accept();
        cobj.Minimum();
    }
}
class ArrayX
{
    public int Arr[];
    public int Brr[];

    public ArrayX(int size1,int size2)
    {
        Arr=new int[size1];
        Brr=new int[size2];
    }
    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Element in 1st Array : ");
        for(int i=0;i<Arr.length;i++)
        {
            Arr[i]=sobj.nextInt();
        }
        System.out.println("Enter the Element in 2nd Array : ");
        for(int i=0;i<Brr.length;i++)
        {
            Brr[i]=sobj.nextInt();
        }
    }
}
class Calculate extends ArrayX
{
    public Calculate(int size1,int size2)
    {
        super(size1,size2);
    }
    public void Minimum()
    {
        int iMin1=Arr[0],iMin2=Brr[0];

        for(int i=0;i<Arr.length;i++)
        {
            if(Arr[i] < iMin1)
            {
                iMin1=Arr[i];
            }
        }
        for(int i=0;i<Brr.length;i++)
        {
            if(Brr[i] < iMin2)
            {
                iMin2=Brr[i];
            }
        }
        System.out.println("Minimum is : "+iMin1+" "+iMin2);
    }
}
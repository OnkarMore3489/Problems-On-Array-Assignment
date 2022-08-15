/*
 4. Write a java program which accept two array from user and copy 
the contents of that array into another array and return new array.
 */
import java.util.*;

class program52_4
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
        int Arr[]=cobj.Copy();
        System.out.println("Copied Array is : ");
        for(int i=0;i<Arr.length;i++)
        {
            System.out.println(Arr[i]);
        }
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
    public int[] Copy()
    {
        int k=0;

        int crr[]=new int[Arr.length+Brr.length];
        for(int i=0;i<Arr.length;i++)
        {
            crr[k]=Arr[i];
            k++;
        }
        for(int i=0;i<Brr.length;i++)
        {
            crr[k]=Brr[i];
            k++;
        }
        return crr;
    }
}
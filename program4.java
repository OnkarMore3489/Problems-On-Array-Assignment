/*
4. Write Java program which accept two arrays from user and form 
new array which is combination of contents of first and second array.
Input : 12 57 28 3
99 23 54 58 6 67
Output : 12 57 28 3 99 23 54 58 6 67
 */
import java.util.*;

class program2
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue1=0,iValue2=0;
        System.out.println("Enter the size of 1st array : ");
        iValue1=sobj.nextInt();
        
        System.out.println("Enter the size of 2nd array : ");
        iValue2=sobj.nextInt();

        ArrayX obj = new ArrayX(iValue1,iValue2);
        
        obj.Accept();
        obj.Display();
    }
}
class ArrayX
{
    public int Arr[];
    public int Brr[];
    public int crr[];
    public int size1;
    public int size2;

    public ArrayX(int iValue1,int iValue2)
    {
        this.size1=iValue1;
        this.size2=iValue2;
        Arr=new int[size1];
        Brr=new int[size2];
        crr=new int[size1+size2];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Elements in 1st Array : ");
        for(int i=0;i<Arr.length;i++)
        {
            Arr[i]=sobj.nextInt();
        }
        System.out.println("Enter the Elements in 2nd Array : ");
        for(int i=0;i<Brr.length;i++)
        {
            Brr[i]=sobj.nextInt();
        }
    }
    public void Display()
    {
        int pos=0;
        System.out.println("Entered the Element int 1st and 2nd Array is : ");
        for(int ele1:Arr)
        {
            crr[pos]=ele1;
            pos++;
        }
        for(int ele2:Brr)
        {
            crr[pos]=ele2;
            pos++;
        }
        for(int i=0;i<crr.length;i++)
        {
            System.out.println(crr[i]+" ");
        }
    }
}
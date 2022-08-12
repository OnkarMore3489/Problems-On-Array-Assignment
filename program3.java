/*
3. Write Java program which accept two arrays from user and display 
odd contents of each array.
Input : 
2 9 6 5 2 3
45 6 12 18 23 4
Output : 
9 5 3
45 23
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
    public int size1;
    public int size2;

    public ArrayX(int iValue1,int iValue2)
    {
        this.size1=iValue1;
        this.size2=iValue2;
        Arr=new int[size1];
        Brr=new int[size2];
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
        System.out.println("Entered the Element int 1st Array is : ");
        for(int i=0;i<Arr.length;i++)
        {
            if(Arr[i]%2!=0)
            {
              System.out.print(Arr[i]+" ");
            }
        }
        System.out.println();
        System.out.println("Entered the Element int 2nd Array is : ");
        for(int i=0;i<Brr.length;i++)
        {
            if(Brr[i]%2==0)
            {
                System.out.print(Brr[i]+" ");
            }
        }
    }
}
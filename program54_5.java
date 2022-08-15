/*
 5. Write Java program which accept array from user and display below 
pattern.

Input : 8 9 7 6 4 2 4
Output :
* * * * * * * *
* * * * * *
* * * *
* *
* * * *
 */
import java.util.*;

class program54_5
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        int size1=0;
        System.out.println("Enter size1 : ");
        size1=sobj.nextInt();
        Calculate cobj = new Calculate(size1);
        cobj.Accept();
        cobj.Pattern();  
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

        System.out.println("Enter the Elements in 1st Array : ");

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
    public void Pattern()
    {   
        for(int i=0;i<Arr.length;i++)
        {
            for(int j=1;j<=Arr[i];j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();  
        }    
    }
}

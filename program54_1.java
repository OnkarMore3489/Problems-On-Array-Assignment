/*
 1. Write Java program which accept array of characters from user and 
replace each capital character with its corresponding small character.

Input : b N j B R b A d G G
Output : b n j b r b a d g g
 */
import java.util.*;

class program54_1
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        int size1=0;
        System.out.println("Enter size1 : ");
        size1=sobj.nextInt();
        Calculate cobj = new Calculate(size1);
        cobj.Accept();
        cobj.ArrayReplace();    
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
    public void ArrayReplace()
    {   
        for(int i=0;i<Arr.length;i++)
        {
           if(Arr[i] >= 'A' && Arr[i] <= 'Z')
           {
            Arr[i]=Character.toLowerCase(Arr[i]);
           }
        }
        super.Display();
    }
}

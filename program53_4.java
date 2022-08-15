/*
Write java program which accept marks of N students from user 
and display class of each student.

Less than 35 - Fail
Less than 50 - Pass class
Less than 60 - Second class
Less than 70 - First class
Greater than 70 - First class with Distinction

Input : 67.3 45.8 88.9 77.5 55.2
Output : 67.3 First class
         45.8 Pass class
         88.9 First class with Distinction
         77.5 First class with Distinction
         55.2 Second class
*/
import java.util.*;

class program53_4
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        int size1=0;
        System.out.println("Enter size1 : ");
        size1=sobj.nextInt();

        Calculate cobj = new Calculate(size1);
        cobj.Accept();
        cobj.DisplayClass();
    }
}
class ArrayX
{
    public float Arr[];

    public ArrayX(int size1)
    {
        Arr=new float[size1];
    }
    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Element in 1st Array : ");
        for(int i=0;i<Arr.length;i++)
        {
            Arr[i]=sobj.nextFloat();
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
    public void DisplayClass()
    {
        for(int i=0;i<Arr.length;i++)
        {
            if(Arr[i] < 35)
            {
                System.out.println(Arr[i]+"  "+"Fail");
            }
            else if(Arr[i] < 50)
            {
                System.out.println(Arr[i]+"  "+"Pass Class");
            }
            else if(Arr[i] < 60)
            {
                System.out.println(Arr[i]+"  "+"Second Class");
            }
            else if(Arr[i] < 70)
            {
                System.out.println(Arr[i]+"  "+"First Class");
            }
            else if(Arr[i] > 70)
            {
                System.out.println(Arr[i]+"  "+"First Class with Distinction");
            }
        }
    }
}
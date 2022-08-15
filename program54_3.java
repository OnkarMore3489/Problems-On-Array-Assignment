/*
 3. Write Java program which accept array of characters from user and 
accept one character. Return occurrence of that character without 
considering case.
Input : b N e B R b A i G i B
        b
Output : 4
 */
import java.util.*;

class program54_3
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        int size1=0;
        System.out.println("Enter size1 : ");
        size1=sobj.nextInt();
        Calculate cobj = new Calculate(size1);
        cobj.Accept();
        System.out.println("Enter Character : ");
        char c=sobj.next().charAt(0);
        int cnt=cobj.Search(c);
        System.out.println("No of occurence : "+cnt);    
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
    public int Search(char ch)
    {   
        int iCnt=0;

        for(int i=0;i<Arr.length;i++)
        {
           if(Arr[i] == ch)
           {
            iCnt++;
           }
        }
        return iCnt;
    }
}

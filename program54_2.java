/*
 2. Write Java program which accept array of characters from user and 
replace each capital character with its corresponding small character.

Input : b N e B R b A i G i
Output : 4
 */
import java.util.*;

class program54_2
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        int size1=0;
        System.out.println("Enter size1 : ");
        size1=sobj.nextInt();
        Calculate cobj = new Calculate(size1);
        cobj.Accept();
        int cnt=cobj.CountVowels();
        System.out.println("No of vowels : "+cnt);    
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
    public int CountVowels()
    {   
        int iCnt=0;

        for(int i=0;i<Arr.length;i++)
        {
           if(Arr[i] == 'A' || Arr[i] == 'a' || Arr[i] == 'E' || Arr[i] == 'e' || Arr[i] == 'I' || Arr[i] == 'i' || Arr[i] == 'O' || Arr[i] == 'o' || Arr[i] == 'U' || Arr[i] == 'u')
           {
            iCnt++;
           }
        }
        return iCnt;
    }
}

/*
 5. Write a java program which accept two array from user and check 
whether that array and its elements are palindrome or not.

Input : 11 252 387783 252 11
Output : TRUE
Input : 11 252 387783 77 11
Output : FALSE
Input : 11 252 786 252 11
Output : FALSE
Input : 11 252 786 253 11
Output : FALSE
 */
import java.util.*;

class program52_5
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        int size1=0,size2=0;
        System.out.println("Enter size1 : ");
        size1=sobj.nextInt();

        Calculate cobj = new Calculate(size1);
        cobj.Accept();
        boolean Result=cobj.Palindrome();
        
        if(Result==true)
        {
            System.out.println("TRUE");
        }
        else
        {
            System.out.println("FALSE");
        }
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
}
class Calculate extends ArrayX
{
    public Calculate(int size1)
    {
        super(size1);
    }
    public boolean Palindrome()
    {
        boolean bResult=false;

        for(int i=0;i<Arr.length;i++)
        {
            int iNo=Arr[i],idigit=0,iRev=0,temp=Arr[i];
            while(iNo!=0)
            {
                idigit=iNo%10;
                iRev=(iRev*10)+idigit;
                iNo/=10;
            }
            if(temp==iRev)
            {
                bResult=true;
            }
            else
            {
                bResult=false;
                break;
            }
        }
        return bResult;
    }
}
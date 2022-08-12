/*
2. Accept N numbers from user and return difference between frequency of 
even number and odd numbers.
Input : N : 7
Elements :85 66 3 80 93 88 90
Output : 1 (4 -3)
*/
#include<stdio.h>
#include<stdlib.h>
int frequency(int Brr[],int iSize)
{
    int Even_Count=0,Odd_Count=0;
    for(int iCnt=0;iCnt<iSize;iCnt++)
    {
        if((Brr[iCnt]%2)==0)
        {
            Even_Count++;
        }
        else
        {
            Odd_Count++;
        }
    }
    return (Even_Count-Odd_Count);
}

int main()
{
    int *p=NULL,size=0,iRet=0;
    printf("Enter the size of array : ");
    scanf("%d",&size);

    p=(int *)malloc(size*sizeof(int));
    if(p==NULL)
    {
        printf("Unable to allocate memory\n");
        return -1;
    }

    printf("Enter the Elements : ");
    for(int iCnt=0;iCnt<size;iCnt++)
    {
        scanf("%d",&p[iCnt]);
    }
    
    iRet=frequency(p,size);
    printf("difference between frequency of Even numbers and odd number is : %d",iRet);

    free(p);
    return 0;
}
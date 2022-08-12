/*
1. Accept N numbers from user and return difference between summation 
of even elements and summation of odd elements.
Input : N : 6
Elements :85 66 3 80 93 88
Output : 53 (234 - 181)
*/
#include<stdio.h>
#include<stdlib.h>
int Addition(int Brr[],int iSize)
{
    int sum_even=0,sum_odd=0;
    for(int iCnt=0;iCnt<iSize;iCnt++)
    {
        if((Brr[iCnt]%2)==0)
        {
            sum_even+=Brr[iCnt];
        }
        else
        {
            sum_odd+=Brr[iCnt];
        }
    }
    return (sum_even-sum_odd);
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
    
    iRet=Addition(p,size);
    printf("Difference between summetion of Even Elements and Odd Elements is : %d",iRet);

    free(p);
    return 0;
}
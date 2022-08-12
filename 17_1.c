/*
1. Accept N numbers from user and return frequency of even numbers.
Input : N : 6
Elements :85 66 3 80 93 88
Output : 3
*/
#include<stdio.h>
#include<stdlib.h>
int frequency(int Brr[],int iSize)
{
    int iCount=0;
    for(int iCnt=0;iCnt<iSize;iCnt++)
    {
        if((Brr[iCnt]%2)==0)
        {
            iCount++;
        }
    }
    return iCount;
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
    printf("frequency of Even numbers is : %d",iRet);

    free(p);
    return 0;
}
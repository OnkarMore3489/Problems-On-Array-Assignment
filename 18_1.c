/*
1. Accept N numbers from user and accept one another number as NO , 
check whether NO is present or not.
Input : N : 6
NO: 66
Elements :85 66 3 66 93 88
Output : TRUE
Input : N : 6
NO: 12
Elements :85 11 3 15 11 111
Output : FALSE
*/
#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>
bool frequency(int Brr[],int iSize,int iNo)
{
    bool result=false;
    for(int iCnt=0;iCnt<iSize;iCnt++)
    {
        if(Brr[iCnt]==iNo)
        {
            result=true;
        }
        else
        {
            result=false;
        }
    }
    return result;
}

int main()
{
    int *p=NULL,size=0,iValue=0;
    bool iRet=false;
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

    printf("Enter Number which we want to check it is present or not : ");
    scanf("%d",&iValue);
    
    iRet=frequency(p,size,iValue);
    if(iRet==true)
    {
        printf("Number is present\n");
    }
    else
    {
        printf("Number is not present\n");
    }

    free(p);
    return 0;
}
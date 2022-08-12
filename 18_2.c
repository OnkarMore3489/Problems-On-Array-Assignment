/*
2. Accept N numbers from user and accept one another number as NO , 
return index of first occurrence of that NO.
Input : N : 6
NO: 66
Elements :85 66 3 66 93 88
Output : 1
Input : N : 6
NO: 12
Elements :85 11 3 15 11 111
Output : -1
*/
#include<stdio.h>
#include<stdlib.h>
int frequency(int Brr[],int iSize,int iNo)
{
    int result=0;
    for(int iCnt=0;iCnt<iSize;iCnt++)
    {
        if((Brr[iCnt])==iNo)
        {
          result=iCnt;
          break;
        }
        else
        {
         result=-1;
        }
    }
    return result;
}
int main()
{
    int *p=NULL,size=0,iValue=0;
    int iRet=0;
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

    printf("Enter Number which we want to check occurence : ");
    scanf("%d",&iValue);
    
    iRet=frequency(p,size,iValue);
    if(iRet==-1)
    {
        printf("Thee is no such Number\n");
    }
    else
    {
     printf("first occurences of %d number : %d position",iValue,iRet);
    }

    free(p);
    return 0;
}
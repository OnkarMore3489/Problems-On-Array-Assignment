/*
5. Accept N numbers from user and return product of all odd elements.
Input : N : 6
Elements :15 66 3 70 10 88
Output : 45
Input : N : 6
Elements :44 66 72 70 10 88
Output : 0
*/
#include<stdio.h>
#include<stdlib.h>
int frequency(int Brr[],int iSize)
{
    int mult=1;
    for(int iCnt=iSize;iCnt>=0;iCnt--)
    {
        if(((Brr[iCnt])%2)!=0)
        {
            mult*=Brr[iCnt];
        }
        else
        {
          mult=0;
        }
    }
    return mult;
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
    
    iRet=frequency(p,size);
    
     printf("product of odd numbers is : %d",iRet);

    free(p);
    return 0;
}
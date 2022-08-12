/*
4. Accept N numbers from user and return frequency of 11 form it.
Input : N : 6
Elements :85 66 3 15 93 88
Output : 0
Input : N : 6
Elements :85 11 3 15 11 111
Output : 2
*/
#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>
int frequency(int Brr[],int iSize)
{
    int iCount=0;
    for(int iCnt=0;iCnt<iSize;iCnt++)
    {
        if((Brr[iCnt])==11)
        {
          iCount++;
        }
    }
    return iCount;

}

int main()
{
    int *p=NULL,size=0;
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
    printf("frequency of 11 is : %d",iRet);
    

    free(p);
    return 0;
}
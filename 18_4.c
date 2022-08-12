/*
4. Accept N numbers from user and accept Range, Display all elements from 
that range
Input : N : 6
Start: 60
End : 90
Elements :85 66 3 76 93 88
Output : 66 76 88
Input : N : 6
Start: 30
End : 50
Elements :85 66 3 76 93 88
Output :
*/
#include<stdio.h>
#include<stdlib.h>
void display(int Brr[],int iSize,int iStart,int iEnd)
{
    for(int iCnt=0;iCnt<iSize;iCnt++)
    {
        if((Brr[iCnt]>iStart && Brr[iCnt]<iEnd))
        {
          printf("%d ",Brr[iCnt]);  
        }
    }
}
int main()
{
    int *p=NULL,size=0,iValue1=0,iValue2=0;
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

    printf("Enter the starting point of range that you want to display : ");
    scanf("%d",&iValue1);
    printf("Enter the Ending point of range that you want to display : ");
    scanf("%d",&iValue2);
    
    display(p,size,iValue1,iValue2);

    free(p);
    return 0;
}
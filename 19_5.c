/*
5. Accept N numbers from user and display summation of digits of each 
number.
Input : N : 6
Elements :8225 665 3 76 953 858
Output : 17 17 3 13 17 21
*/
#include<stdio.h>
#include<stdlib.h>
void display(int Brr[],int iSize)
{
    int idigit=0,iSum=0;   
    for(int iCnt=0;iCnt<iSize;iCnt++)  
    {
      while(Brr[iCnt]>0)
      {
       idigit=Brr[iCnt]%10;
       iSum+=idigit;
       Brr[iCnt]=Brr[iCnt]/10;  
      }
      printf("%d ",iSum);
      iSum=0;
    }
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
    
    display(p,size);

    free(p);
    return 0;
}
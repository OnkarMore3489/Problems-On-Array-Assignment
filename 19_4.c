/*
4. Accept N numbers from user and display all such numbers which contains 
3 digits in it.
Input : N : 6
Elements :8225 665 3 76 953 858
Output : 665 953 858
*/
#include<stdio.h>
#include<stdlib.h>
void display(int Brr[],int iSize)
{
    int idigit=0,count=0,a=0;
    
    for(int iCnt=0;iCnt<iSize;iCnt++)  
    {
      a=Brr[iCnt];
      while(Brr[iCnt]>0)
      {
       idigit=Brr[iCnt]%10;
       count++;
       Brr[iCnt]=Brr[iCnt]/10;  

       if(count==3)
       {
          printf("%d ",a);
       }
       
      }
      count=0;
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
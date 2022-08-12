/*
5. Accept N numbers from user and accept one another number as NO , 
return frequency of NO form it.
Input : N : 6
Piyush Khairnar - 7588945488 आम्ही Technical संस्कार करतो !!! ©Marvellous Infosystems Page 5
Marvellous Logic Building Assignment : 17 
NO: 66
Elements :85 66 3 66 93 88
Output : 2
Input : N : 6
NO: 12
Elements :85 11 3 15 11 111
Output : 0
*/
#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>
int frequency(int Brr[],int iSize,int iNo)
{
    int iCount=0;
    for(int iCnt=0;iCnt<iSize;iCnt++)
    {
        if((Brr[iCnt])==iNo)
        {
          iCount++;
        }
    }
    return iCount;

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

    printf("Enter Number which we want to get frequency : ");
    scanf("%d",&iValue);
    
    iRet=frequency(p,size,iValue);
    printf("frequency of 11 is : %d",iRet);
    

    free(p);
    return 0;
}
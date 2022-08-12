/*
3. Accept N numbers from user check whether that numbers contains 11 in 
it or not.
Input : N : 6
Elements :85 66 11 80 93 88
Output : 11 is present
Input : N : 6
Elements :85 66 3 80 93 88
Output : 11 is absent
*/
#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>
bool check(int Brr[],int iSize)
{
    int iCount=0;
    for(int iCnt=0;iCnt<iSize;iCnt++)
    {
        if((Brr[iCnt])==11)
        {
          return true;
        }
        else
        {
          return false;
        }
    }

}

int main()
{
    int *p=NULL,size=0;
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
    
    iRet=check(p,size);
    if(iRet==true)
    {
        printf("11 is present\n");
    }
    else
    {
        printf("11 is absent\n");
    }
    

    free(p);
    return 0;
}
/*
5. Accept N numbers from user and display all such elements which are 
multiples of 11.
Input : N : 6
Elements :85 66 3 55 93 88
Output : 66 55 88
*/
#include<stdio.h>
#include<stdlib.h>
void display(int Brr[],int iSize)
{
    int iCnt=0;
    for(iCnt=0;iCnt<iSize;iCnt++)
    {
        if((Brr[iCnt]%11)==0)
        {
             printf("%d \n",Brr[iCnt]);
        }
    }
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
    
    display(p,size);

    free(p);
    return 0;
}
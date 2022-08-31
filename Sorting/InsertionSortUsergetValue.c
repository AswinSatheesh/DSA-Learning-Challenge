/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>

int main()
{
    int limit = 0;
    printf("Enter the limit : \n");
    scanf("%d",&limit);
    int arr[limit];
    printf("Enter the %d elements : \n",limit);
    for(int i = 0; i < limit; i++)
    {
        scanf("%d",&arr[i]);
    }
    
    for(int i = 1; i < limit; i++)
    {
        int temp = arr[i];
        int j = i -1;
        while(j >= 0 && arr[j]>temp)
        {
            arr[j+1] = arr[j];
            j =  j -1;
        }
        arr[j + 1] = temp;
    }
    
    printf("Array after sorting: \n");
    for(int i = 0; i < limit; i++)
    {
        printf("%d ",arr[i]);
    }

    return 0;
}

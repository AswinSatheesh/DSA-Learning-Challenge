#include<stdio.h>
int main()
{
    int min,temp;
    int array[6] = {27,63,1111,45,1,9};
    int length = sizeof(array)/sizeof(array[0]);
    // printf("Length is : %d\n",length);
    for(int i = 0; i <length-1; i++)
    {
        min = i;
        for(int j = i+1; j < length; j++)
        {
            if(array[j]<array[min]) // checking index with min value , if array element small , its index store to min value.
            {
                min = j;
            }
        }
        temp = array[i];
        array[i] = array[min];
        array[min] = temp;

    }

    printf("After selectio sort performed : \n");
    for(int j = 0; j < length; j++)
    {
        printf("%d ",array[j]);
    }

    return 0;
}
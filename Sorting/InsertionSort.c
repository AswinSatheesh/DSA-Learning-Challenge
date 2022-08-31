#include<stdio.h>
int main()
{
    int array[6] ={7,3,5,4,2,6};
    int length = sizeof(array)/sizeof(array[0]);
    // printf("Length = %d \n",length);
    for(int i = 1; i <length; i++)
    {
        int temp = array[i];
        int prevelem = i -1;
        while(prevelem >=0 && array[prevelem] > temp)
        {
            array[prevelem + 1] = array[prevelem];
            prevelem = prevelem -1;
        }
        array[prevelem + 1] = temp; // while loop terminates only when prevelem reaches -1 or lessthan 0 , so we have to add element into the first position that's why we use this.
    }

    printf("After insertion sort.\n");
    for(int i = 0; i < length; i++)
    {
        printf("%d ",array[i]);
    }
    return 0;
}
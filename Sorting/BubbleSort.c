#include<stdio.h>
int main()
{
    int arr[6]={5,4,3,2,1,10};
    int temp = 0;
    int length = sizeof(arr)/sizeof(arr[0]);
    for(int i = 0; i <length; i++)
    {
        for(int j = 0; j < length-1-i; j++) // when i= 0 last element get sort(highest element bubbled to the last position), i =1 second last elem get sort, so on... so we don't need to check the last sorted values again so we use 'j < n-1-i'
        {
            if(arr[j] > arr[j+1])
            {
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }


    printf("After sorting : \n");
    for(int i = 0; i<length; i++)
    {
        printf("%d ",arr[i]);
    }
    return 0;
}
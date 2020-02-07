package pageObject;

public class ArraySorting {
    public void giveMeArrayToSort(int [] arr)
    {
        int tempArr [] = new int[arr.length];
        int tmpNum;

        for(int i=0;i<arr.length;i++)
        {
            for (int j=i;j<arr.length-1;j++)
            {
                if(arr[i]>arr[j+1])
                {
                    tmpNum=arr[i];
                    arr[i]=arr[j+1];
                    arr[j+1]=tmpNum;
                }
            }
        }
        for (int i=0;i<arr.length;i++)
            System.out.print(arr[i]);
    }

}

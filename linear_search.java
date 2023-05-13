class LinearSearch {
    static int search(int arr[], int n, int srch)
    {
        for (int i = 0; i < n; i++) {
            if (arr[i] == srch)
                return i;
        }
 
        return -1;
    }
 
    public static void main(String[] args)
    {
        int[] arr = { 3, 4, 1, 7, 5 };
        int n = arr.length;
 
        int index = search(arr, n, 4);
        if (index == -1)
            System.out.println("Element is not present in the array");
        else
            System.out.println("Element found at position " + index);
    }
}

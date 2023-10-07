class BinarySearch {
    // Binary search function
    static void binarySearch(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == k) {
                System.out.println("Element " + k + " found at index " + mid);
                return;
            } else if (arr[mid] > k) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        System.out.println("Element " + k + " not found in the array");
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 5, 6, 7, 12, 34, 54};
        binarySearch(arr, 23);
    }
}

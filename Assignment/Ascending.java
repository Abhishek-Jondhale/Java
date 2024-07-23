class Ascending {
    public static void main(String[] args) {
        int arr[] = {120, 20, 30, 1, 45};
        int n = arr.length;

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n  - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Array in ascending order:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}


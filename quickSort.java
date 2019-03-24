class QuickSort {
    public static void main(String[] args) {
        int[] a = {10, 80, 30, 90, 40, 50, 70};//{ 4, 6, 8, 5, 9, 10 };
        sort(a, 0, a.length - 1);
        for (int n : a) {
            System.out.println(n);
        }

    }

    public static void sort(int[] a, int low, int high) {

        int pivot = a[(low + high) / 2];
        int i = low, j = high;

        while (i <= j) {
            while (a[i] < pivot)
                i++;
            while (a[j] > pivot)
                j--;
        
            if (i <= j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
            if (low < j) {
                sort(a, low, j);
            }
            if (i < high) {
                sort(a, i, high);
            }
        }

    }
}

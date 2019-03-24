class InsertionSort {
    public static void main(String[] args) {
        int[] a = { 4, 6, 8, 5, 9, 10 };
        sort(a);
        for (int n : a) {
            System.out.println(n);
        }

    }

   public static void sort(int []a) {
       for(int i=0;i<a.length-1;i++){
           int key=a[i];
           int j=i-1;
           
           while(j>-1 && a[j]>key){
               a[j+1]=a[j];
               j--;
           }
           a[j+1]=key;
               }
           }
        }
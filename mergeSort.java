class MergeSort {
    public static void main(String[] args) {
        int[] a = {4,5,1,2};
        // int[]b={2,8,21,13,14};
        // int[]c=new int[a.length +b.length];
        // merge(a.b,c);
        sort(a);
       
        // for (int n : c) {
            for(int n:a){
            System.out.println(n);
        }

    }
    // for splitting----
    static void sort(int[]a){
        if(a.length==1)return;
        int[] b=new int [a.length/2];
        int[]c=new int [a.length-b.length];
        int i;
        for(i=0;i<b.length;i++){
            b[i]=a[i];
        }
        for(int j=0;j<c.length;j++){
            c[j]=a[j + b.length];
        }


        sort(b);
        sort(c);
        merge(b,c,a);
    }
    // without splitting--

   static void merge (int []a, int[] b ,int[] c) {
       int i=0,j=0,k=0;
       while(i<a.length && j<b.length){
           if(a[i]<b[j]){
               c[k]=a[i];
               k++;
               i++;
           }else{
               c[k]=b[j];
               k++;
               j++;
           }
       }
       while(i<a.length){
           c[k++]=a[i++];
       }
       while(j<b.length){
           c[k++]=b[j++];
       }
   }
}
      
         
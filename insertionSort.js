let a=[4,6,8,5,9];
sort(a);
for(let i of a){
    console.log(i);
}
function sort(a){
    for(let i=0;i<a.length-1;i++){
        let key=a[i];
        let j=i-1;
        while(j>-1 && a[j]>key){
            a[j+1]=a[j];
            j--;
        }
        a[j+1]=key;
    }
}
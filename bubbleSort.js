let a=[4,6,8,5,9];
sort(a);
for(let i of a){
    console.log(i);
}
function sort(a){
    for(let i=0;i<a.length-1;i++){
        for(let j=0;j<a.length-1;j++){
            if(a[j]>a[j+1]){
                let temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
    }



}
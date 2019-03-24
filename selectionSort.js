let a = [4, 6, 8, 5, 9];
sort(a);
for (let i of a) {
    console.log(i);
}
function sort(a) {
    for (let i = 0; i < a.length - 1; i++) {
        let index = i;
        for (let j = i+1; j < a.length; j++) {
            if (a[j] < a[index]) {
                index = j;
            }
        }
    

        if (i != index) {
            let temp = a[index];
            a[index] = a[i];
            a[i] = temp;
        }
    }
}

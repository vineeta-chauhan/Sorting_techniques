var a = [5, 6, 8, 4];
sort(a);
for (let i of a) {
    console.log(i);
}
function sort(a) {
    console.log(a, " arr a inside sort");
    if (a.length == 1) {
        return;
    }
    let b = a.slice(0, Math.floor(a.length / 2));
    console.log(b, "  arr b inside sort");
    let c = a.slice(Math.floor(a.length / 2), a.length);
    console.log(c, "  arr c inside sort");
    sort(b);
    sort(c);
    merge(b, c, a);

}
function merge(a, b, c) {
    let i = 0, j = 0, k = 0;
    while (i < a.length && j < b.length) {
        if (a[i] < b[j]) {
            c[k] = a[i];
            k++;
            i++;
        }
        else {
            c[k] = b[j];
            k++;
            j++;
        }
    }
    while (i < a.length) {
        c[k] = a[i];
        k++;
        i++;
    }
    while (j < b.length) {
        c[k] = b[j];
        k++;
        j++;
    }
}




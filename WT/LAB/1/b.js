// 2. write a js program to find the most frequent element of an array

var list = [1, 4, 7, 8, 7, 4, 1, 5, 2, 1];
var max = 0;
var item = list[0];
for (var l = 0; l < list.length; l++) {
    var count = 0;
    for (var r = l; r < list.length; r++) {
        if (list[l] == list[r]) count++;
    }
    if (count > max) {
        max = count;
        item = list[l];
    }
}
console.log(item + " (" + max + " times )");

// 1 ( 3 times )
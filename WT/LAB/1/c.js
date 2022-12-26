// 3. write a js program to remove duplicates from an array

var list = [1, 2, 2, 4, 5, 4, 7, 8, 7, 3, 6];
var unq = [];
for (var l = 0; l < list.length; l++) {
    if (unq.indexOf(list[l]) == -1) {
        unq.push(list[l]);
    }
}
console.log("Original List: ", list);
console.log("Unique List: ", unq);

// Original List:  [1, 2, 2, 4, 5, 4, 7, 8, 7, 3, 6]
// Unique List:  [1, 2, 4, 5, 7, 8, 3, 6]
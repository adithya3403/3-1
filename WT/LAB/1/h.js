// 8. Write a JavaScript program to implement Bubble Sort.

var arr = [3, 0, 2, 5, -1, 4, 1];
console.log("Given array: ", arr);
var n = arr.length;
for (var i = 0; i < n - 1; i++)
    for (var j = 0; j < n - i - 1; j++)
        if (arr[j] > arr[j + 1]) {
            var temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
        }
console.log("Sorted array: ", arr);

// Given array:  [ 3, 0, 2, 5, -1, 4, 1 ]
// Sorted array:  [ -1, 0, 1, 2, 3, 4, 5 ]
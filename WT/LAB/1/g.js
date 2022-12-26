// 7. Write a JavaScript program to sort a list of elements using Quick sort

var arr = [5, 2, 4, 1, 3, 7, 6, 8];
var quickSort = function (arr) {
    if (arr.length <= 1) return arr;
    var pivot = arr[0], left = [], right = [];
    for (var i = 1; i < arr.length; i++) {
        if (arr[i] < pivot) left.push(arr[i]);
        else right.push(arr[i]);
    }
    return quickSort(left).concat(pivot, quickSort(right));
}
console.log("Given array: ", arr);
console.log("Sorted array: ", quickSort(arr));

// Given array:  [ 5, 2, 4, 1, 3, 7, 6, 8 ]
// Sorted array:  [ 1, 2, 3, 4, 5, 6, 7, 8 ]
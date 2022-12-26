// 4. write a js program to perform binary search

var list = [11, 15, 23, 24, 36, 58, 62];
var x = 62;
var l = 0, r = list.length - 1;
var binarySearch = function (list, x, l, r) {
    while (l <= r) {
        var mid = Math.floor((l + r) / 2);
        if (list[mid] == x) return "Found at index: " + mid;
        else if (list[mid] < x) l = mid + 1;
        else r = mid - 1;
    }
    return "Not Found";
}
console.log(binarySearch(list, x, l, r));

// Found at index:  6
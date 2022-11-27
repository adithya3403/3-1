// 7. Write a JavaScript program to sort a list of elements using Quick sort

var readline = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout
});

readline.question("Enter numbers separated by space : ", function (line) {
    let arr = line.split(' ').map(Number);
    let final = QuickSort(arr, 0, arr.length - 1);
    console.log(final);
    readline.close();
});

function QuickSort(arr, left, right) {
    var pivot, partitionIndex;
    if (left < right) {
        pivot = right;
        partitionIndex = partition(arr, pivot, left, right);
        QuickSort(arr, left, partitionIndex - 1);
        QuickSort(arr, partitionIndex + 1, right);
    }
    return arr;
};

function partition(arr, pivot, left, right) {
    var pivotValue = arr[pivot], partitionIndex = left;
    for (var i = left; i < right; i++) {
        if (arr[i] < pivotValue) {
            swap(arr, i, partitionIndex);
            partitionIndex++;
        }
    }
    swap(arr, right, partitionIndex);
    return partitionIndex;
};

function swap(arr, i, j) {
    var temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
};
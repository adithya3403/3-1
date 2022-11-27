// 8. Write a JavaScript program to implement Bubble Sort.

var readline = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout
});

readline.question("Enter numbers separated by space : ", function (line) {
    let arr = line.split(' ').map(Number);
    let final = BubbleSort(arr);
    console.log(final);
    readline.close();
});

function BubbleSort(arr) {
    for (var i = 0; i < arr.length; i++) {
        for (var j = 0; j < arr.length; j++) {
            if (arr[j] > arr[j + 1]) {
                swap(arr, j, j + 1);
            }
        }
    }
    return arr;
};

function swap(arr, i, j) {
    var temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
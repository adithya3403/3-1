// 4. write a js program to perform binary search

var readline = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout
});
readline.question("Enter elements separated by space : ", function (line) {
    let arr = line.split(' ').map(Number);
    readline.question("Enter element to search : ", function (line) {
        let element = Number(line);
        console.log(binSearch(arr, element));
        readline.close();
    });
});
function binSearch(arr, x) {
    let l = 0, r = arr.length - 1;
    while (l <= r) {
        let mid = Math.floor((r + l) / 2);
        if (arr[mid] == x) {
            return mid;
        }
        if (arr[mid] < x) {
            l = mid + 1;
        } else {
            r = mid - 1;
        }
    }
    return -1;
}
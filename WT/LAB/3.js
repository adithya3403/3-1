// 3. write a js program to remove duplicates from an array

var readline = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout
});

readline.question("Enter elements separated by space : ", function (line) {
    let arr = line.split(' ').map(Number);
    removeDupls(arr);
    readline.close();
});

function removeDupls(arr) {
    let set = new Set(arr);
    console.log(set);
}

// Enter elements separated by space : 1 4 1 5 8 2 3
// Set(6) { 1, 4, 5, 8, 2, 3 }
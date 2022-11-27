// 2. write a js program to find the most frequent element of an array

var readline = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout
});

readline.question("Enter elements separated by space : ", function (line) {
    let arr = line.split(' ').map(Number);
    findMostFreq(arr);
    readline.close();
});

function findMostFreq(arr) {
    let hashmap = {};
    for (let i = 0; i < arr.length; i++) {
        if (hashmap[arr[i]] == null) {
            hashmap[arr[i]] = 1;
        } else {
            hashmap[arr[i]] += 1;
        }
    }
    let max = 0;
    let maxKey = 0;
    for (let key in hashmap) {
        if (hashmap[key] > max) {
            max = hashmap[key];
            maxKey = key;
        }
    }
    console.log(maxKey);
}

// Enter elements separated by space : 1 4 2 1 5 1 3 2
// 1
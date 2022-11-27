// 1. which accepts a string as input and swap the case of each character. For example, if you input 'The Quick Brown Fox' the output should be 'tHEqUICKbROWNfOX'.;

var readline = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout
});

readline.question("Enter word : ", function (line) {
    var str = line;
    swapCase(str);
    readline.close();
});

function swapCase(str) {
    var newStr = "";
    for (var i = 0; i < str.length; i++) {
        let x = str[i];
        if (x != " ") {
            if (x == x.toUpperCase()) {
                newStr += x.toLowerCase();
            } else {
                newStr += x.toUpperCase();
            }
        }
    }
    console.log(newStr);
}

// Enter word : The Quick Brown Fox
// tHEqUICKbROWNfOX
// 1. which accepts a string as input and swap the case of each character. For example, if you input 'The Quick Brown Fox' the output should be 'tHEqUICKbROWNfOX'.;

const readline = require('readline');
var RL = readline.createInterface(process.stdin, process.stdout);
RL.question('Please Enter Text:  ', (name) => {
    let x = name;
    let y = "";
    for (let i = 0; i < x.length; i++) {
        if (x.charAt(i) >= 'A' && x.charAt(i) <= 'Z')
            y = y + x.charAt(i).toLowerCase();
        else if (x.charAt(i) >= 'a' && x.charAt(i) <= 'z')
            y = y + x.charAt(i).toUpperCase();
    }

    console.log(`Output is is ${y}`);

});


// Please Enter Text:  The Quick Brown Fox
// Output is is tHEqUICKbROWNfOX
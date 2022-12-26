// 1. which accepts a string as input and swap the case of each character. For example, if you input 'The Quick Brown Fox' the output should be 'tHEqUICKbROWNfOX'.;

const readline = require('readline');
var RL = readline.createInterface(process.stdin, process.stdout);
RL.question('Please Enter Text:  ', (name) => {
    let y = "";
    for (let i = 0; i < name.length; i++) {
        if (name[i] == ' ') y += '';
        else if (name[i] == name[i].toUpperCase()) y += name[i].toLowerCase();
        else y += name[i].toUpperCase();
    }
    console.log("Output is : " + y);
    RL.close();
});


// Please Enter Text:  The Quick Brown Fox
// Output is is tHEqUICKbROWNfOX
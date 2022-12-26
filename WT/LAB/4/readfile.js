// 4.	Write a NodeJS program to read from a file and display the content on screen – “readfile.js”

try {
    var data = require('fs').readFileSync('file.txt', 'utf8');
    console.log(data);
} catch (e) {
    console.log('Error:', e.stack);
}
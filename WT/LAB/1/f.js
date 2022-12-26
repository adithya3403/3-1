// 6. Write a JavaScript function to check whether an object contains given property.

let object = { name: 'Jack', age: 25, college: 'KMIT', year: 3};
console.log(object.hasOwnProperty('name'));
console.log('age' in object);
console.log(object.college);
console.log(object.year);

// true
// true
// KMIT
// 3
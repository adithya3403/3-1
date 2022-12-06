// 6. Write a JavaScript function to check whether an object contains given property.

// 1. hasOwnProperty() method
let object1 = {
    name: 'Jack',
    age: 25,
    college: 'KMIT',
    year: 3,
    sem: 1
};
console.log(object1.hasOwnProperty('name')); // true


// 2. in operator Method:
let object2 = {
    name: 'Jack',
    age: 25,
    college: 'KMIT', year: 3, sem: 1
};
console.log('name' in object2); // true

// 3. Comparing with undefined Method:
let object3 = {
    name: 'Jack',
    age: 25,
    college: 'KMIT', year: 3, sem: 1
};
console.log(object3.name); // Jack
console.log(object3.fee); // undefined

// 5. Write a JavaScript program to list the properties of a JavaScript object.

let object = {
    name: 'Jack',
    age: 25,
    college: 'KMIT',
    year: 3,
    sem: 1
};
let properties = Object.keys(object);
console.log(properties);

// [ 'name', 'age', 'college', 'year', 'sem' ]
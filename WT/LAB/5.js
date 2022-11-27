// 5. Write a JavaScript program to list the properties of a JavaScript object.

let stu = {
    name: "John",
    age: 18,
    college: "KMIT"
};
console.log(Object.getOwnPropertyNames(stu));
console.log(stu.hasOwnProperty("age"));

// [ 'name', 'age', 'college' ]
// true
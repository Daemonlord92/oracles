// JavaScript Variable
// Variable stored data within memory, allowing us to manipulate the element within
const h1Hello = document.getElementById('h1-hello')
//example of changing the internals of the variable
h1Hello.innerHTML = "Welcome to JavaScript"
//String DataType
//Strings is an array of characters combined together
let stringExample = "I am a string"


//Number DataType
//Any DataType that deals with numbers directly like byte, short, long, integer, double, float
//Fall on the number DataType in JavaScript
const numberExample = 10

//Boolean DataType
const booleanExample = true || false

console.log(stringExample + numberExample)

stringExample = 20

console.log(stringExample)

const arrayExample = [10, true, "String", 4.5, 'a']



arrayExample.sort()

console.log(arrayExample)

const twoTruthsAndOneLieOne = document.getElementById("two-truths-and-one-lie-1")
const twoTruthsAndOneLieTwo = document.getElementById("two-truths-and-one-lie-2")
const twoTruthsAndOneLieThree = document.getElementById("two-truths-and-one-lie-3")

twoTruthsAndOneLieOne.addEventListener('click', function() {
    twoTruthsAndOneLieOne.innerHTML = "Truth"
    twoTruthsAndOneLieOne.style = "background-color: green;"
})
twoTruthsAndOneLieTwo.addEventListener('click', function() {
    twoTruthsAndOneLieTwo.innerHTML = "Lie"
    twoTruthsAndOneLieTwo.style = 'background-color: red;'
})
twoTruthsAndOneLieThree.addEventListener('click', function() {
    twoTruthsAndOneLieThree.innerHTML = "Truth"
    twoTruthsAndOneLieThree.style = "background-color: green;"
})

// function fizzBuzz(arr) {
//     for ( let i = 0; i < arr.length; i++) {
//         if(arr[i] % 3 === 0 && arr[i] % 5 === 0){
//             console.log("FizzBuzz")
//         } else if (arr[i] % 3 === 0 ) {
//             console.log("Fizz")
//         } else if (arr[i] % 5 === 0 ) {
//             console.log("Buzz")
//         } else {
//             console.log(arr[i])
//         }
//     }
// }

// const arr = Array.from({ length: 100}, (_,i)=> i + 1)

// fizzBuzz(arr)
// // const arrowFunction = () => {

// // }

const arr = [
    {
        name: "Matthew",
        job: "Software Developer",
        phone: 5036803865
    },
    {
        name: "Amos",
        job: "Software Developer",
        phone: 9072728359
    },
    {
        name: "Mark",
        job: "Project Manager",
        phone: 5713860987
    }
]

// arr.forEach(person => {
//     if(person.job === "Software Developer") {
//         console.log(person)
//     }
// })

// arr.forEach(person => {
//     if(person.job === "Project Manager"){
//         console.log(person)
//     }
// })

function handleSubmit() {
    const username = document.getElementById("username")
    const id = document.getElementById("dob")
    alert(JSON.stringify({
        "username": username.value,
        "dob": dob.value
    }))
}



const lion1 = {
    name: "Mufasa",
    age: 10,
    country: "Africa",
    headOfPride: true
}
const lion2 = {
    name: "Simba",
    age: 7,
    country: "Africa",
    headOfPride: true
}
const lion3 = {
    name: "Scar",
    age: 13,
    country: "Africa",
    headOfPride: false
}

const lionArr = [lion1, lion2, lion3]

// for(const element of lionArr) {
//     if(element.headOfPride &&   element.age > 9){
//         console.table(element)
//     }
// }

// for(let i = 0; i < lionArr.length; i++) {
//     if(lionArr[i].headOfPride &&   lionArr[i].age > 9){
//         console.table(lionArr[i])
//     }
// }

class Animal {
    name;
    species;
    sound;
    food;

    constructor(name, species, sound, food) {
        this.name = name
        this.species = species
        this.sound = sound
        this.food = food
    }

    speak = () => {
        console.log(this.sound)
    }

    eat() {
        console.log(this.name + " is eating " + this.food)
    }

}

const dog = new Animal("Kupek", "Husky", "Woof", "Meat")


dog.speak()
dog.eat()

const lion4 = new Animal("Nadia", "Lion", "Roar", "Meat")

lion4.speak()
lion4.eat()

let count = 0

while (count < 50) {
    console.log(count)
    count++
}

count = 0

do {
    dog.speak()
    count++
} while(count < 60)


const h2HelloElement = document.getElementById("h2-hello")

h2HelloElement.innerHTML = "Hello Fatima"

h2HelloElement.addEventListener('mouseover', () => h2HelloElement.style = "background-color: green;")
h2HelloElement.addEventListener('click', ()=> h2HelloElement.style = "background-color: cornflowerblue;")
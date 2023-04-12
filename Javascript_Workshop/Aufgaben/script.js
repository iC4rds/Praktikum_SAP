// Aufgabe 1
// w4s.println("Hello World!")

//Aufgabe 2

// const eingabe1 = parseInt(prompt("Gebe Zahl 1 ein:"))
// const eingabe2 = parseInt(prompt("Gebe Zahl 2 ein:"))

// const Addition = eingabe1 + eingabe2
// const Subtraktion = eingabe1 - eingabe2
// const Multiplikation = eingabe1 * eingabe2
// const Division = eingabe1 / eingabe2
// const Modulo = eingabe1 % eingabe2

// w4s.println("Die Addition ergibt: " + Addition	)
// w4s.println("Die Subtraktion ergibt: " + Subtraktion	)
// w4s.println("Die Multiplikation ergibt: " + Multiplikation	)
// w4s.println("Die Division ergibt: " + Division	)
// w4s.println("Der Modulo der Division ist: " + Modulo	)

// Aufgabe 3 Schaltjahr

// const Jahr = parseInt(prompt("Gebe eine Jahreszahl an:"))

// w4s.println("Jahr: " + Jahr)

// if (Jahr % 400 === 0){
//     w4s.println("Das Jahr ist ein Schaltjahr")
// } else if (Jahr % 100 === 0){
//     w4s.println("Das Jahr ist kein Schaltjahr")
// } else if (Jahr % 4 === 0){
//     w4s.println("Das Jahr ist ein Schaltjahr")
// } else {
//     w4s.println("Das Jahr ist kein Schaltjahr")
// }

// if (Jahr % 4 === 0 && (Jahr % 100 !== 0 || Jahr % 400 === 0)){
//     w4s.println(Jahr + " ist kein Schaltjahr")
// }

// Aufgabe 4 Lottogewinn

// let Lottogewinn = parseInt(prompt("Gebe deinen Lottogewinn an:"))
// const Jahr = parseInt(prompt("Gebe die Anlagedauer an:"))

// w4s.println("Es werden " + Lottogewinn + " Euro auf dem Konto angelegt.")

// for (let i = 0; i<Jahr; i++){
//     Lottogewinn = Lottogewinn * 1.03
// }

// w4s.println("Die Anlage nach " + Jahr + " Jahren beträgt: " + Lottogewinn + " Euro.")

// Aufgabe 5 Fibonacci-Zahlen

// let fib = [0, 1]

// for (let i = 0; fib.length < 20; i++){
//     fib.push(fib[i] + fib[i + 1])
// }

// for (let i = 0; i < fib.length; i++){
//     w4s.println(fib[i])
// }

// fib.forEach(e => {w4s.println(e)})

// Aufgabe 6 Personen

// const personenListe = []

// const Person1 = {
//     Vorname: "Gerhilde",
//     Nachname: "Brunnenbauer",
//     Alter: 17,
//     Lieblingsfarbe: "beige"
// }
// personenListe.push(Person1)

// const Person2 = {
//     Vorname: "Troy",
//     Nachname: "Müller",
//     Alter: 32,
//     Lieblingsfarbe: ""
// }
// personenListe.push(Person2)

// personenListe.forEach(e => {
//     for (const value of Object.values(e))
//     w4s.println(value)
// })

// let gesammtalter = 0
// personenListe.forEach(e => {
//     gesammtalter += e.alter
// })
// w4s.println("Das gemeinsame Alter beträgt " + gesammtalter + " Jahre")

// Aufgabe 7 Event Listener

// document.querySelector(".w4s-title").addEventListener(
//     "click", function () {window.location.href = "https://www.sap.com/germany/index.html"}
// )


// window.addEventListener("keyup", onKeyup)

// function onKeyup(event) {
//     if (event.key === "d") {
//         w4s.showDialog("Test", "Lorem ipsum dolor sit amet")
        
//         document.querySelector(".w4s-dialog").addEventListener("click", function () {w4s.closeDialog()})
//     } 
//     else if (event.key === "Escape"){
//         w4s.closeDialog()
//     }
//     else if (event.key === "r"){
//         window.location.href = "https://www.reddit.com"
//     }
// }

// Aufgabe 8 Color change


// let newButton = document.createElement("button")
// newButton.innerHTML = "Hintergrund ändern"
// newButton.addEventListener("click", onClickColorchange)
// document.querySelector(".w4s-box:nth-child(4)").appendChild(newButton)

// function onClickColorchange(event){
//     const gold = "#f0ab00"
//     const dark = "#333333"
//     document.querySelector(".w4s-sidebar").style.backgroundColor = gold
//     document.querySelector(".w4s-navbar").style.backgroundColor = gold
//     document.querySelector(".w4s-border-bg-helper").style.backgroundColor = gold
//     document.querySelector(".w4s-title").style.color = dark
// } 


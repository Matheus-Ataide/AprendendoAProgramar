//Criação de Variáveis
var a = 3
var b = 2 


/*
- Para acessar os valores do console.log é só acessar a saída/terminal no compilador
- Se você acessar pelo navegador com o html, faça os passos que estarão no parenteses (Botão direito na tela do navegador > inspecionar > console)
*/


//Adição
var somac = a + b
console.log(somac)

//Subtração
console.log(a - b)

//Multiplicação
console.log(a * b)

//Divisão
console.log(a / b)

//Se você deseja acessar o resto da divisão
console.log(a % b)

//Exponenciação | O segundo número será o exponencial
console.log(a ** b)


//Você irá perceber que ao compilar, estará false/true, o programa está informando o resultado dessas análises que estão sendo pedidas

//Igual que
console.log(a == b)

//Diferente que
console.log(a != b)

//Maior que
console.log(a >= b)

//Menor que
console.log(a <= b)

//Comparar as duas condições: "e"
console.log(a && b)

//Comparar as duas condições: "ou"
console.log(a || b)


//Imprimindo os valores lá no HMTL
document.getElementById("soma").innerHTML = somac
//document.getElementById("sub").textContent = document.getElementById("txt").innerHTML
//document.getElementById("mult").textContent = document.getElementById("txt").innerHTML
//document.getElementById("divi").textContent = document.getElementById("txt").innerHTML

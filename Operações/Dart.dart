void main(){
//Criação de Variáveis

dynamic a = 3;
dynamic b = 2; 


/*
- Para acessar os valores do print é só acessar a saída/terminal no compilador
- Se você acessar pelo navegador com o html, faça os passos que estarão no parenteses (Botão direito na tela do navegador > inspecionar > console)
*/


//Adição
print(a + b);

//Subtração
print(a - b);

//Multiplicação
print(a * b);

//Divisão
print(a / b);

//Se você deseja acessar o resto da divisão
print(a % b);


//Você irá perceber que ao compilar, estará false/true, o programa está informando o resultado dessas análises que estão sendo pedidas

//Igual que
print(a == b);

//Diferente que
print(a != b);


//Maior que
if(a >= b){
  print ("true");
}
else{
  print ("false");
}

//Menor que
if(a <= b){
  print ("true");
}
else if(a <= b){
  print ("false");
}

//Comparar as duas condições: "e"
print ("teste");
if(a > b && b < a){
  print ("true");
}
else{
  print ("false");
}

//Comparar as duas condições: "ou"
if(a > b || b < a){
  print ("true");
}
else if(a <= b){
  print ("false");
}

}

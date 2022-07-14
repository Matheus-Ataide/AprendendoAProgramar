#include <stdio.h> //para utilizar o "printf", comando para imprimir algum valor, utilizaremos essa biblioteca

void main(){
  //Criação de Variáveis

  int a = 3;
  int b = 2; 


  /*
  - Para acessar os valores do printf é só acessar a saída/terminal no compilador
  - Se você acessar pelo navegador com o html, faça os passos que estarão no parenteses (Botão direito na tela do navegador > inspecionar > console)
  */


  //Adição
  int soma = a + b;
  printf("%d", soma);
  printf("\n");
  
  //Subtração
  int sub = a - b;
  printf("%d", sub);
  printf("\n");

  //Multiplicação
  int mult = a * b;
  printf("%d", mult);
  printf("\n");

  //Divisão
  int divi = a / b;
  printf("%d", divi);
  printf("\n");

  //Se você deseja acessar o resto da divisão
  int resto = a % b;
  printf("%d", resto);
  printf("\n");


  //Você irá perceber que ao compilar, estará false/true, o programa está informando o resultado dessas análises que estão sendo pedidas

  //Igual que
  if(a == b){
  printf ("true");
  printf("\n");
  }
  else{
    printf ("false");
    printf("\n");
  }
  
  //Diferente que
  if(a != b){
    printf ("true");
    printf("\n");
  }
  else{
    printf ("false");
    printf("\n");
  }
  
  //Maior que
  if(a >= b){
    printf ("true");
    printf("\n");
  }
  else{
    printf ("false");
    printf("\n");
  }

  //Menor que
  if(a <= b){
    printf ("true");
    printf("\n");
  }
  else if(a <= b){
    printf ("false");
    printf("\n");
  }

  //Comparar as duas condições: "e"
  if(a > b && b < a){
    printf ("true");
    printf("\n");
  }
  else{
    printf ("false");
    printf("\n");
  }

  //Comparar as duas condições: "ou"
  if(a > b || b < a){
    printf ("true");
    printf("\n");
  }
  else if(a <= b){
    printf ("false");
    printf("\n");
  }
  
}

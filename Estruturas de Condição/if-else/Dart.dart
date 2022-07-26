void main(){
  //Criação de Variáveis

  dynamic a = 3;
  dynamic b = 2; 

/*
- Para acessar os valores do print é só acessar a saída/terminal no compilador
- Se você acessar pelo navegador com o html, faça os passos que estarão no parenteses (Botão direito na tela do navegador > inspecionar > console)
*/
    
  
  //Você irá perceber que ao compilar, estará false/true, o programa está informando o resultado dessas análises que estão sendo feitas

    
  //Igual que
  if (a == b){
    print("true");
  }
  else{
    print("false");
  }
  //Diferente que
  if(a != b){
    print("true");
  }
  else{
    print("false");
  }
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

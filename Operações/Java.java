public class Java {
  public static void main(String[] args){
    //Criação de Variáveis

    int a = 3;
    int b = 2; 


    /*
    - Para acessar os valores do System.out.println é só acessar a saída/terminal no compilador
    - Se você acessar pelo navegador com o html, faça os passos que estarão no parenteses (Botão direito na tela do navegador > inspecionar > console)
    */


    //Adição
    System.out.println(a + b);

    //Subtração
    System.out.println(a - b);

    //Multiplicação
    System.out.println(a * b);

    //Divisão
    System.out.println(a / b);

    //Se você deseja acessar o resto da divisão
    System.out.println(a % b);


    //Você irá perceber que ao compilar, estará false/true, o programa está informando o resultado dessas análises que estão sendo pedidas

    //Igual que
    System.out.println(a == b);

    //Diferente que
    System.out.println(a != b);


    //Maior que
    if(a >= b){
      System.out.println ("true");
    }
    else{
      System.out.println ("false");
    }

    //Menor que
    if(a <= b){
      System.out.println ("true");
    }
    else if(a <= b){
      System.out.println ("false");
    }

    //Comparar as duas condições: "e"
    System.out.println ("teste");
    if(a > b && b < a){
      System.out.println ("true");
    }
    else{
      System.out.println ("false");
    }

    //Comparar as duas condições: "ou"
    if(a > b || b < a){
      System.out.println ("true");
    }
    else if(a <= b){
      System.out.println ("false");
    }

  }
}

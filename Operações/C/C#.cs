using System;

public class Program{
    public static void Main(string[] args){
    //Criação de Variáveis

    int a = 3;
    int b = 2; 


    /*
    - Para acessar os valores do Console.WriteLine é só acessar a saída/terminal no compilador
    - Se você acessar pelo navegador com o html, faça os passos que estarão no parenteses (Botão direito na tela do navegador > inspecionar > console)
    */


    //Adição
    Console.WriteLine(a + b);

    //Subtração
    Console.WriteLine(a - b);

    //Multiplicação
    Console.WriteLine(a * b);

    //Divisão
    Console.WriteLine(a / b);

    //Se você deseja acessar o resto da divisão
    Console.WriteLine(a % b);


    //Você irá perceber que ao compilar, estará false/true, o programa está informando o resultado dessas análises que estão sendo pedidas

    //Igual que
    Console.WriteLine(a == b);

    //Diferente que
    Console.WriteLine(a != b);


    //Maior que
    if(a >= b){
        Console.WriteLine ("true");
    }
    else{
        Console.WriteLine ("false");
        }

    //Menor que
    if(a <= b){
        Console.WriteLine ("true");
    }
    else if(a <= b){
        Console.WriteLine ("false");
    }

    //Comparar as duas condições: "e"
    if(a > b && b < a){
        Console.WriteLine ("true");
    }
    else{
        Console.WriteLine ("false");
    }

    //Comparar as duas condições: "ou"
    if(a > b || b < a){
        Console.WriteLine ("true");
    }
    else if(a <= b){
        Console.WriteLine ("false");
    }

    }
}

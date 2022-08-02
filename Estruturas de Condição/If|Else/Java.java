public class Java {
  public static void main(String[] args){
    int a = 3;
    int b = 2; 
    
    
    //Você irá perceber que ao compilar, estará false/true, o programa está informando o resultado dessas análises que estão sendo feitas
    
    //Igual que
    if (a == b){
        System.out.println("true");
    }
    else{
        System.out.println("false");
    }
    //Diferente que
    if(a != b){
        System.out.println("true");
    }
    else{
        System.out.println("false");
    }
    //Maior que
    if(a >= b){
        System.out.println("true");
    }
    else{
        System.out.println("false");
    }
    //Menor que
    if(a <= b){
        System.out.println("true");
    }
    else{
        System.out.println("false");
    }
    //Comparar as duas condições{ "e"
    if(a > b && b < a){
      System.out.println ("true");
    }
    else{
      System.out.println ("false");
    }
    //Comparar as duas condições{ "ou"
    if(a > b || b < a){
      System.out.println ("true");
    }
    else{
        System.out.println("false");
    }
    
    
    //Vamos testar outra condição que faz parte do if, o elif
    if (a == b){
        System.out.println ("São iguais");
    }
    else if (a < b){
        System.out.println ("b é maior que a");
    }
    else{
        System.out.println ("a é maior que b");
    }
  }
}

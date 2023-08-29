package edu.camilo.java.sintaxe;

public class operacoes {
    public static int sum(int n1, int n2){
       int res = n1+n2;
       return res;
    }
    public static int subtraction(int n1, int n2){
        int res = n1-n2;
        return res;
    }
    public static String fullname (String primeiroNome,String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }

}

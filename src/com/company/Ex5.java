package com.company;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int idade;

        System.out.println("Informe sua idade: ");
        idade = sc.nextInt();

        if (idade < 16){
            System.out.println("Não Eleitor");
        }else{
            if((idade >= 18) && (idade <= 65)){
                System.out.println("Eleitor Obrigatório!!!!");
            }else if(idade > 65){
                System.out.println("Eleitor Facultativo");
            }else{
                System.out.println("Eleitor Facultativo");
            }
        }
    }


}

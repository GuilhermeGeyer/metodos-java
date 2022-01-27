package com.dio;

public class Mensagem {
    public static void main(int hora) {
        if (hora >= 6){
            if (hora < 12){
                System.out.println("Bom dia!");
            }
            else if (hora < 18){
                System.out.println("Boa tarde!");
            }
            else if (hora <= 24){
                System.out.println("Boa noite!");
            }
        }
        else if (hora >= 0){
            System.out.println("Boa noite!");
        }
    }
}

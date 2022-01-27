package com.dio;

import javax.lang.model.type.NullType;

public class Emprestimo {
    public static float valorParcela(float valorTotal,int numeroParcelas) {
        float valorParcela;
        if (numeroParcelas == 1){
            return valorTotal;
        }
        else if (numeroParcelas == 2){
            valorTotal = valorTotal*1.2f;
        }
        else if (numeroParcelas == 3){
            //valorTotal = Emprestimo.valorParcela(valorTotal,--numeroParcelas);
            valorTotal*=1.2f;
        }
        else return 0;
        valorParcela = valorTotal/numeroParcelas;
        //System.out.println("O valor por parcela é: " + valorParcela);
        return valorParcela;
    }
}

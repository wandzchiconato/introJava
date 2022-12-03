//1 - Pacotes
package com.wandz.introjava;


// 2 - referencia as Bibliotecas


// 3 - Classe

public class medidas {        // Classe Publica

    //3.1 - Atributos

    // 3.2 - metodos
    public static void main(String[] args) {
    calcularModoCurto();
    calculoExtenso();
    }

    public static void calcularModoCurto() {

        System.out.println("Calculo de area modo curto");

        int largura = 4;
        int comprimento = 3;

        System.out.println("Para a Largura de " + largura + "m" + " e o comprimento de " + comprimento + "m" + " a area eh de "
                + largura * comprimento + "m2");
    }


    //calculo reduzido

    public static void calculoExtenso() {
        System.out.println("Calculo de area modo extenso");
        //calculo de area - Ex: tamanho do piso
        int largura;
        int comprimento;
        int resultado;

        largura = 4;
        comprimento = 7;
        resultado = largura * comprimento;
        System.out.println("Para a Largura de " + largura + "m" + " e o comprimento de " + comprimento + "m" + " a area eh de "
                + resultado + "m2");

    }


//char controla as letras, string texto
}

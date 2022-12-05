//1 - Pacotes
package com.wandz.introjava;


// 2 - referencia as Bibliotecas


// 3 - Classe

import java.sql.SQLOutput;
import java.util.Scanner;

public class medidas {        // Classe Publica

    //3.1 - Atributos

    // 3.2 - metodos
    public static void main(String[] args) {
        //utilizar a classe scanner do java pra ler a escolha do usuario na console

        Scanner scanner = new Scanner(System.in);
        System.out.println("M E N U D E O P Ç O E S ");
        System.out.println("c - Calcular modo curto ");
        System.out.println("d - Contar ate 10 ");
        System.out.println("e - Calcular modo Extenso ");
        System.out.println("i - Calcular IF Simples");
        System.out.println("r - Contagem regressiva");
        System.out.println("Qual a opcao desejada: ");

        String opcao = scanner.next();
        //Switch - seleciona o comportamento do programa conforme escolha

        //String opcao = "dunha";

        switch (opcao) {

            case "c":
            case "C":
                System.out.println("voce escolheu utilizar o metodo curto");
                calcularModoCurto();
                break;

            case "d":
            case "D":
                System.out.println("Contar ate 10");
                contarAteDez();
                break;

            case "e":
            case "E":
                System.out.println("Voce escolheu uma opcao inexistente");
                calculoExtenso();
                break;

            case "i":
            case "I":
                System.out.println("voce escolheu utilizar o If Simples");
                ifSimples();
                break;

            case "r":
            case "R":
                System.out.println("voce escolheu Contagem regressiva");
                contagemRegressiva();
                break;


            default:
                System.out.println("Nada encontrado");
                break;
        }


    }

    public static void ifSimples() {
        //Condicional = verifica uma condicao, faz uma pergunta

        String modo = "curto";

        if (modo == "curto") {
            calcularModoCurto();
        } else
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

    public static void contarAteDez() {

        //Loops ou repeticoes
        // for = repetição incondicional
        System.out.println("Contagem Crescente");
        for (int numero = 1; numero <= 10; numero++) {
            System.out.println(numero);


        }

    }


    public static void contagemRegressiva(){
        for (int numero = 10; numero >=0; numero--){
            System.out.println(numero);
        }

    }


//char controla as letras, string texto
}

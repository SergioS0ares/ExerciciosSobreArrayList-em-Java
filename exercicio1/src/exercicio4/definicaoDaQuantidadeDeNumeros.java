/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author sergy
 */
public class definicaoDaQuantidadeDeNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> numerosInteiros = new ArrayList<Integer>();
        Random random = new Random();
        int tamanhoDaArrayList = 1;
        
        System.out.println("Informe o tamanho da ArrayList:");
        tamanhoDaArrayList = entrada.nextInt();
        for (int i = 0; i < tamanhoDaArrayList; i++) {
            int numeroAleatorio = random.nextInt(101);
            numerosInteiros.add(numeroAleatorio);
        }
        System.out.println("Ordem original:"+numerosInteiros);
        Collections.sort(numerosInteiros);
        System.out.println("Ordem Crecente:"+numerosInteiros);
        Collections.reverse(numerosInteiros);
        System.out.println("Ordem Decrecente:"+numerosInteiros);
        
    }
}

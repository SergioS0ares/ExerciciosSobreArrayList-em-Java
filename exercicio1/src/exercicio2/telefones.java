/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio2;

import static java.awt.AWTEventMulticaster.add;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sergy
 */
public class telefones {
     public static void main(String[] args) {
        ArrayList<String> telefones = new ArrayList<String>();
        Scanner entrada = new Scanner(System.in);
        String opc = "";
        int removerTelefone = 0;
        do{
            System.out.println("Escolha uma opção:\n(a) adicionar telefone\n(r) remover telefone\n(l) listar telefones\n(s) Sair.");
            opc = entrada.nextLine();
            if(opc.equals("a")){
                System.out.println("Digite o telefone:");
                String adicionarTelefone = entrada.nextLine();
                telefones.add(adicionarTelefone);
            }else if(opc.equals("r")){
                if(telefones.size() == 0){
                    System.out.println("Não há telefones para remover.");
                }else{
                    System.out.println("Digite o número do telefone que deseja remover:");
                    try{
                        removerTelefone = entrada.nextInt();
                        entrada.nextLine();
                        telefones.remove(removerTelefone - 1);
                        System.out.println("Telefone removido com sucesso.");
                    }catch(Exception e){
                        System.out.println("Opção inválida. Digite um número de telefone válido.");
                        entrada.nextLine();
                    }
                }
            }else if(opc.equals("l")){
                if(telefones.size() == 0){
                    System.out.println("Não há telefones cadastrados.");
                }else{
                    System.out.println("Lista de telefones:");
                    for(int i = 0; i < telefones.size(); i++){
                        System.out.println((i+1) + " - " + telefones.get(i));
                    }
                }
            }else if(opc.equals("s")){
                System.out.println("Finalizado.");
            }else{
                System.out.println("Opção inválida. Digite uma opção válida.");
            }
        }while(!opc.equals("s"));
    }
}

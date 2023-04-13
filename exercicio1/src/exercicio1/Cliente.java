/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author sergy
 */
public class Cliente {
    
private int id = 0;
private String nome="";
private int idade = 0;
private int telefone = 0;

public Cliente(int id, String nome, int idade, int telefone){
    this.id = id;
    this.nome = nome;
    this.idade = idade;
    this.telefone = telefone;
    
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    public static void main(String[] args) {
    ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        Scanner entrada = new Scanner(System.in);
     int id;
     String nome;
     int idade;
     int telefone;
        do{   
            
        System.out.println("Informe o seu ID: (negativo para sair):");
        id = entrada.nextInt();
        entrada.nextLine();
        if(id<0){break;}
        
        System.out.println("Informe o seu nome:");
         nome = entrada.nextLine();
        
        System.out.println(nome+" Informe a sua idade:");
        idade = entrada.nextInt();
        entrada.nextLine(); // Nota: Consome a quebra de linha deixada pelo nextInt()
        
        System.out.println(nome+" Informe o seu telefone:");
        telefone = entrada.nextInt();
          
        Cliente cliente = new Cliente(id, nome, idade, telefone);
        clientes.add(cliente);

        } while(id >= 0);
        for (Cliente cliente : clientes) {
            System.out.println("ID: " + cliente.getId() + " | Nome: " + cliente.getNome() + " | Idade: " + cliente.getIdade() + " | Telefone: " + cliente.getTelefone());
        }
                
            
    }

}

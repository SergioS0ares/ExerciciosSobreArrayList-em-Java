/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sergy
 */
public class Principal {
    public static void main(String[] args) {
 Scanner entrada = new Scanner(System.in);
 ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();
 int opc;
 int aprovados = 0;
 int reprovados = 0;
 int exame = 0;
 float mediaDaClasse = 0.0f;
 float maiorMedia = 0.0f;
 float menorMedia = 10.0f;
 String nomeMaiorMedia = "";
 String nomeMenorMedia = "";
 
 do{
     
     System.out.println("Digite os dados do aluno " +(listaAlunos.size()+1)+":");
     System.out.println("Informe o numero da Matricula:");
     int numeroDeMatricula = entrada.nextInt();
     entrada.nextLine();
     System.out.println("Informe seu nome:");
     String nome = entrada.nextLine();
     System.out.println(nome+" Informe a nota do primeiro bimestre:");
     float notaBimestre1 = entrada.nextFloat();
     entrada.nextLine();
     System.out.println(nome+" Informe a nota do segundo bimestre:");
     float notaBimestre2 = entrada.nextFloat();
     entrada.nextLine();
     float media= (notaBimestre1 + notaBimestre2)/2;
     System.out.println(nome+" obteve média:"+media);
     
     if( media >= 0 && media <= 4){
     System.out.println("Reprovado");
     reprovados++;
     }else if(media >= 4 && media < 6){
         System.out.println("Exame");
         exame++;
     }else if(media >= 6 && media <= 10){
             System.out.println("Aprovado");
             aprovados++;
         }
     mediaDaClasse += media;

            if (media > maiorMedia) {
                maiorMedia = media;
                nomeMaiorMedia = nome;
            }

            if (media < menorMedia) {
                menorMedia = media;
                nomeMenorMedia = nome;
            }
     
     Aluno aluno = new Aluno(numeroDeMatricula, nome, notaBimestre1, notaBimestre2);
     listaAlunos.add(aluno);
     System.out.println("Deseja continuar? (1- Sim; 0- Não):");
     opc = entrada.nextInt();
     entrada.nextLine();
 }while(opc == 1);
 for (Aluno a : listaAlunos){
System.out.println("Total de alunos:"+listaAlunos.size()+" | Numero da Matricula: " + a.getNumeroDeMatricula()+" | Nome: " + a.getNome() + " | Nota do primeiro Bimestre: " + a.getNotaBimestre1()+ " | Nota do segundo Bimestre: " + a.getNotaBimestre2());
                    }  
System.out.println("Total de alunos Aprovados:"+aprovados+"\nTotal de alunos Reprovados:"+reprovados+"\nTotal de alunos em Exame:"+exame+"\nMédia da classe:"+(mediaDaClasse /listaAlunos.size())+"\nAluno com a maior média:" + nomeMaiorMedia + " - Média: " + maiorMedia+"\nAluno com a menor média: " + nomeMenorMedia + " - Média: " + menorMedia);
 }
 }
    


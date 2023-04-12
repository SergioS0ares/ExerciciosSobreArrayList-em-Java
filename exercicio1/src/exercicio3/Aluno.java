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
public class Aluno {
  
private int numeroDeMatricula = 0;
private String nome = "";
private float notaBimestre1 = 0;
private float notaBimestre2 = 0;

 public Aluno(int numeroDeMatricula,String nome,float notaBimestre1, float notaBimestre2){
   this.numeroDeMatricula = numeroDeMatricula;
   this.nome = nome;
   this.notaBimestre1 = notaBimestre1;
   this.notaBimestre2 = notaBimestre2;
 }

    public int getNumeroDeMatricula() {
        return numeroDeMatricula;
    }

    public void setNumeroDeMatricula(int numeroDeMatricula) {
        this.numeroDeMatricula = numeroDeMatricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNotaBimestre1() {
        return notaBimestre1;
    }

    public void setNotaBimestre1(float notaBimestre1) {
        if (notaBimestre1 >= 0.0 && notaBimestre1 <= 10.0) {
            this.notaBimestre1 = notaBimestre1;
        } else {
            throw new IllegalArgumentException("A nota deve estar entre 0.0 e 10.0");
        }
    }

    public float getNotaBimestre2() {
        return notaBimestre2;
    }

    public void setNotaBimestre2(float notaBimestre2) {
         if (notaBimestre2 >= 0.0 && notaBimestre2 <= 10.0) {
            this.notaBimestre2 = notaBimestre2;
        } else {
            throw new IllegalArgumentException("A nota deve estar entre 0.0 e 10.0");
        }
    }
    
}


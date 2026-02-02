package com.example.Classes;

import java.util.Scanner;

public class App {
    

    public static void main(String[] args) {
        
       float peso = 50.0f;
       float altura = 1.50f;
        
        
        Pessoa objetoPessoa = new Pessoa(peso, altura); //variável não primitiva
        
        Scanner leitor = new Scanner(System.in);
       
        System.out.println("Digite o peso da pessoa");
        objetoPessoa.setPeso(leitor.nextFloat());
        System.out.println("Digite a altura da pessoa");
        objetoPessoa.setAltura(leitor.nextFloat());
        
        
        System.out.println("IMC = " + objetoPessoa.calcularIMC());
        
        
    }
}

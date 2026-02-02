
package com.example.Classes;


public class Pessoa {
    
    //atributos
     private float peso; 
     private float altura;
     
     public Pessoa(float peso, float altura){ // método construtor //ele é executado quando instanciamos um objeto
         this.peso = peso;
         this.altura = altura;//this acessa o atributo
         
     }
    
    
    public float calcularIMC(){ //a solicitação da resposta é float //o nome do médtodo explica o que será feito no infinitivo
        float imc = peso / (altura * altura);
        return imc;
        
        //public é um modificador de acesso
         
    }
    // métodos acessores
    public void setPeso (float peso){
        this.peso = peso;
    }
    
    public float getPeso (){
        return peso;
    }
    
    public void setAltura(float altura){
        this.altura = altura;
    }
    
    public float getAltura(){
        return altura;
    }
}

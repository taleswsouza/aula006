package com.aula.heranca.pessoa;

public class Pessoa {
    private String nome;
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    
    public void mostraClasse() {
        System.out.println("Classe Pessoa");
    }
}

package com.example.digita.listatelefonica;

public class Pessoas {
    public String nome;
    public String telefone;

    public Pessoas(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + " | Telefone: " + this.telefone;
    }

}

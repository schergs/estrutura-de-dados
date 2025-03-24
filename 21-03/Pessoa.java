package atividade;

public class Pessoa {
    private String nome;
    private String email;

    public Pessoa(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;//getter e setter padrao de galo
    }

    public String getEmail() {
        return email;
    }

    public String toString() {//to string pra ficar daora
        return "nome: " + nome + " email: " + email;
    }
}

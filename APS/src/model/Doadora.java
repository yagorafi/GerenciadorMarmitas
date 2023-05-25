package model;

public class Doadora {
    private String nome;
    private int idade;

    public Doadora(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public void separarMarmitas() {
        System.out.println("Funcionario " + nome + " esta separando as marmitas.");
    }

    public void empacotarMarmitas() {
        System.out.println("Funcionario " + nome + " esta empacotando as marmitas.");
    }
}

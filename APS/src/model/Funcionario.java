package model;

public class Funcionario {
    private String nome;
    private int idade;

    public Funcionario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // getters e setters

    public void separarMarmitas() {
        System.out.println("Funcionario " + nome + " esta separando as marmitas.");
    }

    public void empacotarMarmitas() {
        System.out.println("Funcionario " + nome + " esta empacotando as marmitas.");
    }

    public void enviarMarmitas(Logistica logistica) {
        System.out.println("Funcionario " + nome + " esta enviando as marmitas para a logistica.");
        logistica.receberMarmitas();
    }
}

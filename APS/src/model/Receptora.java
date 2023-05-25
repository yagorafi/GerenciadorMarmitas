package model;

public class Receptora {
    private String nome;
    private String endereco;

    public Receptora(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    // getters e setters

    public void receberMarmitas() {
        System.out.println("Receptor " + nome + " esta recebendo as marmitas no endereco: " + endereco+"\nA entrega foi registrada no banco de dados");
    }
}
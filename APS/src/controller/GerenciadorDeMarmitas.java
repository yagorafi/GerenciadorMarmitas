package controller;
public class GerenciadorDeMarmitas implements view.Tela {
    private int quantidadeAtual;
    private int quantidadeDisponiveis;

    public GerenciadorDeMarmitas(int quantidadeDisponiveis) {
        this.quantidadeDisponiveis = quantidadeDisponiveis;
        this.quantidadeAtual = quantidadeDisponiveis;
    }

    @Override
    public void pedirMarmita() {
               if (quantidadeAtual > 0) {
            quantidadeAtual--;
            System.out.println("Marmita pedida com sucesso!");
        } else {
            System.out.println("Não ha mais marmitas disponíveis.");
    }
  // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void listarMarmitas(){
        System.out.println("Quantidade de marmitas disponiveis: " + quantidadeAtual);
    }
      // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

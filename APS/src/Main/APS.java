package Main;

public class APS {
    public static void main(String[] args) {
        controller.GerenciadorDeMarmitas gerenciador = new controller.GerenciadorDeMarmitas(10);
        gerenciador.listarMarmitas();
        gerenciador.pedirMarmita();
        gerenciador.listarMarmitas();

        model.Doadora doadora = new model.Doadora("Victor", 23);
        doadora.separarMarmitas();
        doadora.empacotarMarmitas();

        model.Logistica logistica = new model.Logistica(1234, true);
        model.Funcionario funcionario = new model.Funcionario("Yago", 20);
        funcionario.separarMarmitas();
        funcionario.empacotarMarmitas();
        funcionario.enviarMarmitas(logistica);

        logistica.entregar();

        model.Receptora receptora = new model.Receptora("Lucas", "R. da Paz, 797");
        receptora.receberMarmitas();
    }
    
}

package model;

public class Logistica {
    private int codRastreio;
    private boolean pago;

    public Logistica(int codRastreio, boolean pago) {
        this.codRastreio = codRastreio;
        this.pago = pago;
    }

    // getters e setters

    public void receberMarmitas() {
        if (pago) {
            System.out.println("Logistica recebeu as marmitas. Codigo de rastreamento: " + codRastreio);
        } else {
            System.out.println("Nao é possivel receber as marmitas. Pagamento pendente.");
        }
    }

    public void entregar() {
        if (pago) {
            System.out.println("Entrega realizada com sucesso. Codigo de rastreamento: " + codRastreio);
        } else {
            System.out.println("Nao e possível realizar a entrega. Pagamento pendente.");
        }
    }
}

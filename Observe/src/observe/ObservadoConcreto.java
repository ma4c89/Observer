package observe;

public class ObservadoConcreto implements Observador {
    private SujeitoConcreto sujeito;

    public ObservadoConcreto(SujeitoConcreto sujeito) {
        this.sujeito = sujeito;
    }

    @Override
    public void atualizar() {
        System.out.println("Nova informação recebida: " + sujeito.getInformacao() + "\n");
    }
}

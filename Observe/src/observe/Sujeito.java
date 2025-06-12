package observe;

import java.util.ArrayList;
import java.util.List;

public abstract class Sujeito {
    protected List<Observador> observados;

    public Sujeito() {
        observados = new ArrayList<>();
    }

    public void cadastra(Observador observado) {
        this.observados.add(observado);
    }

    public void remove(Observador observado) {
        this.observados.remove(observado);
    }

    public void notifica() {
        for (int i = 0; i < this.observados.size(); i++) {
            System.out.println("Objeto (" + i + ") notificador");
            this.observados.get(i).atualizar();
        }
    }
}

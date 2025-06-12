package observe;

public class Main {
    public static void main(String[] args) {

        SujeitoConcreto sujeito = new SujeitoConcreto(); // objeto observado

        Observador o1 = new ObservadoConcreto(sujeito);  // objeto observador
        Observador o2 = new ObservadoConcreto(sujeito);  // objeto observador

        sujeito.cadastra(o1); // cadastro do observador 1
        sujeito.cadastra(o2); // cadastro do observador 2
        sujeito.remove(o2); // remove o segundo observador
        
        sujeito.setInformacao("PROMOÇÃO: notebook gamer R$ 4.000,00");
        sujeito.notifica(); // notifica todos os observadores

        sujeito.setInformacao("PROMOÇÃO: notebook gamer R$ 3.200,00");
        sujeito.notifica(); // nova notificação

        sujeito.remove(o2); // remove o segundo observador

        sujeito.setInformacao("PROMOÇÃO: notebook gamer R$ 2.900,00");
        sujeito.notifica(); // agora só o o1 receberá
    }
}

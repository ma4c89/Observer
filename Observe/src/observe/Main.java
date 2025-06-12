package observe;

public class Main {
    public static void main(String[] args) {

        SujeitoConcreto sujeito = new SujeitoConcreto(); 

        Observador o1 = new ObservadoConcreto(sujeito);  
        Observador o2 = new ObservadoConcreto(sujeito);  

        sujeito.cadastra(o1); 
        sujeito.cadastra(o2); 
        
        sujeito.remove(o2); 
        
        sujeito.setInformacao("PROMOÇÃO: notebook gamer R$ 4.000,00");
        sujeito.notifica(); 
        
        sujeito.setInformacao("PROMOÇÃO: notebook gamer R$ 3.200,00");
        sujeito.notifica(); 


        sujeito.setInformacao("PROMOÇÃO: notebook gamer R$ 2.900,00");
        sujeito.notifica(); 
    }
}

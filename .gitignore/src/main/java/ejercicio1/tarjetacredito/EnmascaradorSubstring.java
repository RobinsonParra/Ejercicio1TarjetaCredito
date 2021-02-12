package ejercicio1.tarjetacredito;

public class EnmascaradorSubstring {
    
    public String enmascarar(String numeroTarjeta){
        String numeroEnmascarado = numeroTarjeta.substring(0, 4) + " XXXX XXXX " + numeroTarjeta.substring(15, 19);
        return numeroEnmascarado;
    }
    
}

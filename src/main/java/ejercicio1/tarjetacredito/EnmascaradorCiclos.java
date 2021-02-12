package ejercicio1.tarjetacredito;

public class EnmascaradorCiclos {
    
    public String enmascarar (String numeroTarjeta){
        String numEnmascarado = "";
                
        for (int pos = 0; pos < 4; pos++){ 
            char c = numeroTarjeta.charAt(pos);
            numEnmascarado = numEnmascarado + c;
        }
        
        numEnmascarado = numEnmascarado + " XXXX XXXX "; 
        
        for (int pos = 15; pos < 19; pos++){ 
            char c = numeroTarjeta.charAt(pos);
            numEnmascarado = numEnmascarado + c;
        }
        
        return numEnmascarado;
    }
    
}

package ejercicio1.tarjetacredito;

import java.io.*;

public class Main {
    
    public static void main (String[] args) throws IOException{   
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        System.out.println("Por favor escriba el numero de su tarjeta de credito separando los grupos de 4 digitos con un espacio: ");
        String numeroTarjeta = reader.readLine();
        
        while (numeroTarjeta.length() != 19){
            System.out.println("El numero de tarjeta ingresado no es valido. por favor ingrese el numero en este formato 5678 9889 7563 9875");
            numeroTarjeta = reader.readLine();
        }
        
        System.out.println("El numero ingresado es: " + numeroTarjeta);
        
        EnmascaradorSubstring enmascarador1 = new EnmascaradorSubstring();
        String numeroEnmascarado = enmascarador1.enmascarar(numeroTarjeta);
        System.out.println("El numero enmasacarado (substring) es: " + numeroEnmascarado);
        
        EnmascaradorCiclos enmascarador2 = new EnmascaradorCiclos();
        String numEnmascarado = enmascarador2.enmascarar(numeroTarjeta);
        System.out.println("El numero enmasacarado (ciclos) es: " + numEnmascarado);
    }
}

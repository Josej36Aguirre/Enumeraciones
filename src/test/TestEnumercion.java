package test;

import enumeracion.Continentes;
import enumeracion.Dias;

public class TestEnumercion {

    public static void main(String[] args) {
//        System.out.println("Dia 1: " + Dias.LUNES);        
//        indicarDiaSemana(Dias.DOMINGO);

        System.out.println("Continente no. paises = "+Continentes.AFRICA.getPaises()+", COntinen = "+Continentes.AFRICA);
        System.out.println("Continente no. paises = "+Continentes.AMERICA.getPaises()+", COntinen = "+Continentes.AMERICA);
//        System.out.println("COntinen");
    }
    
    private static void indicarDiaSemana(Dias dias) {
        switch (dias) {
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
            case MIERCOLES:
                System.out.println("Tercer dia de la semana");
                break;
            case JUEVES:
                System.out.println("Cuarto dia de la semana");
                break;
            case VIERNES:
                System.out.println("Quinto dia de la semana");
                break;
            case SABADO:
                System.out.println("Sexto dia de la semana");
                break;
            case DOMINGO:                
                System.out.println("Ultimo dia de la semana o septimo dia");
        }
    }
}

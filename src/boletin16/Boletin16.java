package boletin16;

import boletin16.persoal.Persoal;

public class Boletin16 {

    public static void main(String[] args) {
        Persoal alum1 =  new Persoal("698123589","pepeRodriguez@gmail.com");
        Notas notaAlum1 = new Notas();
        notaAlum1.calcularNotas();
        Academica acAlm1 = new Academica("Pepe",notaAlum1,alum1);
        
        System.out.println(acAlm1.toString());
        
        
        Persoal alum2 =  new Persoal("678459632","LuciaPerez@gmail.com");
        Notas notaAlum2 = new Notas();
        notaAlum2.calcularNotas();
        Academica acAlm2 = new Academica("Lucia",notaAlum2,alum2);
        
        System.out.println(acAlm2.toString());
    }
    
}

package boletin16;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import validarNota.ValidarNota;

public class Notas {
    private float probaEscrita;
    private float probaPractica;
    private int boletins;
    private float nota;
   
    
    public void porcentaxeProbaEscrita(float nota1, float nota2){
        float media = (nota1+nota2)/2;
        probaEscrita=(media*4)/10;
    }
    
    public void porcentaxeProbaPractica(float nota){
        probaPractica=(nota*4)/10;
    }
    
    public void porcentaxeBoletins(int boletinsFeitos){
        int porcentaxe=(boletinsFeitos*100)/17;
        
        if (porcentaxe>90){
            boletins=2;
        }
        else if (porcentaxe<=90 && porcentaxe>=70){
            boletins=1;
        }
        else{
            boletins=0;
        }
    }
    public void notaFinal(){
        nota=probaEscrita+probaPractica+boletins;
    }
    
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00"); 
        return "\n PROBAS TEÓRICAS…………… "+df.format(probaEscrita)+" \n"+
               " PROBAS PRÁCTICA…………… "+df.format(probaPractica)+" \n"+
               " BOLETÍNS  ………………………. "+boletins+" \n"+ 
               " NOTA TOTAL…………………… "+df.format(nota)+" \n";
    }
    
    public void calcularNotas(){
        float nota1 = Float.parseFloat(JOptionPane.showInputDialog(null, 
            "Introduce la nota del primer examen teorico", 
            JOptionPane.QUESTION_MESSAGE));
        nota1 = ValidarNota.notaCorrecta(nota1);
      
        float nota2 = Float.parseFloat(JOptionPane.showInputDialog(null, 
            "Introduce la nota del segundo examen teorico", 
            JOptionPane.QUESTION_MESSAGE));
        nota2 = ValidarNota.notaCorrecta(nota2);
        
        this.porcentaxeProbaEscrita(nota1, nota2);
        float nota3 = Float.parseFloat(JOptionPane.showInputDialog(null, 
            "Introduce la nota del examen practico", 
            JOptionPane.QUESTION_MESSAGE));
        nota3 = ValidarNota.notaCorrecta(nota3);
        
        this.porcentaxeProbaPractica(nota3);
        int boletines = Integer.parseInt(JOptionPane.showInputDialog(null, 
            "Introduce el umero de boletines entregados", 
            JOptionPane.QUESTION_MESSAGE));
        boletines = ValidarNota.numBoletines(boletines);
        
        this.porcentaxeBoletins(boletines);
        this.notaFinal();
    }

}

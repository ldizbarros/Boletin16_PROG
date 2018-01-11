package validarNota;

import javax.swing.JOptionPane;

public class ValidarNota {
    public static float notaCorrecta(float nota){
        while (nota<0 || nota>10){
            nota = Float.parseFloat(JOptionPane.showInputDialog(null, 
            "Nota incorrecta. Introduece una nueva", 
            JOptionPane.QUESTION_MESSAGE));
        }
        return nota;
    }
    
    public static int numBoletines(int boletines){
        while (boletines<0 || boletines>17){
            boletines =  Integer.parseInt(JOptionPane.showInputDialog(null, 
            "Numero de boletines incorrecto. Intentalo de nuevo", 
            JOptionPane.QUESTION_MESSAGE));
        }
        return boletines;
    }
}

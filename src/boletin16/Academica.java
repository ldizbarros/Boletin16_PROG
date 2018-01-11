package boletin16;

import boletin16.persoal.Persoal;

public class Academica {

    private static int numReferencia = 2018;
    private String nome;
    private Notas nota;
    private Persoal alumno;

    public Academica() {
    }

    public Academica(String nome, Notas nota, Persoal alumno) {
        this.nome = nome;
        this.nota = nota;
        this.alumno = alumno;
        numReferencia += 1;
    }

    public static int getNumReferencia() {
        return numReferencia;
    }

    public String getNome() {
        return nome;
    }

    public Notas getNota() {
        return nota;
    }

    public Persoal getAlumno() {
        return alumno;
    }

    public static void setNumReferencia(int numReferencia) {
        Academica.numReferencia = numReferencia;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota(Notas nota) {
        this.nota = nota;
    }

    public void setAlumno(Persoal alumno) {
        this.alumno = alumno;
    }

    @Override
    public String toString() {
        return "Numero de referencia: "+numReferencia+"\nNome: " + nome + "\n" + alumno +"\nNotas: " +nota;
    }

}

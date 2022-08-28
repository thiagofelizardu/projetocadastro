package br.ufpb.br.DadosAcademico;


public class Turma {
    private String numeroTurma;

    public Turma (String numeroTurma){
        this.numeroTurma = numeroTurma;
    }

    public String toString(){
        return ("Numero da Turma :" + this.numeroTurma);
    }
     
    public String getNumeroTurma() {
        return this.numeroTurma;
    }

    public void setNumeroTurma(String numeroTurma) {
        this.numeroTurma = numeroTurma;
    }

}

package br.ufpb.br.DadosAcademico;


public class Turma {
    private String numeroTurma;
    private String nomeAluno;
    private String matricula;

    public Aluno (String nomeAluno,matricula)

    public Turma (String numeroTurma){
        this.numeroTurma = numeroTurma;
        this.matricula = matricula;
        this.nomeAluno = nomeAluno;
    }

    public String toString(){
        return ("Numero da Turma : " + this.numeroTurma);
    }
     
    public String getNumeroTurma() {
        return this.numeroTurma;
    }

    public void setNumeroTurma(String numeroTurma) {
        this.numeroTurma = numeroTurma;
    }









    

}

package br.ufpb.br.DadosAcademico;

public  class Aluno {

    private String nome;
    private String matricula;

    public Aluno (String nome, String matricula){
        this.matricula = matricula;
        this.nome = nome;

    }

    public String toString(){
        return ("Aluno \nNome : "+this.nome+"\nMatricula : "+this.matricula);
    }

    public String getMatricula() {
        return this.matricula;
    }
    public String getNome() {
        return this.nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
}
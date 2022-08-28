package br.ufpb.br.DadosAcademico;


public class Disciplina {

    private String codigo;
    private String  nome;

    public Disciplina (String codigo, String nome ){
        this.nome =nome;
        this.codigo = codigo;
    }

    public String toString(){
        return ("\nDisciplina \nNome : = "+this.nome+"\nCodigo : = "+this.codigo);
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

 
}
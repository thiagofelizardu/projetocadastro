package br.ufpb.br.DadosAcademico;

import java.util.ArrayList;
import java.util.List;

public class SistemaAcademicoList implements SistemaAcademico{
    private List<Aluno> alunos;
    private List<Disciplina> disciplinas;
    private List<Turma> turmas;

    public SistemaAcademicoList (){
        this.disciplinas = new ArrayList<Disciplina>();
        this.turmas = new ArrayList<Turma>();
        this.alunos = new ArrayList<Aluno>();
    }

    public boolean cadastrarDisciplina(Disciplina disciplina) {
        if(existeDisciplina(disciplina)){
            return false;
        }else {
            this.disciplinas.add(disciplina);
            return true;
        }
    }

    public boolean existeDisciplina(Disciplina disciplina) {
        for(Disciplina d: this.disciplinas){
            if(d.getCodigo().equals(disciplina.getCodigo())){
                return true;
            }
        }
        return false;

    }

    public Disciplina pesquisaDisciplina(String codigoDisciplina) throws DisciplinaNaoExisteException {
        for(Disciplina d: this.disciplinas){
        if(d.getCodigo().equals(codigoDisciplina)){
            return d;
        }    
        }
        throw new DisciplinaNaoExisteException("Não Existe uma Disciplina com esse Codigo !");

    }

    public List<Disciplina> getDisciplina() {
        return this.disciplinas;
    }

  
    public boolean cadastrarTurma(Turma turma) {
        if(existeTurma(turma)){
            return false;
        }else{
            this.turmas.add(turma);
           return true; 
        }
    }


    public boolean existeTurma(Turma turma) {
        for(Turma t: this.turmas){
          if(t.getNumeroTurma().equals(turma.getNumeroTurma())) {
            return true;
          } 
        }
        return false;
    }

  
    public Turma pesquisaTurma(String numeroTurma) throws TurmaNaoExtisteException {
     for(Turma t: this.turmas){
        if(t.getNumeroTurma().equals(numeroTurma)){
            return t;
        }
     }
        throw new TurmaNaoExtisteException("Não Existe uma Turma com esse Numero");
    }
  
    public List<Turma> getNumeroTurma() {
        return this.turmas;
    }


    public boolean cadastrarAluno(Aluno aluno) {
        if(existeAluno(aluno)){
            return false;
        }else{
            this.alunos.add(aluno);
            return true;
        }
        
    }


    public boolean existeAluno(Aluno aluno) {
        for(Aluno a: this.alunos){
            if(a.getMatricula().equals(aluno.getMatricula())){
                return true;
            }
        }
        return false;
    }

  
    public Aluno pesquisaAluno(String matriculaAluno) throws AlunoNaoExisteexception {
        for(Aluno a: this.alunos ){
            if(a.getMatricula().equals(matriculaAluno)){
                return a;
            }
        }
         throw new AlunoNaoExisteexception(" Não Existe um Aluno com essa Matricula");
    }

 
    public List<Aluno> getAluno() {
        return this.alunos;
    }

}

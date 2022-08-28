package br.ufpb.br.DadosAcademico;

import java.util.List;

public interface SistemaAcademico {


    boolean cadastrarDisciplina(Disciplina disciplina);
    
    boolean existeDisciplina (Disciplina disciplina);

    Disciplina pesquisaDisciplina(String codigoDisciplina) throws DisciplinaNaoExisteException;

    List<Disciplina> getDisciplina();

    boolean cadastrarTurma (Turma turma);

    boolean existeTurma (Turma turma);

    Turma pesquisaTurma(String numeroTurma) throws TurmaNaoExtisteException;

    List <Turma> getNumeroTurma();
 
    boolean cadastrarAluno (Aluno aluno);

    boolean existeAluno (Aluno aluno);

    Aluno pesquisaAluno (String matriculaAluno) throws AlunoNaoExisteexception;

    List<Aluno> getAluno();
 



}

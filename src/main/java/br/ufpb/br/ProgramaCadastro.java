package br.ufpb.br;

import javax.swing.JOptionPane;

import br.ufpb.br.DadosAcademico.Aluno;
import br.ufpb.br.DadosAcademico.AlunoNaoExisteexception;
import br.ufpb.br.DadosAcademico.Disciplina;
import br.ufpb.br.DadosAcademico.DisciplinaNaoExisteException;
import br.ufpb.br.DadosAcademico.SistemaAcademico;
import br.ufpb.br.DadosAcademico.SistemaAcademicoList;
import br.ufpb.br.DadosAcademico.Turma;
import br.ufpb.br.DadosAcademico.TurmaNaoExtisteException;

public class ProgramaCadastro {
    public static void main( String[] args ) throws TurmaNaoExtisteException, AlunoNaoExisteexception{
        SistemaAcademico sistema = new SistemaAcademicoList();

            //Mesagem do começo do programa 
            JOptionPane.showMessageDialog(null, "Bem vindo ao sistema acadêmico de Thiago", "OLÁ", JOptionPane.INFORMATION_MESSAGE);// nao mexer


            boolean sair = false;
            while (!sair){

                int opc = Integer.parseInt(JOptionPane.showInputDialog( "Escolha uma OPÇÃO \n 1 -- Cadastrar Disciplina"
                +"\n 2 -- Cadastrar Turma e Alunos"
                +"\n 3 -- Listar Dados Cadastrados"
                +"\n 4 -- sair"));

                switch (opc) {
                    
                    case 1 ://Cadastrar Disciplina
                        String nomeDisciplina = JOptionPane.showInputDialog( "Digite o Nome da Disciplina:");
                        String codigoDisciplina = JOptionPane.showInputDialog("Digite o Codigo da Disciplina ");
                        Disciplina disciplina = null;
                        disciplina = new Disciplina(codigoDisciplina, nomeDisciplina);


                        if(disciplina != null){
                            boolean cadastrou = sistema.cadastrarDisciplina(disciplina);

                            if(cadastrou){
                                JOptionPane.showMessageDialog(null, "Disciplina Cadastrada com Sucesso");
                            }else{
                                JOptionPane.showMessageDialog(null, "Já existe uma Disciplina com Cadastrada com esse Codigo","ERRO",JOptionPane.ERROR_MESSAGE);
                            }
                        }
                    break;
                    
                    case 2://Cadastrar turma
                    String codigoPedido = JOptionPane.showInputDialog("Informe o Codigo da Disciplina para Cadastrar a Turma:");

                    Disciplina disciplinaPedida = null;
                    try{
                        disciplinaPedida = sistema.pesquisaDisciplina(codigoPedido);
                    }catch(DisciplinaNaoExisteException e){
                        JOptionPane.showMessageDialog(null,e.getMessage()+"    \n   \n(Cadastre uma Disciplina para Continuar!)","ERRO", JOptionPane.ERROR_MESSAGE);
                        break;
                    }
                    String numeroTurma = JOptionPane.showInputDialog( "Digite o Numero da Turma ");
                    Turma turma = null;
                    turma = new Turma(numeroTurma);

                    if( turma != null){

                        boolean cadastrou = sistema.cadastrarTurma(turma);

                        if(cadastrou){
                            JOptionPane.showMessageDialog(null,"Turma Cadastrada Com Sucesso !");
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Turma Já esta Cadastrada","ERRO",JOptionPane.ERROR_MESSAGE);
                        }

                        int quantAlunos = Integer.parseInt(JOptionPane.showInputDialog( "Digite quantos alunos deseja Cadastrar Nessa Turma:"));
                        for(int k= 0 ; k<quantAlunos; k++){
                            String matriculaA = JOptionPane.showInputDialog("Qual a Matricula do Aluno : ");
                            String nomeA = JOptionPane.showInputDialog("Qual o Nome do Aluno : ");
                            Aluno aluno = null;
                            aluno = new Aluno(nomeA, matriculaA);
                            if(aluno != null){

                                boolean cadastrouA =sistema.cadastrarAluno(aluno);

                                if(cadastrouA){
                                    JOptionPane.showMessageDialog(null,"Aluno Cadastrado Com Sucesso !");
                                }
                                else{
                                    JOptionPane.showMessageDialog(null,"Aluno Já esta Cadastrada","ERRO",JOptionPane.ERROR_MESSAGE);
                                }
                            }
                        }

                    }


                         break;

                    case 3://Listar Disciplina
                        String codigoEncontrado = JOptionPane.showInputDialog( "Digite Codigo da Disciplina que Deseja Pesquisar"); 
                        String turmaE = JOptionPane.showInputDialog("Digite o numero da Turma que Deseja Pesquisar ");
                        String alunoE = JOptionPane.showInputDialog("Digite a Matricula do Aluno que Deseja Pesquisar ");

                        try{
                            Aluno alunoAchado = sistema.pesquisaAluno(alunoE);
                            Turma turmaAchada = sistema.pesquisaTurma(turmaE);
                            Disciplina disciplinaAchada = sistema.pesquisaDisciplina(codigoEncontrado);
                            JOptionPane.showMessageDialog(null, "Dados Encontrados" + disciplinaAchada.toString() +"\n"+ turmaAchada.toString()+"\n"+ alunoAchado.toString());
                        }catch(DisciplinaNaoExisteException d){
                            JOptionPane.showMessageDialog(null, d.getMessage(),"ERRO",JOptionPane.ERROR_MESSAGE);
                        }catch(TurmaNaoExtisteException t){
                            JOptionPane.showMessageDialog(null, t.getMessage(),"ERRO",JOptionPane.ERROR_MESSAGE);
                        }catch(AlunoNaoExisteexception a){  
                            JOptionPane.showMessageDialog(null, a.getMessage(), "ERRo", JOptionPane.ERROR_MESSAGE);
                        }
                    break;

                    case 4:
                    sair = true;
                    break;
                    
                        }//fim do Swicth
              } //fim do while
             JOptionPane.showMessageDialog(null, "FIM DO PROGRAMA", "ALERTA", JOptionPane.WARNING_MESSAGE);//nao mexer
     }//fim do main

}   // fim da class       
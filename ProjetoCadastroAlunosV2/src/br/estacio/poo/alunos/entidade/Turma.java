package br.estacio.poo.alunos.entidade;

import java.util.ArrayList;

/**
 *
 * @author Newton
 */
public class Turma 
{
    private int codigo;
    private String disciplina;
    private String professor;
    private String curso;
    //"Sistemas de Informação", 
    //"Análise e Desenvolvimento de Sistemas",
    //"Redes de Computadores", 
    //"Telemática", 
    //"Jogos Digitais"
    private char turno; // ('M', 'T', 'N')
    
    private ArrayList<AlunoTurma> alunos;

    public Turma() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public char getTurno() {
        return turno;
    }

    public void setTurno(char turno) {
        this.turno = turno;
    }

    
    
 }

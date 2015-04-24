package br.estacio.poo.alunos.entidade;

/**
 *
 * @author Newton
 */
public class Aluno 
{
    private String matricula;
    private String nome;
    private char sexo;  // ('M' , 'F')
    private int idade;
    private String curso;
    //"Sistemas de Informação", 
    //"Análise e Desenvolvimento de Sistemas",
    //"Redes de Computadores", 
    //"Telemática", 
    //"Jogos Digitais"
    private char turno; // ('M', 'T', 'N')
    private boolean conhecimentoIngles;
    private boolean conhecimentoJava;
    private boolean conhecimentoPhp;
    private boolean conhecimentoC;
    private boolean conhecimentoNet;
    private boolean conhecimentoSql;

    public Aluno() {
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
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

    public boolean isConhecimentoIngles() {
        return conhecimentoIngles;
    }

    public void setConhecimentoIngles(boolean conhecimentoIngles) {
        this.conhecimentoIngles = conhecimentoIngles;
    }

    public boolean isConhecimentoJava() {
        return conhecimentoJava;
    }

    public void setConhecimentoJava(boolean conhecimentoJava) {
        this.conhecimentoJava = conhecimentoJava;
    }

    public boolean isConhecimentoPhp() {
        return conhecimentoPhp;
    }

    public void setConhecimentoPhp(boolean conhecimentoPhp) {
        this.conhecimentoPhp = conhecimentoPhp;
    }

    public boolean isConhecimentoC() {
        return conhecimentoC;
    }

    public void setConhecimentoC(boolean conhecimentoC) {
        this.conhecimentoC = conhecimentoC;
    }

    public boolean isConhecimentoNet() {
        return conhecimentoNet;
    }

    public void setConhecimentoNet(boolean conhecimentoNet) {
        this.conhecimentoNet = conhecimentoNet;
    }

    public boolean isConhecimentoSql() {
        return conhecimentoSql;
    }

    public void setConhecimentoSql(boolean conhecimentoSql) {
        this.conhecimentoSql = conhecimentoSql;
    }

    
 }

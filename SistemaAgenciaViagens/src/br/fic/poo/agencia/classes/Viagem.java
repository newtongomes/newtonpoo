package br.fic.poo.agencia.classes;
/**
 *
 * @author Newton
 */
public class Viagem 
{
    private String numeroVoo;
    private Companhia companhia;
    private String origem;
    private String destino;
    private int capacidade;
    private String horarioSaida;
    private String horarioChegada;
    private String dias;  //Dom,Seg,Ter,Qua,Qui,Sex,Sab (CheckBox)
    private String observacao;

    public Viagem()
    { }
    
    public Viagem(String numeroVoo, Companhia companhia, String origem, 
            String destino, int capacidde, String horarioSaida, 
            String horarioChegada, String dias, String observacao) {
        this.numeroVoo = numeroVoo;
        this.companhia = companhia;
        this.origem = origem;
        this.destino = destino;
        this.capacidade = capacidde;
        this.horarioSaida = horarioSaida;
        this.horarioChegada = horarioChegada;
        this.dias = dias;
        this.observacao = observacao;
    }

    public String getNumeroVoo() {
        return numeroVoo;
    }

    public void setNumeroVoo(String numeroVoo) {
        this.numeroVoo = numeroVoo;
    }

    public Companhia getCompanhia() {
        return companhia;
    }

    public void setCompanhia(Companhia companhia) {
        this.companhia = companhia;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getHorarioSaida() {
        return horarioSaida;
    }

    public void setHorarioSaida(String horarioSaida) {
        this.horarioSaida = horarioSaida;
    }

    public String getHorarioChegada() {
        return horarioChegada;
    }

    public void setHorarioChegada(String horarioChegada) {
        this.horarioChegada = horarioChegada;
    }

    public String getDias() {
        return dias;
    }

    public void setDias(String dias) {
        this.dias = dias;
    }
       
    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
            
    
}

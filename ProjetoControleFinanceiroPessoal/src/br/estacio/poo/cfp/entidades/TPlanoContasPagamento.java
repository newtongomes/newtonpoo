package br.estacio.poo.cfp.entidades;

/**
 * CFP - Controle Financeiro Pessoal
 * @author Newton Gomes - 13/04/2015
 */
public enum TPlanoContasPagamento 
{
    MORADIA(1,"Casa/Moradia"),
    SUPERMERCADO(2,"Supermercado"),
    ALIMENTACAO(3,"Alimentação"),
    VESTUARIO(4,"Roupas/Vestuário"),
    COMBUSTIVEL(5,"Combustível"),
    VEICULO(6,"Manut.Veículo"),
    LAZER(7,"Lazer/Diversos"),
    OUTRA(8,"Outras Despesas");
    
    private Integer codigo;
    private String descricao;
    
    TPlanoContasPagamento(Integer codigo, String descricao)
    {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }
    
}

package br.fic.poo.teleentrega.persistencia;

import br.fic.poo.teleentrega.classes.*;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author francisco.newton
 */
public class DadosTeleEntrega implements Serializable
{
    // Padrão de Projeto Singleton
    private static DadosTeleEntrega dados;
    
    private ArrayList<Cliente> clientes;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Produto> produtos;
    private ArrayList<Entregador> entregadores;
    private ArrayList<Pedido> pedidos;

    private DadosTeleEntrega() {
        clientes = new ArrayList<Cliente>();
        usuarios = new ArrayList<Usuario>();
        produtos = new ArrayList<Produto>();
        entregadores = new ArrayList<Entregador>();
        pedidos = new ArrayList<Pedido>();
    }
    
    public static DadosTeleEntrega getInstancia()
    {
        if (dados == null)
        {
            dados = new DadosTeleEntrega();
        }
        return dados;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public ArrayList<Entregador> getEntregadores() {
        return entregadores;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    
}

/*
public class Biblioteca implements Serializable
{
    // Padrão Singleton
    private static Biblioteca bib; 
    
    private Pessoa proprietario;
    private ArrayList<Livro> livros;

    private Biblioteca()
    { }
    
    public static Biblioteca getInstance()
    {
        if (bib == null)
        {
            bib = new Biblioteca();
            bib.livros = new ArrayList<Livro>();
            bib.proprietario = new Pessoa();
        }
        return bib;
    }
    
    public void incluirLivro(Livro livro)
    {
        if (livro != null)
        {
            livros.add(livro);
        }
    }
    
    public Livro obterLivro(int cod)
    {
        for(Livro l : livros)
        {
            if (l.getCodigo() == cod)
                return l;
        }
        return null;
    }
    
    public ArrayList<Livro> obterListaLivro(String tit)
    {
        ArrayList<Livro> aux = new ArrayList<Livro>();
        for(Livro liv : livros)
        {
            if (liv.getTitulo().toUpperCase()
                    .indexOf(tit.toUpperCase()) >= 0)
                aux.add(liv);
        }
        if (aux.size() > 0)
            return aux;
        return null;
    }

    public Pessoa getProprietario() {
        return proprietario;
    }

    public void setProprietario(Pessoa proprietario) {
        this.proprietario = proprietario;
    }

    public void gravarDados()
    {
        try {
        BufferedWriter arq = new BufferedWriter(
                new FileWriter(new File("livros.txt")));
        StringBuilder str = new StringBuilder();
        //String dados[];
        
        for(Livro l : livros)
        {
            str.setLength(0);
            str.append(l.getCodigo());
            str.append(";"+l.getIsbn());
            str.append(";"+l.getTitulo());
            str.append(";"+l.getAutor());
            str.append(";"+l.getNumeroPaginas());
            str.append(";"+l.getValorCompra());
            str.append(";"+l.getIsbn());
            arq.write(str.toString());
            arq.newLine();
        }
        arq.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }

    public void lerDados()
    {
        try {
        BufferedReader arq = new BufferedReader(
                new FileReader(new File("livros.txt")));
        String dados[];
        String str;
        Livro liv;
        
        str = arq.readLine();
        while (str != null)
        {
            dados = str.split(";");
            liv = new Livro();
            liv.setCodigo(Integer.parseInt(dados[0]));
            liv.setIsbn(dados[1]);
            liv.setTitulo(dados[2]);
            liv.setAutor(dados[3]);
            liv.setNumeroPaginas(Integer.parseInt(dados[4]));
            liv.setValorCompra(Float.parseFloat(dados[5]));
            liv.setIsbn(dados[6]);
            incluirLivro(liv);
            str = arq.readLine();
        }
        arq.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
    
    public void lerBiblioteca() throws FileNotFoundException, IOException,
            ClassNotFoundException
    {
       FileInputStream arquivo = new FileInputStream("biblioteca.txt");
       ObjectInputStream input = new ObjectInputStream(arquivo);
       bib = (Biblioteca)input.readObject();        
    }
    
    public void gravarBiblioteca() throws FileNotFoundException, 
            IOException,
            ClassNotFoundException
    {
       FileOutputStream arquivo = new FileOutputStream("biblioteca.txt");
       ObjectOutputStream output = new ObjectOutputStream(arquivo);
       output.writeObject(bib);
       output.flush();
       output.close();
    }
    

}

*/

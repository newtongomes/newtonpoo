package tutorial.teste; 
 
import tutorial.persistencia.CreateTables; 
import tutorial.dao.PessoaDao; 
import tutorial.entidade.Pessoa; 
import java.util.List; 
import tutorial.dao.TelefoneDao;
import tutorial.entidade.Telefone;
 
/**
 *
 * @author Newton
 */
public class DerbyTest 
{ 
    public static void main(String[] args) { 
        //criarTabelas(); //testado 
        //inserirPessoas(); //testado 
        listarPessoas(); //testado 
        
        //alterarPessoas(); //testado
        excluirPessoas(); //testado
        listarPessoas(); //testado
        
        //listarTelefones();
        //inserirTelefones(); //testado 
        //alterarTelefones(); //testado
        //excluirTelefones(); //testado 
    } 
 
    private static void criarTabelas() { 
        new CreateTables().createTablePessoas(); 
        new CreateTables().createTableTelefones(); 
    } 
 
    private static void inserirPessoas() { 
        PessoaDao dao = new PessoaDao(); 
 
        Pessoa p1 = new Pessoa(); 
        p1.setNome("Ana Maria"); 
        p1.setIdade(65); 
        dao.save(p1); 
 
        Pessoa p2 = new Pessoa(); 
        p2.setNome("João Francisco"); 
        p2.setIdade(40); 
        dao.save(p2); 

    } 
 
    private static void listarPessoas() { 
        List<Pessoa> pessoas = new PessoaDao().findPessoas(); 
        for (Pessoa pessoa : pessoas) { 
            System.out.println("Derby.............:\n" + pessoa.toString()); 
        } 
    }
     
    private static void alterarPessoas() { 
        Pessoa pessoa = new PessoaDao().findByName("Ana Maria"); 
        pessoa.setNome("Ana Amélia"); 
        pessoa.setIdade(28); 
 
        new PessoaDao().update(pessoa); 
 
        listarPessoas();     
    } 
 
    private static void excluirPessoas() { 
        Pessoa pessoa = new PessoaDao().findByName("Ana Amélia"); 
 
        new PessoaDao().delete(pessoa); 
 
        listarPessoas();     
    }
 
    private static void inserirTelefones() { 
        Pessoa pessoa = new PessoaDao().findByName("João Francisco"); 
 
        Telefone t1 = new Telefone(); 
        t1.setIdPessoa(pessoa.getId()); 
        t1.setNumero("55 9141 6598"); 
        t1.setTipo(Telefone.TipoFone.RES.getDescricao()); 
        new TelefoneDao().save(t1); 
 
        Telefone t2 = new Telefone(); 
        t2.setIdPessoa(pessoa.getId()); 
        t2.setNumero("55 3333 0098"); 
        t2.setTipo(Telefone.TipoFone.RES.getDescricao()); 
        new TelefoneDao().save(t2); 
 
        Telefone t3 = new Telefone(); 
        t3.setIdPessoa(pessoa.getId()); 
        t3.setNumero("55 2222 6008"); 
        t3.setTipo(Telefone.TipoFone.RES.getDescricao()); 
        new TelefoneDao().save(t3); 
 
        listarTelefones();     
    } 
 
    private static void alterarTelefones() { 
        List<Telefone> telefones =  
      new TelefoneDao().findByNomePessoa("João Francisco"); 
         
  for (Telefone telefone : telefones) { 
            System.out.println("Derby.............:\n" + telefone.toString()); 
        } 
 
        Telefone t1 = telefones.get(0); 
        t1.setTipo(Telefone.TipoFone.CEL.getDescricao()); 
        new TelefoneDao().update(t1); 
 
        Telefone t2 = telefones.get(2); 
        t2.setTipo(Telefone.TipoFone.COM.getDescricao()); 
        new TelefoneDao().update(t2); 
         
        listarTelefones(); 
    } 
 
    private static void excluirTelefones() { 
        List<Telefone> telefones =  
      new TelefoneDao().findByNomePessoa("João Francisco"); 
         
  for (Telefone telefone : telefones) { 
            System.out.println("Derby.............:\n" + telefone.toString()); 
        } 
 
        new TelefoneDao().delete(telefones.get(1)); 
 
        listarTelefones(); 
    } 
 
    private static void listarTelefones() { 
        List<Telefone> telefones = new TelefoneDao().findTelefones(); 
        for (Telefone telefone : telefones) { 
            System.out.println("Derby.............:\n" + telefone.toString()); 
        } 
    }    
} 

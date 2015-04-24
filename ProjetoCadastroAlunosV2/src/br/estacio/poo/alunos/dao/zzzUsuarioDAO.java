package br.estacio.poo.alunos.dao;

import br.estacio.poo.alunos.entidade.Usuario;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Newton
 */
public class zzzUsuarioDAO
{
    private ArrayList<Usuario> dadosUsuarios;
    
    public zzzUsuarioDAO()
    {
        //!!DadosTeleEntrega dados = DadosTeleEntrega.getInstancia();
        //!!this.dadosUsuarios = dados.getUsuarios();
    }
    
    public boolean incluir(Usuario usuario)
    {
        int maxCodigo = 0;
        if (usuario != null)
        {
            if (usuario.getNome().isEmpty())
                return false;
            
            if (dadosUsuarios.size() > 0)
            {
                //!!Collections.sort(dadosUsuarios);  // codigo
                maxCodigo = dadosUsuarios.get(dadosUsuarios.size()-1)
                        .getCodigo();
            }
            usuario.setCodigo(maxCodigo+1);
            dadosUsuarios.add(usuario);
            return true;
        }
        return false;
    }
    
    public boolean alterar(Usuario usuario)
    {
        Usuario u;
        for(int i=0; i < dadosUsuarios.size(); i++)
        {
            u = dadosUsuarios.get(i);
            if (u.getCodigo() == usuario.getCodigo())
            {
                dadosUsuarios.set(i,usuario);
                return true;
            }
        }
        return false;
    }
    
    public boolean excluir(int codigo)
    {
        Usuario u;
        for(int i=0; i < dadosUsuarios.size(); i++)
        {
            u = dadosUsuarios.get(i);
            if (u.getCodigo() == codigo)
            {
                dadosUsuarios.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public Usuario consultar(int codigo)
    {
        for(Usuario u : dadosUsuarios)
        {
            if (u.getCodigo() == codigo)
                return u;
        }
        return null;
    }
    
    public ArrayList<Usuario> listaUsuariosNome(String pesquisar)
    {
        ArrayList<Usuario> lista = new ArrayList<Usuario>();
        for(Usuario u : dadosUsuarios)
        {
            if (u.getNome().indexOf(pesquisar) >= 0)
                lista.add(u);
        }
        Collections.sort(lista , 
                new Comparator<Usuario>()
                {
                    public int compare(Usuario u1, Usuario u2)
                    {
                        return u1.getNome().compareTo(u2.getNome());
                }
        });
        return lista;
    }

    public ArrayList<Usuario> listaUsuariosTelefone()
    {
        
        return null;
    }

}


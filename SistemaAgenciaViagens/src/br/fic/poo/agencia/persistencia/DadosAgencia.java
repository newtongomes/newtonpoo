
package br.fic.poo.agencia.persistencia;

import br.fic.poo.agencia.classes.*;
import java.util.ArrayList;

/**
 *
 * @author Newton
 */
public class DadosAgencia 
{
    private ArrayList<Cliente> clientes;
    private ArrayList<Usuario> usuarios;
    
    public DadosAgencia()
    {
        clientes = new ArrayList<Cliente>();
        usuarios = new ArrayList<Usuario>();
    }
    
    public ArrayList<Cliente> getClientes()
    {
        return clientes;
    }
    
    public ArrayList<Usuario> getUsuarios()
    {
        return usuarios;
    }
    
}

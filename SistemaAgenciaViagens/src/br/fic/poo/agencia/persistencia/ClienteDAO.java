
package br.fic.poo.agencia.persistencia;

import br.fic.poo.agencia.classes.Cliente;
import br.fic.poo.agencia.frames.FramePrincipal;
import java.util.ArrayList;

/**
 *
 * @author Newton
 */
public class ClienteDAO 
{
    private ArrayList<Cliente> clientes;
    
    public ClienteDAO()
    {
        clientes = FramePrincipal.dadosAgencia.getClientes();
                
    }
    
    public boolean incluir(Cliente c)
    {
        int proximo = 1;
        
        if (clientes.size() > 0)
        {
            proximo = clientes.get(clientes.size()-1).getCodigo() + 1;
        }
        c.setCodigo(proximo);       
        clientes.add(c);
        return true;
    }
    
    public Cliente consultar(int cod)
    {
        Cliente cli = null;
        
        for(Cliente c : clientes)
        {
            if (c.getCodigo() == cod)
            {
                cli = c;
                break;
            }
            
        }
        return cli;
    }
    
    
    
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.exemplo.hibernate.util;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/**
 *
 * @author Rafael
 * 
 * Classe responsável por criar o banco de dados a partir das entidades mapeadas.
 */
public class GeraTabela{
	
	public static void main(String args[]){
		Configuration conf = new Configuration();
		conf.configure();
		new SchemaExport(conf).create(true,true);
	}
        
}

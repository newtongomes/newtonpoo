package br.exemplo.hibernate.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * @author Rafael 01/11/2013
 * 
 * Classe responsável pela criação da fábrica de sessão e abertura da sessão. 
 */
public class HibernateUtil {
 
    /** Fábrica de Sessão do hibernate */
    public static final SessionFactory FACTORY = buildSession();
 
    /** 
     * @author Rafael 01/11/2013
     * 
     * Método que cria uma fábrica de sessão a partir do arquivo hibernate.cfg.xml
     * 
     * @return SessionFactory - Fábrica de Sessão.
     */
    private static SessionFactory buildSession() {
        try{
            Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
            ServiceRegistryBuilder serviceRegistryBuilder = new ServiceRegistryBuilder();
            serviceRegistryBuilder.applySettings(configuration.getProperties());
            ServiceRegistry serviceRegistry = serviceRegistryBuilder.buildServiceRegistry();
            SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            return sessionFactory;
        }catch(Throwable b){
            System.out.println("Não deu \n" + b);
            throw new ExceptionInInitializerError();
       }
    }
    
    /** 
     * @author Rafael 01/11/2013
     * 
     * Método que abre a sessão a partir da fábrica de sessão criada no buildSession().
     * 
     * @return Session - Sessão.
     */
    public static Session getSession(){
        Session session = FACTORY.openSession();
        return session;
    }
}



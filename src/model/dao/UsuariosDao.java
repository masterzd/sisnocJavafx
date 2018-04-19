package model.dao;

import java.util.List;
import javax.persistence.EntityManager;
import model.bean.Usuarios;
import model.connection.ConnectDb;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class UsuariosDao {

    private EntityManager Entidade = new ConnectDb().getConnection();
    private static SessionFactory se;

    public Usuarios Salvar(Usuarios usuario) {

        try {
            Entidade.getTransaction().begin();
            Entidade.persist(usuario);
            Entidade.getTransaction().commit();
        } catch (Exception e) {
            Entidade.getTransaction().rollback();
        } finally {
            Entidade.close();
        }

        return usuario;
    }

    public Usuarios Deletar(Usuarios usuario) {

        return usuario;
    }

    public Usuarios Atualizar(Usuarios usuario) {

        return usuario;
    }

    public List<Usuarios> Buscar(Usuarios user) {
       List<Usuarios> Users = Entidade.createQuery("from Usuarios where u_user = ? and u_senha = ?")
                             .setParameter(0, user.getU_user()).setParameter(1, user.getU_senha()).getResultList();
       return Users; 
    }

}

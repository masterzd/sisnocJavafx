package model.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Usuarios {
    
    
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private int        u_id;
 private String     u_nome;
 private String     u_user;
 private String     u_funcao;
 private String     u_senha;
 private String     u_email;
 private String     u_tel;
 private String     u_last_login;

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public String getU_nome() {
        return u_nome;
    }

    public void setU_nome(String u_nome) {
        this.u_nome = u_nome;
    }

    public String getU_user() {
        return u_user;
    }

    public void setU_user(String u_user) {
        this.u_user = u_user;
    }

    public String getU_funcao() {
        return u_funcao;
    }

    public void setU_funcao(String u_funcao) {
        this.u_funcao = u_funcao;
    }

    public String getU_senha() {
        return u_senha;
    }

    public void setU_senha(String u_senha) {
        this.u_senha = u_senha;
    }

    public String getU_email() {
        return u_email;
    }

    public void setU_email(String u_email) {
        this.u_email = u_email;
    }

    public String getU_tel() {
        return u_tel;
    }

    public void setU_tel(String u_tel) {
        this.u_tel = u_tel;
    }

    public String getU_last_login() {
        return u_last_login;
    }

    public void setU_last_login(String u_last_login) {
        this.u_last_login = u_last_login;
    }
 

}

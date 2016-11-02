package br.com.bms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Classe Login.
 *
 * @since: 19/04/2014
 * @version v1.0 15/07/2014
 * @author Bruno Bitencourt Luiz
 */
@Entity
@Table(name = "LOGINS")
public class Login {
    @Id
    @GeneratedValue
    private long id;
    @Column (nullable = false, unique = true, length = 20)
    private String login;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

}

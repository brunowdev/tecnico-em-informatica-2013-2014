package br.com.bms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Classe Foto.
 *
 * @since: 15/04/2014
 * @version v1.0 15/07/2014
 * @author Bruno Bitencourt Luiz
 */
@Entity
public class Foto {

    @Id
    @GeneratedValue
    private int id;
    private String destino;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

}

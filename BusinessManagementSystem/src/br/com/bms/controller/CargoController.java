package br.com.bms.controller;

import br.com.bms.model.Cargo;
import br.com.bms.model.persistencia.CargoDAO;
import br.com.bms.model.persistencia.dao.CargoDAOJPA;
import java.util.List;

/**
 * Classe que liga os métodos da interface gráfica com a base de dados.
 *
 * @since 15/07/2014
 * @version v1.0 15/07/2014
 * @author Bruno Bitencourt Luiz
 */
public class CargoController {

    /**
     * Método para inserir um cargo na base de dados.
     *
     * @author Bruno Bitencourt Luiz
     * @param cargo
     * @return 
     * @since 15/07/2014
     * @version 1.0 15/07/2014
     */
    public Cargo save(Cargo cargo) {
        CargoDAO dao = new CargoDAOJPA();
       return dao.save(cargo);
    }

    /**
     * Método para remover um cargo na base de dados.
     *
     * @author Bruno Bitencourt Luiz
     * @param c
     * @since 15/07/2014
     * @version v1.0 15/07/2014
     */
    public boolean remove(Cargo c) {
        CargoDAO dao = new CargoDAOJPA();
       return dao.remove(Cargo.class, c.getId());
    }

    /**
     * Método para buscar um cargo na base de dados.
     *
     * @author Bruno Bitencourt Luiz
     * @param c
     * @return
     * @since 15/07/2014
     * @version v1.0 15/07/2014
     */
    public Cargo getCargoById(Cargo c) {
        CargoDAO dao = new CargoDAOJPA();
        return dao.getById(Cargo.class, c.getId());
    }

    /**
     * Método para listar os cargos da base de dados.
     *
     * @author Bruno Bitencourt Luiz
     * @return
     * @since 15/07/2014
     * @version v1.0 15/07/2014
     */
    public List<Cargo> listAll() {
        CargoDAO dao = new CargoDAOJPA();
        return dao.getAll(Cargo.class);
    }

}

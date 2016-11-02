package br.com.bms.controller;

import br.com.bms.model.Foto;
import br.com.bms.model.persistencia.FotoDAO;
import br.com.bms.model.persistencia.dao.FotoDAOJPA;
import java.util.List;

/**
 * Classe que liga os métodos da interface gráfica com a base de dados.
 *
 * @since 15/07/2014
 * @version v1.0 15/07/2014
 * @author Bruno Bitencourt Luiz
 */
public class FotoController {

    /**
     * Método para inserir uma foto na base de dados.
     *
     * @author Bruno Bitencourt Luiz
     * @param foto
     * @since 15/07/2014
     * @version 1.0 15/07/2014
     */
    public void save(Foto foto) {
        FotoDAO dao = new FotoDAOJPA();
        dao.save(foto);
    }

    /**
     * Método para remover uma foto da base de dados.
     *
     * @author Bruno Bitencourt Luiz
     * @param c
     * @since 15/07/2014
     * @version v1.0 15/07/2014
     */
    public void remove(Foto c) {
        FotoDAO dao = new FotoDAOJPA();
        dao.remove(Foto.class, c.getId());
    }

    /**
     * Método para buscar uma foto na base de dados.
     *
     * @author Bruno Bitencourt Luiz
     * @param c
     * @return
     * @since 15/07/2014
     * @version v1.0 15/07/2014
     */
    public Foto getFotoById(Foto c) {
        FotoDAO dao = new FotoDAOJPA();
        return dao.getById(Foto.class, c.getId());
    }

    /**
     * Método para listar as fotos da base de dados.
     *
     * @author Bruno Bitencourt Luiz
     * @return
     * @since 15/07/2014
     * @version v1.0 15/07/2014
     */
    public List<Foto> listAll() {
        FotoDAO dao = new FotoDAOJPA();
        return dao.getAll(Foto.class);
    }

}
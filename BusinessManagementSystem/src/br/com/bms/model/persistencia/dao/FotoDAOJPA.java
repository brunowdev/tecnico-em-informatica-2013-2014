package br.com.bms.model.persistencia.dao;

import br.com.bms.model.Foto;
import br.com.bms.model.persistencia.FotoDAO;

/**
 * O objeto foto é persistido por meio da classe GenericJPA.
 *
 * @version v1.0
 * @since 15/07/2014
 * @author Bruno Bitencourt Luiz
 */
public class FotoDAOJPA extends GenericDAOJPA<Foto, Integer> implements FotoDAO {
}

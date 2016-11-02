package br.com.bms.model.persistencia.dao;

import br.com.bms.model.Cargo;
import br.com.bms.model.persistencia.CargoDAO;

/**
 * O objeto cargo é persistido por meio da classe GenericJPA.
 *
 * @version v1.0
 * @since 15/07/2014
 * @author Bruno Bitencourt Luiz
 */
public class CargoDAOJPA extends GenericDAOJPA<Cargo, Integer> implements CargoDAO{
}

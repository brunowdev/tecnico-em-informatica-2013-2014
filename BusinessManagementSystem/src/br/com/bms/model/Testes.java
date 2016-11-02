package br.com.bms.model;

import br.com.bms.controller.CargoController;
import br.com.bms.controller.FotoController;
import br.com.bms.utill.JPAUtil;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Bruno Luiz
 */
public class Testes {

    public static void main(String[] args) {

        
        FotoController fc = new FotoController();
        Foto f = new Foto();
        
        f.setDestino("systema/endsd");
        fc.save(f);
        
        
//        //TESTES COM CARGOS
//        Cargo c = new Cargo();
//        System.out.println("1");
//        c.setId(1);
//        System.out.println("1");
//        c.setNome("DBA");
//        c.setDescricao("Administrador do Banco de dados");
//        System.out.println("1");
//        CargoController cc = new CargoController();
//System.out.println("1");
//        // System.out.println( cc.getCargoById(c).toString());        
//        List<Cargo> cargos = cc.listAll();
//        System.out.println("1");
//        for (Cargo cargo : cargos) {
//            System.out.println(cargo.toString());
//        }

//        Login l = new Login();
//        ClienteFisico cf = new ClienteFisico();
//        cf.setNome("Bruno teste");
//        l.setLogin("bruno_bl");
//
//        Cargo cargo = new Cargo();
//        cargo.setNome("Caixa");
//        cargo.setDescricao("Gerenciar as Finanças, Responsável por abrir e fachar o caixa.");
//        ClienteFisico cf = new ClienteFisico();
//        Fornecedor f = new Fornecedor();
//        ClienteJuridico cj = new ClienteJuridico();
//        Funcionario sf = new Funcionario();
//        Pessoa p = new Pessoa();
//        
//        
//        Endereco e = new Endereco();
//       // e.setCep("");
//        e.setEstado(1);
//        e.setId(1);
//        e.setNumeroCasa("");
//       // e.setRua("");
//        e.setTipoImovel(1);
//        
//        sf.setEndereco(e);
//        
//        Telefone t =new Telefone();
//        t.setId(1);
//       // t.setPessoa(sf);
//        
//        Bairro b = new Bairro();
//        
//        Fornecedor fds = new Fornecedor();
//        
//        Servico sss = new Servico();
//        
//        sss.setId(1);
//        sss.setNome("Bruno");
//        
//        
//        Produto pds = new Produto();
//        Estado e = new Estado();
//        e.setSigla("SCSsa");
//        System.out.println("Estado.: " + e.toString());
    }
}

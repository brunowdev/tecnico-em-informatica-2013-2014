package br.com.bms.model;

import javax.swing.JOptionPane;

/**
 *
 * @author Bruno Luiz
 */
public class Estado {

    private String sigla;

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        if (((sigla.length()) < 2) || (sigla.length() > 2)) {
            JOptionPane.showMessageDialog(null, "A sigla do estado deve conter no mínimo e no máximo 2 caracteres!");
        } else {

            this.sigla = sigla;
        }
    }

    @Override
    public String toString() {
        return "Estado{" + "sigla=" + sigla + '}';
    }

}

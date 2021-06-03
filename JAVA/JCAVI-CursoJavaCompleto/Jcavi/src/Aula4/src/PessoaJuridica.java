package Aula4.src;

import Aula4.src.interfaces.IContatos;
import Aula4.src.interfaces.IPessoa;

public class PessoaJuridica extends Pessoa implements IPessoa, IContatos{

    private String cnpj;
    private String tipoPessoaJuridica;
    private String telefoneComercial;

    public PessoaJuridica() {

    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTipoPessoaJuridica() {
        return tipoPessoaJuridica;
    }

    public void setTipoPessoaJuridica(String tipoPessoaJuridica) {
        this.tipoPessoaJuridica = tipoPessoaJuridica;
    }

    public String getTelefoneComercial() {
        return telefoneComercial;
    }

    public void setTelefoneComercial(String telefoneComercial) {
        this.telefoneComercial = telefoneComercial;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "PessoaJuridica [cnpj=" + cnpj + ", tipoPessoaJuridica=" + tipoPessoaJuridica + ", telefoneComercial="
                + telefoneComercial + ", getId()=" + getId() + ", getNome()=" + getNome() + ", getTelefone()="
                + getTelefone() + "]";
    }

    public Double calcularSalario() {

        return 3000.0 * 4;
    }

    @Override
    public Double calcularSalarios() {
        // TODO Auto-generated method stub
        return 1000.00 * 25;
    }

    @Override
    public String retornarContatos() {
        // TODO Auto-generated method stub
        return "mrcSoft@desksoft.com";
    }

}
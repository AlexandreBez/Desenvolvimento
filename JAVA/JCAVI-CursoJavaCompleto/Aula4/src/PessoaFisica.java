package src;

import src.interfaces.IContatos;
import src.interfaces.IPessoa;

public class PessoaFisica extends Pessoa implements IPessoa, IContatos {

    private String cpf;

    public PessoaFisica() {

    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "PessoaFisica [cpf=" + cpf + ", getId()=" + getId() + ", getNome()=" + getNome() + ", getTelefone()="
                + getTelefone() + ", toString()=" + super.toString() + "]";
    }

    public Double calcularSalario() {

        return 5000.0;
    }

    @Override
    public Double calcularSalarios() {
        // TODO Auto-generated method stub
        return 3000.00 * 2;
    }

    @Override
    public String retornarContatos() {
        // TODO Auto-generated method stub
        return "pessoaFisica@outlook.com";
    }
}

package src;

public class Pedreiro {
    
    private String nome;
    private String cidade;
    private int idade;
    private String equipe;
    private String funcao;
    private String local;
    
    public String getFuncao() {
        return funcao;
    }
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    private double salario;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getEquipe() {
        return equipe;
    }
    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }
    public String getLocal() {
        return local;
    }
    public void setLocal(String local) {
        this.local = local;
    }

    @Override
    public String toString() {
        return "Pedreiro [cidade=" + cidade + ", equipe=" + equipe + ", funcao=" + funcao + ", idade=" + idade
                + ", local=" + local + ", nome=" + nome + ", salario=" + salario + "]";
    }


}

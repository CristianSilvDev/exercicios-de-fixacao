// Classe PessoaJuridica 

package entities;

public class PessoaJuridica extends Pessoa {

    private Integer funcionarios;

    public PessoaJuridica() {

    }

    public PessoaJuridica(String nome, double rendaAnual, Integer funcionarios) {
        super(nome, rendaAnual);
        this.funcionarios = funcionarios;
    }

    public Integer getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Integer funcionarios) {
        this.funcionarios = funcionarios;
    }

    @Override
    public Double desconto() {
        if (funcionarios > 10) {
            return getRendaAnual() * 0.14;
        } else {
            return getRendaAnual() * 0.16;
        }
    }

}

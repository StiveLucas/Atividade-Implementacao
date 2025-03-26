import app.Molds.Excecoes.ExececaoDadosInvalidos;

public class Conta {

    private String numeroDaConta;
    private String nomeDoTitular;
    private String senha;
    private double saldo;

    public Conta(String numeroDaConta, String nomeDoTitular, double saldo) throws ExececaoDadosInvalidos {
       setNumeroDaConta(numeroDaConta);
       setNomeDoTitular(nomeDoTitular);
       setSaldo(saldo);

    }
    
    public void setNumeroDaConta(String numeroDaConta) throws ExececaoDadosInvalidos{
        if(numeroDaConta == null || numeroDaConta.trim().isEmpty()){
            throw new ExececaoDadosInvalidos("O número da conta não pode ser vazio");

        }
        this.numeroDaConta = numeroDaConta;

    }

    public void setNomeDoTitular(String nomeDoTitular) throws ExececaoDadosInvalidos{
        if(nomeDoTitular == null || nomeDoTitular.trim().isEmpty()){
            throw new ExececaoDadosInvalidos("O nome do titular não pode ser vazio");
            
        }
        this.nomeDoTitular = nomeDoTitular;

    }

    public void setSenha(String senha) throws ExececaoDadosInvalidos{
        if (senha == null || senha.trim().isEmpty()) {
            throw new ExececaoDadosInvalidos("A senha não pode estar vazia.");
            
        }
    }

    public void setSaldo(double saldo) throws ExececaoDadosInvalidos{
        if (saldo < 0) {
            throw new ExececaoDadosInvalidos("O saldo da conta não pode ser negativo");
            
        }
        this.saldo = saldo;

    }

    public String getNumeroDaConta(){
        return numeroDaConta;

    }

    public String getNomeDoTitular(){
        return nomeDoTitular;

    }

    public String getSenha(){
        return senha;

    }

    public double getSaldo(){
        return saldo;
    
    }

}
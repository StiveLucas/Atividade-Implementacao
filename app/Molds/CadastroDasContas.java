public class CadastroDasContas {
    private List<Conta> contas;

    public CadastroDasContas(){
        this.contas = new ArrayList<>();

    }

    public void inserir(Conta conta){
        contas.add(conta);
        System.out.println("Conta adicionada com sucesso!");
    }
    
}
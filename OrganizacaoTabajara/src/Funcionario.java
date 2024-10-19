abstract class Funcionario implements IFuncionario{
    String nome;

    public String getNome(){
        return nome;
    }

    public Funcionario(String nome) {
        this.nome = nome;
    }
}

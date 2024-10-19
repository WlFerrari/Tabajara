public class Gerente extends Funcionario{

    public Gerente(String nome){
        super(nome);
    }

    @Override
    public double calcularSalario(){
        return 2500;
    }

    @Override
    public String descreverResponsabilidades(){
       return "Gerenciar os funcionarios.";
    }
}

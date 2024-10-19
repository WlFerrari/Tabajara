public class SistemaRH {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Paulo");
        Desenvolvedor desenvolvedor = new Desenvolvedor("Fabiola");

        System.out.println("Nome: " + gerente.getNome());
        System.out.println("Salario Gerente: R$" + gerente.calcularSalario());
        System.out.println("Responsabilidades Gerente: " + gerente.descreverResponsabilidades());
        System.out.println();
        System.out.println("Nome: " + desenvolvedor.getNome());
        System.out.println("Salario Desenolvedor: R$" + desenvolvedor.calcularSalario());
        System.out.println("Responsabilidades Desenvolvedor: " + desenvolvedor.descreverResponsabilidades());
    }
}

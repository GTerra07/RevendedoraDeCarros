public class main {
    public static void main(String[] args) {
        double valorTotalVendas = 500000.00;
        double salarioFixo = 8000.00;
        double valorPorCarro = 800.00;
        int numeroCarrosVendidos = 10;

        // Calcular comissão e salário final
        double comissao = numeroCarrosVendidos * valorPorCarro + valorTotalVendas * 0.05;
        double salarioFinal = salarioFixo + comissao;

        // Exibir resultado
        System.out.printf("O salário final do vendedor é: R$%.2f", salarioFinal);
    }
}

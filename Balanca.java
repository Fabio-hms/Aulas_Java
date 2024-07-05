import java.util.ArrayList;
import java.util.Scanner;

public class Balanca {
    private ArrayList<Double> pesos;
    private Scanner scanner;

    public Balanca() {
        pesos = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void adicionarPeso(double peso) {
        pesos.add(peso);
    }

    public double calcularPesoTotal() {
        double total = 0;
        for (double peso : pesos) {
            total += peso;
        }
        return total;
    }

    public double calcularMediaPeso() {
        if (pesos.isEmpty()) {
            return 0;
        }
        return calcularPesoTotal() / pesos.size();
    }

    public void mostrarMenu() {
        int opcao;
        do {
            System.out.println("=== Sistema de Balança ===");
            System.out.println("1. Adicionar peso");
            System.out.println("2. Calcular peso total");
            System.out.println("3. Calcular média dos pesos");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o peso a ser adicionado: ");
                    double peso = scanner.nextDouble();
                    adicionarPeso(peso);
                    System.out.println("Peso adicionado com sucesso!");
                    break;
                case 2:
                    System.out.println("Peso total: " + calcularPesoTotal());
                    break;
                case 3:
                    System.out.println("Média dos pesos: " + calcularMediaPeso());
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
            System.out.println();
        } while (opcao != 4);
    }

    public static void main(String[] args) {
        Balanca balanca = new Balanca();
        balanca.mostrarMenu();
    }
}
import java.util.Scanner;

public class MainPessoas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pessoa p1 = new Pessoa();
        System.out.println("Nome: ");
        p1.setNome(sc.nextLine());
        System.out.println("Idade: ");
        p1.setIdade(sc.nextInt());
        System.out.println("Altura (metros): ");
        p1.setAltura(sc.nextDouble());
        System.out.println("Peso: ");
        p1.setPeso(sc.nextDouble());

        System.out.println("\nNome: " + p1.getNome() + "\nIdade: " + p1.getIdade() + "\nAltura: " + p1.getAltura() + "\nIMC:" + p1.calcularImc() + "\nClassificação: "+ p1.classificarImc());

    }
}

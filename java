import java.util.Scanner;

public class ProcessoSeletivo {

    public static boolean validarIdade(int idade) {
        return idade >= 18 && idade <= 70;
    }

    public static boolean validarExperiencia(int experiencia) {
        return experiencia > 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao processo seletivo!");
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        
        System.out.print("Digite sua experiência em anos: ");
        int experiencia = scanner.nextInt();

        if (validarIdade(idade) && validarExperiencia(experiencia)) {
            System.out.println("Parabéns, " + nome + "! Você foi aprovado no processo seletivo.");
        } else {
            System.out.println("Desculpe, " + nome + ", você não atende aos requisitos mínimos.");
        }

        scanner.close();
    }
}

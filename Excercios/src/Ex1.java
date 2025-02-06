import java.util.Scanner; // Importando a classe Scanner para ler entradas do usuário

public class Ex1 {
    public static void main(String[] args) {

        String anoNascimento;
        String nome;
        Scanner sc = new Scanner(System.in); // Instanciando um objeto da classe Scanner

        anoNascimento = sc.nextLine(); // Lendo a entrada do usuário
        nome = sc.nextLine(); // Lendo a entrada do usuário

        System.out.println("Ola, " + nome + "você tem " + anoNascimento +" anos de idade");
        /////////////////Exercicio 1/////////////////////

        double lado1 = sc.nextDouble(), lado2 = sc.nextDouble();
        double area;

        area = lado1 * lado2;

        System.out.println("A area do quadrado é: " + area);

        double base = sc.nextDouble(), altura = sc.nextDouble();
        area = base * altura;
        System.out.println("A area do retangulo é: " + area);

        Ex1 ex = new Ex1();

        ex.diferencaDeIdade(10, 5);


    }

    public double diferencaDeIdade(int idade1, int idade2){
        int diferenca = idade1 - idade2;
        System.out.println("Diferença de idade: " + diferenca);
        return diferenca;
    }
}

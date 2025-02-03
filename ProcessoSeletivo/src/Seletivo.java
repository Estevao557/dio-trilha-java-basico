import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Seletivo {
    public static void main(String[] args) throws Exception {
        String [] candidatos = {"João", "Maria", "José", "Antônio", "Mariana"};

        for(String candidato : candidatos) {
          entrandoEmContato(candidato);
    }

    static void entrandoEmContato(String candidato){
        int tentativa = 1;
        boolean continuaTentando = true;
        boolean  atendeu = false;

        do {
            atendeu = atender();
            continuaTentando = !atendeu;

            if(continuaTentando) {
                tentativa++;    
            } else {
                System.out.println("CONTATO REALIZADO COM SUCESOS");}
        }
        while (atendeu); {
            if(atendeu) {
                System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA TENTATIVA " + tentativa);
            } else {
                System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato);
            }
        }
    }

    static boolean atender(){
        return  new Random().nextInt(3) == 1;
    }

    static void imprimeSelecionado() {
        String [] candidatos = {"João", "Maria", "José", "Antônio", "Mariana"};

        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for(int indice=0; indice < candidatos.length;indice++) {
                System.out.println("Candidato: " + candidatos[indice] + " Indice: " + (indice+1));
            }
    }

    static void selecaoCandidatos() {
        String [] candidatos = {"João", "Maria", "José", "Antônio", "Mariana"};
        int candidatosSelecionado = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionado < 5 && candidatosAtual < candidatos.length) {
            String  candidato = candidatos[candidatosAtual];
            double salalarioPretendido = valorPretendido();

            System.out.println("Candidato: " + candidato + "Solário Pretendido: " + salalarioPretendido);
            if(salarioBase >= salalarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado");
                candidatosSelecionado++;
            }
            candidatosAtual++;  
        }


    }

    static void analisarCandidato(double salarioPretendido) {

        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DO DEMAIS CANDIDATOS");
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}

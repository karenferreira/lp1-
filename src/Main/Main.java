package Main;

/**
 * @author Radames J Halmeman - rjhalmeman@gmail.com
 */
public class Main {

    double classificacao = 0;

    public static void main(String[] args) {
        Entrada entrada = new Entrada();
        Processamento processamento = new Processamento();
        Saida saida = new Saida();

        //entrada
        double peso = entrada.lerNumeroDouble("Digite seu peso: ");
        double altura = entrada.lerNumeroDouble("Digite sua altura: ");
        //processamento
        if (altura > 0) {
            double imc = processamento.getImc(peso, altura);
            double classificacao = processamento.Getclassifica(imc);
            saida.imprimirNumeroDouble("imc", classificacao);
        } else {
            System.out.println("nao existe divisao por 0");
        }
        //saída

    }

}

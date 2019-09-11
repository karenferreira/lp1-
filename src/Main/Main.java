package Main;

/**
 * @author Radames J Halmeman - rjhalmeman@gmail.com
 */
public class Main {

    public static void main(String[] args) {
        Entrada entrada = new Entrada();
        Processamento processamento = new Processamento();
        Saida saida = new Saida();
        
        //entrada
        double a = entrada.lerNumeroDouble("Digite um valor para A");
        double b = entrada.lerNumeroDouble("Digite um valor para B");
        double c = entrada.lerNumeroDouble("Digite um valor para C");
        //processamento
        String resp = processamento.delta(a, b,c);
        if (resp.equals("Ok")) {
             Double x1 = processamento.getX1(a, b);
             Double x2 = processamento.getX2(a, b);
             saida.imprimirNumeroDouble("x1", x1);
             saida.imprimirNumeroDouble("x2", x2);
        } else{
            saida.imprimirRotuloEString("Resp", resp);
        }
       
       

        //saída
        

    }

}

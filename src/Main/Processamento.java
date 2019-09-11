package Main;

//
class Processamento {

    double imc = 0;

    public double getImc(double peso, double altura) {
        imc = peso / (altura * altura);
        return imc;
    }

    public String verificaExistencia(double altura) {
        if(altura>0){
            return "ok";
        } else{
            return "nao existe divisao por zero";
        }
    }

    public double Getclassifica(double imc) {
        if (imc < 16.00) {
            System.out.println("Baixo peso grau II");
        }
        if (imc >= 16.00 && imc <= 16.99) {
            System.out.println("Baixo peso grau I");
        }
        if (imc >= 17.00 && imc <= 18.49) {
            System.out.println("Baixo peso grau II");
        }
        if (imc >= 18.50 && imc <= 24.99) {
            System.out.println("Peso ideal");
        }
        if (imc >= 25.00 && imc <= 29.99) {
            System.out.println("Sobrepeso");
        }
        if (imc >= 30.00 && imc <= 34.99) {
            System.out.println("Obesidade grau I");
        }
        if (imc >= 35.00 && imc <= 39.99) {
            System.out.println("Obesidade grau II");
        }
        if (imc >= 40.00) {
            System.out.println("Obesidade grau III");
        }
        return imc;
    }

}

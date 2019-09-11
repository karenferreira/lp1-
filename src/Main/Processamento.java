package Main;

//@author Radames J Halmeman  - rjhalmeman@gmail.com
class Processamento {

    double delta = 0;

    public String delta(double a, double b, double c) {
        delta = b * b - 4 * a * c;
        if (delta < 0) {
            return "impossivel";
        } else if (a == 0) {
            return "nao existe divisao por 0";
        }
        return "Ok";
    }

    public Double getX1(double a, double b) {
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        return x1;
    }
    public Double getX2(double a, double b) {
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
        return x2;
    }

   
}

package Main;

//@author Radames J Halmeman  - rjhalmeman@gmail.com
class Processamento {
    boolean conseguiu;
    public double getDiv(double a, double b) {
        if (b != 0) {
            conseguiu=true;
            double x = a / b;
            return x;
        } else{
            conseguiu=false;
            return 0;
        }
        
    }
    
    public boolean getConseguiu(){
        return conseguiu;
    }

}

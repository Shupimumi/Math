package methods;

public class Sqrt {
    double number;
    public Sqrt(double number){
        this.number = number;
    }
    public double sqrt (){
        number*=number;
        return number;
    }
}

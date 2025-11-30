public class MathFunc implements MathCalculable{
    @Override
    public double powIf(double val, double power) {
        return Math.pow(val, power);
    }

    @Override
    public double module(double val1, double valI) {
        return Math.sqrt(powIf(val1, 2) + powIf(val1, 2));
    }
    public double distCircle(double r){
        return 2*PI*r;
    }
}

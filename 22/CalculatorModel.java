public class CalculatorModel{
    private float result;

    public void add(float a){
        this.result += a;
    }

    public void subtract(float a){
        this.result -= a;
    }

    public void multiply(float a){
        this.result *= a;
    }

    public void divide(float a){
        if (a != 0){
            this.result /= a;
        }
        else{
            throw new ArithmeticException("Division by zero");
        }
    }

    public void setValue(float value){
        this.result = value;
    }

    public float getResult(){
        return this.result;
    }

    public void clear(){
        this.result = 0;
    }
}
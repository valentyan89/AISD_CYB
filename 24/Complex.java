public class Complex {
    private static final float EPS = 1e-12f; private float real; private float imag;

    public Complex(float real, float imag) {
        this.real = real; this.imag = imag;
    }

    public Complex(){
        this.real = 0.0f; this.imag = 0.0f;
    }

    public Complex(Complex c){
        this.real = c.real; this.imag = c.imag;
    }

    public Complex(float real){
        this.real = real; this.imag = 0.0f;
    }

    public float getReal(){
        return this.real;
    }

    public float getImag(){
        return this.imag;
    }

    public Complex getZ(){
        return new Complex(this.real, this.imag);
    }

    public void setReal(float real){
        this.real = real;
    }

    public void setImag(float imag){
        this.imag = imag;
    }

    public void setZ(Complex c){
        this.real = c.real;
    }

    public float mod(){
        return (float) Math.sqrt(Math.pow(this.real, 2) + Math.pow(this.imag, 2));
    }

    public float arg(){
        return (float) Math.atan2(this.imag, this.real);
    }

    public boolean isReal(){
        return (float) Math.abs(this.imag) < EPS;
    }

    public boolean equals(Complex c){
        return (float) Math.abs(this.imag - c.imag) < EPS && Math.abs(this.real - c.real) < EPS;
    }

    public void add(Complex c){
        this.real = this.real + c.real; this.imag = this.imag + c.imag;
    }

    public void sub(Complex c){
        this.real = this.real - c.real; this.imag = this.imag - c.imag;
    }

    public void mul(Complex c){
        float tmp = this.real * c.real - this.imag * c.imag;
        this.imag = this.real * c.imag + this.imag * c.real;
        this.real = tmp;
    }

    public void div(Complex c){
        if (c.mod() == 0){
            throw new ArithmeticException("Div by zero complex");
        }
        float m = c.mod();
        float tmp = this.real * c.real - this.imag * c.imag;
        this.imag = (this.imag * c.real - this.real * c.imag) / m;
        this.real = tmp / m;
    }

    public Complex plus(Complex c){
        return new Complex(this.real + c.real, this.imag + c.imag);
    }

    public Complex minus(Complex c){
        return new Complex(this.real - c.real, this.imag - c.imag);
    }

    public Complex times(Complex c){
        return new Complex(
                this.real * c.real - this.imag * c.imag,
                this.real * c.imag + this.imag * c.real);
    }

    public Complex dividedBy(Complex c){
        if (c.mod() == 0){
            throw new ArithmeticException("Div by zero complex");
        }
        float m = c.mod();
        return new Complex(
                (this.real * c.real - this.imag * c.imag) / m,
                (this.imag * c.real - this.real * c.imag) / m
        );
    }

    @Override
    public String toString(){
        return String.format("%f + %fi", this.getReal(), this.getImag());
    }
}
public class ConcreteFactory implements ComplexAbstractFactory{
    @Override
    public Complex createComplex(){
        return new Complex();
    }
    
    @Override
    public Complex CreateComplex(float real, float image){
        return new Complex(real, image);
    }
}
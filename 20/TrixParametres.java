public class TrixParametres <T, V, K>{
    private T variable; private V variableMila; private K variableMilana;

    public TrixParametres(T m1, V m2, K m3){
        this.variable = m1; this.variableMila = m2; this.variableMilana = m3;
    }

    public T getVariable(){
        return this.variable;
    }

    public V getVariableMila(){
        return this.variableMila;
    }

    public K getVariableMilana(){
        return this.variableMilana;
    }

    public void setVariable(T v){
        this.variable = v;
    }

    public void setVariableMila(V v){
        this.variableMila = v;
    }

    public void setVariableMilana(K v){
        this.variableMilana = v;
    }

    public void printClassNames(){
        var str =String.format("First Class - <%s>\nSecond Class - <%s>\nThird Class - <%s>", variable.getClass().getSimpleName(), variableMila.getClass().getSimpleName(), variableMilana.getClass().getSimpleName());
        System.out.println(str);
    }
    
    @Override
    public String toString(){
        return String.format("<%s> = %s, <%s> = %s, <%s> = %s", variable.getClass().getSimpleName(), variable, variableMila.getClass().getSimpleName(), variableMila, variableMilana.getClass().getSimpleName(), variableMilana);
    }
}

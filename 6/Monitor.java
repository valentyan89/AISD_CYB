public class Monitor {
    private float inch; private String maxResolution; private TypeMatrix type;
    public Monitor(float inch, String res, TypeMatrix tempVar){
        if (inch <= 0) {
            throw new IllegalArgumentException("Invalid size of monitor");
        }
        this.inch = inch; this.maxResolution = res; this.type = tempVar;
    }
    public float getInch(){
        return this.inch;
    }
    public String getResolution(){
        return this.maxResolution;
    }
    public TypeMatrix getType(){
        return this.type;
    }
    @Override
    public String toString(){
        return String.format("Size of the monitor = %.1f inch, max resolution = %s, type of the matrix = %s", this.getInch(), this.getResolution() , this.getType());
    }
}

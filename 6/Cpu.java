public class Cpu {
    private float speed; private int cores;
    public Cpu(int cores, float speed){
        if (cores <= 0 || speed <= 0) {
            throw new IllegalArgumentException("Invalid CPU");
        }
        this.speed = speed; this.cores = cores;
    }
    public float getSpeed(){
        return this.speed;
    }
    public int getCores(){
        return this.cores;
    }
    public void boost(){
        this.speed = this.getSpeed() * 1.4f;
    }
    @Override
    public String toString(){
        return String.format("CPU cores = %d, Speed of this cores = %.2f MHz", this.getCores(), this.getSpeed()); 
    }
}

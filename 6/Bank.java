public class Bank implements Priceable{
    private float haste;
    public Bank(){};
    public Bank(float val){
        this.haste = val;
    }
    @Override
    public float getPrice(){
        return this.haste;
    }
    @Override
    public String toString(){
        return String.format("This bank has the amount of money = %.3f", this.getPrice());
    }
}

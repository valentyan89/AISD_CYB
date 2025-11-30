public class Memory {
    public enum MemoryType{
        DDR3, DDR4, DDR5
    }
    private MemoryType module; private float gb;
    public Memory(MemoryType var1, float gb){
        if (gb <= 0) {
            throw new IllegalArgumentException("Invalid size of RAM");
        }
        this.gb = gb; this.module = var1;
    }
    public MemoryType getModule(){
        return this.module;
    }
    public float getGb(){
        return this.gb;
    }
    @Override
    public String toString(){
        return String.format("Module of RAM = %s, size = %.1f gb", this.getModule() , this.getGb());
    }
}



public class Computer {
    private Brand name; private Memory ram; private Monitor mon; private Cpu cpu;
    public Computer(Brand name, Memory ram, Monitor mon, Cpu cpu){
        this.name = name; this.ram = ram; this.mon = mon; this.cpu = cpu;
    }
    public Brand getBrand(){
        return this.name;
    }
    public Memory getMemory(){
        return this.ram;
    }
    public Monitor getMonitor(){
        return this.mon;
    }
    public Cpu getCpu(){
        return this.cpu;
    }
    @Override
    public String toString(){
        return String.format("Your brand PC - %s\nCpu in your PC - %s\nMemory in your PC - %s\nSettings of your monitor - %s", this.name, cpu.toString(), ram.toString(), mon.toString());
    }
}

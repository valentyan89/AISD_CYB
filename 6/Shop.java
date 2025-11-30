import java.util.ArrayList;

public class Shop {
    private ArrayList<Computer> arr = new ArrayList<>();


    public void append(Brand brand, Cpu cpu, Monitor mon, Memory dram){
        this.arr.add(new Computer(brand, dram, mon, cpu));
    }

    public void giveInfo(){
        if (arr.size() == 0){
            System.out.println("\nZero PCs\n");
        } else {
            int i = 1;
            for (Computer PC : arr){
                System.out.println("\nComputer number " + i + "\n" + PC + '\n');
                i++;
            }
        }
    }

    public void delete(int i){
        if (arr.size() == 0){
            System.out.println("\nCan't remove, zero PCs\n");
        } else {
            if (i > 0 && i <= arr.size()) {
                this.arr.remove(i - 1);
            } else {
                System.out.println("\nInvalid index\n");
            }
        }
    }

    private boolean search(Brand brand, Cpu cpu, Monitor monitor, Memory ram){
        for (Computer PC : arr){
            float eps = 0.0001f; Cpu cp = PC.getCpu(); Memory dram = PC.getMemory(); Monitor mon = PC.getMonitor(); Brand br = PC.getBrand();
            if (br == brand
                && cp.getCores() == cpu.getCores()
                && Math.abs(cp.getSpeed() - cpu.getSpeed()) < eps
                && Math.abs(mon.getInch() - monitor.getInch()) < eps
                && mon.getResolution().equals(monitor.getResolution())
                && mon.getType() == monitor.getType()
                && Math.abs(dram.getGb() - ram.getGb()) < eps
                && dram.getModule() == ram.getModule()){
                return true;
            }
        }
        return false;
    }

    public void check(Brand brand, Cpu cpu, Monitor monitor, Memory ram){
        System.out.println(search(brand, cpu, monitor, ram) ? "\nfound\n" : "\nnot found\n");
    }
}

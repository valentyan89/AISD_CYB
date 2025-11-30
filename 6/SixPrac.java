import java.util.Scanner;

public class SixPrac{
    static void task1(){
        var circle = new MovableCircle(0, 0, 2, 3, 5);
        System.out.println(circle);
        circle.moveRight();
        System.out.println(circle);
    }
    static void task3(){
        Nameable test = new Student("Milana");
        System.out.println(test.getName());
    }
    static void task4(){
        Priceable bank1 = new Bank(33.333f);
        System.out.println(bank1);
        Priceable product = new Product("Tg premium", 1770.58f);
        System.out.println(product);
    }
    static void appendPC(Shop reStore){
        var scan = new Scanner(System.in);
        System.out.println("Give brand PC: ");
        Brand var1 = Brand.valueOf(scan.nextLine().trim().toUpperCase());
        System.out.println("Give number of cores CPU and speed: ");
        int cores = scan.nextInt();
        float speed = scan.nextFloat();
        System.out.println("Give inch, res, typeMatrix: ");
        float inch = scan.nextFloat();
        scan.nextLine();
        String res = scan.nextLine();
        TypeMatrix tm= TypeMatrix.valueOf(scan.nextLine().trim().toUpperCase());
        System.out.println("Give type of module DRAM and GBs: ");
        MemoryType ddr = MemoryType.valueOf(scan.nextLine().trim().toUpperCase());
        float gb = scan.nextFloat();
        reStore.append(var1, new Cpu(cores, speed), new Monitor(inch, res, tm), new Memory(ddr, gb));
    }
    static void delPC(Shop reStore){
        var scan = new Scanner(System.in);
        System.out.println("Write numb of PC: ");
        int numb = scan.nextInt();
        reStore.delete(numb);
    }
    static void findPC(Shop reStore){
        var scan = new Scanner(System.in);
        System.out.println("Give brand PC: ");
        Brand var1 = Brand.valueOf(scan.nextLine().trim().toUpperCase());
        System.out.println("Give number of cores CPU and speed: ");
        int cores = scan.nextInt();
        float speed = scan.nextFloat();
        System.out.println("Give inch, res, typeMatrix: ");
        float inch = scan.nextFloat();
        scan.nextLine();
        String res = scan.nextLine();
        TypeMatrix tm= TypeMatrix.valueOf(scan.nextLine().trim().toUpperCase());
        System.out.println("Give type of module DRAM and GBs: ");
        MemoryType ddr = MemoryType.valueOf(scan.nextLine().trim().toUpperCase());
        float gb = scan.nextFloat();
        reStore.check(var1, new Cpu(cores, speed), new Monitor(inch, res, tm), new Memory(ddr, gb));
    }
    static void task10(){
        var reStore = new Shop();
        var scan = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("reStore\n1. add PC\n2. del PC\n3. find PC\n4. info about devices\n5. exit\nPls chose action: ");
            String act = scan.nextLine().trim();
            var action = Action.choose(act);

            if (action == null) {
                System.out.println("retry, jeb");
                continue;
            }
            switch (action) {
                case ADD -> appendPC(reStore);
                case DELETE -> delPC(reStore);
                case FIND -> findPC(reStore);
                case PRINT -> reStore.giveInfo();
                case EXIT -> {
                    System.out.println("reStore closed");
                    flag = false;
                }
            }
        }
    }
        
    
    public static void main(String[] args) {
        task10();
    }
}

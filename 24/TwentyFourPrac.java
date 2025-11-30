public class TwentyFourPrac {
    static void task1(){
        ConcreteFactory factory = new ConcreteFactory();
        var num = factory.CreateComplex(13.34f, -3.79f);
        System.out.println(num);
        num.add(factory.CreateComplex(-10f, 13.79f));
        System.out.println(num);
        var num2 = num.getZ();
        System.out.println(num.equals(num2));
    }

    public static void main(String[] args) {
        task1();
    }
}

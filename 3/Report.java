public class Report {
    static final float DOLLAR = 83.75f, EUR = 97.77f, LIRA = 2.02f;
    public static void generateReport(Employee[] arr){
        for (var man: arr){
            System.out.printf("Sotrudnik @%s zp: %15.02f RUB / %5.02f USD / %5.02f EUR / %5.02f TRY\n", man.fullName, man.salary, (man.salary)/DOLLAR, (man.salary)/EUR, (man.salary)/LIRA);
        }
    }
}
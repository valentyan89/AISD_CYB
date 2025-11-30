import java.util.Stack;
import java.util.StringTokenizer;

public class TwentyTwoPr {
    static float RPN(String variable) throws ArithmeticException{
        Stack<Float> numbers = new Stack<>();
        StringTokenizer stringToken = new StringTokenizer(variable);

        while (stringToken.hasMoreTokens()){
            var token = stringToken.nextToken();

            switch (token){
                case "+":
                    float b = numbers.pop(); float a = numbers.pop();
                    numbers.push(b + a);
                    break;

                case "-":
                    float bb = numbers.pop(); float aa = numbers.pop();
                    numbers.push(aa - bb);
                    break;

                case "*":
                    float bbb = numbers.pop(); float aaa = numbers.pop();
                    numbers.push(bbb*aaa);
                    break;

                case "/":
                    float b_ = numbers.pop(); float a_ = numbers.pop();
                    if (b_ == 0){
                        throw new ArithmeticException("Can't div by zero");
                    }
                    numbers.push(a_ / b_);
                    break;
            
                case "**":
                    float exponent = numbers.pop(); float base = numbers.pop();
                    numbers.push((float) Math.pow(base, exponent));
                    break;
                
                default:
                    try{
                        float number = Float.parseFloat(token);
                        numbers.push(number);
                    }
                    catch (NumberFormatException e){
                        throw new IllegalArgumentException("Non truth token");
                    }
                    break;
            }
        }
        if (numbers.size() != 1){
                throw new IllegalStateException("Error in vars");
            }

        return numbers.pop();

    }
    static void task1(){
        String rpnString = "2 3 ** 0 /";
        String tester = "2 3 4 5 6 * + - /";
        String point = tester;
        System.out.printf("RPN var: <%s>\nResult = %f", point, RPN(point));
    }

    static void task2(){
        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView();
        CalculatorController controller = new CalculatorController(model, view);
        view.setVisible(true);
    }

    public static void main(String[] args) {
        task1();
    }
}

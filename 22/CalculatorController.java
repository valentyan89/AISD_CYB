import java.awt.*;
import java.awt.event.*;

public class CalculatorController{
    private CalculatorModel model; private CalculatorView view; private String curOp = ""; private float first = 0; private boolean startNewNumber = true;

    public CalculatorController(CalculatorModel model, CalculatorView view){
        this.model = model; this.view = view;

        for (var key : view.getAllButtons().keySet()){
            view.getButton(key).addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    String command = e.getActionCommand();

                    if (command.matches("[0-9]")){
                        if (startNewNumber){
                            view.setDisplayText(command);
                            startNewNumber = false;
                        }
                        else{
                            view.setDisplayText(view.getDisplayText() + command);
                        }
                    }
                    else if (command.matches("[+\\-*/]")){
                        try{
                            first = Float.parseFloat(view.getDisplayText());
                            curOp = command;
                            startNewNumber = true;
                        }
                        catch (NumberFormatException ex){
                            view.setDisplayText("err");
                        }
                    }
                    else if (command.equals("=")){
                        try{
                            float secondOperand = Float.parseFloat(view.getDisplayText());
                            model.setValue(first);
                            switch (curOp){
                                case "+":
                                    model.add(secondOperand);
                                    break;
                                case "-":
                                    model.subtract(secondOperand);
                                    break;
                                case "*":
                                    model.multiply(secondOperand);
                                    break;
                                case "/":
                                    model.divide(secondOperand);
                                    break;
                                default:
                                    break;
                            }
                            view.setDisplayText(Float.toString(model.getResult()));
                            startNewNumber = true;
                        }
                        catch (ArithmeticException ex){
                            view.setDisplayText("div by zer0");
                            startNewNumber = true;
                        }
                        catch (NumberFormatException ex){
                            view.setDisplayText("err");
                        }
                    }
                    else if (command.equals("C")){
                        model.clear();
                        view.setDisplayText("");
                        startNewNumber = true;
                    }
                }
            });
        }
    }
}
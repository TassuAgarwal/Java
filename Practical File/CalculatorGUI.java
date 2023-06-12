import java.awt.*;
import java.awt.event.*;

public class CalculatorGUI extends Frame {
    private TextField firstInput;
    private TextField secondInput;
    private TextField resultField;
    private Button addButton;
    private Button subtractButton;
    private Button multiplyButton;
    private Button divideButton;
    private Button cancelButton;

    public CalculatorGUI() {
        // Set up the frame
        setTitle("Simple Calculator");
        setSize(300, 200);
        setLayout(new GridLayout(5, 2));

        // Create components
        firstInput = new TextField();
        secondInput = new TextField();
        resultField = new TextField();
        addButton = new Button("Add");
        subtractButton = new Button("Subtract");
        multiplyButton = new Button("Multiply");
        divideButton = new Button("Divide");
        cancelButton = new Button("Cancel");

        // Add components to the frame
        add(new Label("First Input:"));
        add(firstInput);
        add(new Label("Second Input:"));
        add(secondInput);
        add(new Label("Result:"));
        add(resultField);
        add(addButton);
        add(subtractButton);
        add(multiplyButton);
        add(divideButton);
        add(cancelButton);

        // Add event listeners
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateResult('+');
            }
        });

        subtractButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateResult('-');
            }
        });

        multiplyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateResult('*');
            }
        });

        divideButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateResult('/');
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clearFields();
            }
        });

        // Display the frame
        setVisible(true);
    }

    private void calculateResult(char operator) {
        try {
            int firstNumber = Integer.parseInt(firstInput.getText());
            int secondNumber = Integer.parseInt(secondInput.getText());
            int result = 0;

            switch (operator) {
                case '+':
                    result = firstNumber + secondNumber;
                    break;
                case '-':
                    result = firstNumber - secondNumber;
                    break;
                case '*':
                    result = firstNumber * secondNumber;
                    break;
                case '/':
                    result = firstNumber / secondNumber;
                    break;
            }

            resultField.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            resultField.setText("Invalid input");
        }
    }

    private void clearFields() {
        firstInput.setText("");
        secondInput.setText("");
        resultField.setText("");
    }

    public static void main(String[] args) {
        CalculatorGUI calculator = new CalculatorGUI();
    }
}

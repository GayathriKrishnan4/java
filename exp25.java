import java.awt.*;
import java.awt.event.*;

public class exp25 extends Frame implements ActionListener {
    TextField display;
    Button[] digits = new Button[10];
    Button add, sub, mul, div, eq, clr;
    double num1 = 0, num2 = 0, result = 0;
    char operator;

    public exp25() {
        setLayout(new BorderLayout());
        display = new TextField();
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        Panel panel = new Panel();
        panel.setLayout(new GridLayout(4, 4));

        for (int i = 0; i < 10; i++) {
            digits[i] = new Button(String.valueOf(i));
            digits[i].addActionListener(this);
            panel.add(digits[i]);
        }

        add = new Button("+");
        sub = new Button("-");
        mul = new Button("*");
        div = new Button("/");
        eq = new Button("=");
        clr = new Button("C");

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        eq.addActionListener(this);
        clr.addActionListener(this);

        panel.add(add);
        panel.add(sub);
        panel.add(mul);
        panel.add(div);
        panel.add(eq);
        panel.add(clr);

        add(panel, BorderLayout.CENTER);

        setSize(300, 300);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.charAt(0) >= '0' && command.charAt(0) <= '9') {
            display.setText(display.getText() + command);
        } else if (command.equals("+") || command.equals("-") || command.equals("*") || command.equals("/")) {
            num1 = Double.parseDouble(display.getText());
            operator = command.charAt(0);
            display.setText("");
        } else if (command.equals("=")) {
            num2 = Double.parseDouble(display.getText());
            switch (operator) {
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
                case '/': if (num2 != 0) result = num1 / num2; else result = 0; break;
            }
            display.setText(String.valueOf(result));
        } else if (command.equals("C")) {
            display.setText("");
            num1 = num2 = result = 0;
            operator = ' ';
        }
    }

    public static void main(String[] args) {
        new exp25();
    }
}

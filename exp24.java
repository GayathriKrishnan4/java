import java.awt.*;
import java.awt.event.*;

public class exp24 extends Frame implements ActionListener {
    TextField t1, t2, t3;
    Button b;
    Label l;

    public exp24() {
        setLayout(new FlowLayout());
        t1 = new TextField(10);
        t2 = new TextField(10);
        t3 = new TextField(10);
        b = new Button("Find Max");
        l = new Label("Result: ");

        add(t1);
        add(t2);
        add(t3);
        add(b);
        add(l);

        b.addActionListener(this);

        setSize(300, 200);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new exp24();
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int c = Integer.parseInt(t3.getText());
            int max = Math.max(a, Math.max(b, c));
            l.setText("Result: " + max);
        } catch (NumberFormatException ex) {
            l.setText("Invalid input");
        }
    }
}

package observer.Swing;

import javax.swing.*;

public class SwingObserverExample {
    JFrame frame;
    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    public void go() {
        frame = new JFrame();

        JButton button = new JButton("Should I do it?");
        button.addActionListener(new AngelListener());
        button.addActionListener(new DevilListener());

        /* Implementation using lamda expressions.
           button.addActionListener(event -> System.out.println("Don't do it, you might regret it!"));
           button.addActionListener(event -> System.out.println("Como on, do it!"));
         */
    }
}

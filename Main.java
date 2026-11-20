import java.awt.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        Frame frame = new Frame("GUI ASSIGNMENT");

        ScrollPane scrollPane = new ScrollPane(); 
        Panel mainPanel = new Panel();            
        Panel panel1 = new Panel();               
        Panel panel2 = new Panel();               

        mainPanel.setLayout(new GridLayout(2, 1)); 
        panel1.setLayout(new FlowLayout());        
        panel2.setLayout(new GridLayout(1, 2));    

        Button button1 = new Button("Tombol Flow");
        Label label1 = new Label("Belum diklik");

        Button button2 = new Button("Tombol Grid");
        Label label2 = new Label("Belum diklik");

        panel1.add(button1);
        panel1.add(label1);

        panel2.add(button2);
        panel2.add(label2);

        mainPanel.add(panel1);
        mainPanel.add(panel2);
        scrollPane.add(mainPanel);
        frame.add(scrollPane);

        button1.addActionListener(new ButtonClickListener(label1));
        button2.addActionListener(new ButtonClickListener(label2));
        frame.addWindowListener(new WindowCloseListener());

        frame.setSize(350, 200);
        frame.setVisible(true);
    }
}
import java.awt.*;
import java.awt.event.*;

public class ButtonClickListener implements ActionListener {
    private Label label;

    public ButtonClickListener(Label label) {
        this.label = label;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        label.setText("Tombol berhasil diklik!");
    }
}
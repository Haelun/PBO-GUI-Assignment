import java.awt.event.*;

public class WindowCloseListener extends WindowAdapter {
    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
}
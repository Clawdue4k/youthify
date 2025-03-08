package swing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

public class PanelBorder extends JPanel {

    public PanelBorder() {
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs);
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Lighter transparent background
        g2.setColor(new Color(222, 242, 241, 100)); // Light transparent background
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 25, 25);

        // Fading line border
        for (int i = 0; i < 5; i++) {
            g2.setColor(new Color(255, 255, 255, 100 - i * 20)); // Fading white border effect
            g2.drawRoundRect(i, i, getWidth() - 1 - (i * 2), getHeight() - 1 - (i * 2), 25, 25);
        }
    }
}

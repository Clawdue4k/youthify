package swing;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

public class Password extends JPasswordField {

    private String hint = "";
    private Color hintColor = new Color(23, 37, 42); // Custom hint color

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
        repaint();
    }

    public Color getHintColor() {
        return hintColor;
    }

    public void setHintColor(Color hintColor) {
        this.hintColor = hintColor;
        repaint();
    }

    public Password() {
        setBorder(new EmptyBorder(10, 10, 10, 10));
        setBackground(new Color(0, 0, 0, 0));
        setHorizontalAlignment(JPasswordField.CENTER);
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getForeground());
        int width = getWidth() - 1;
        int height = getHeight() - 1;
        g2.draw(new RoundRectangle2D.Double(0, 0, width, height, height, height));
        if (!hint.isEmpty() && getPassword().length == 0) {
            createHintText(g2);
        }
        g2.dispose();
        super.paintComponent(grphcs);
    }

    private void createHintText(Graphics2D g) {
        FontMetrics fm = g.getFontMetrics();
        g.setColor(hintColor);
        g.drawString(hint, ((getWidth() - fm.stringWidth(hint)) / 2), getHeight() / 2 + fm.getAscent() / 2 - 2);
    }
}

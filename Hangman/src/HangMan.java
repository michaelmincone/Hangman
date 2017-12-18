
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class HangMan extends JPanel implements ActionListener {

    private int xS = 8;
    private int yS = 30;
    public int counter;
    private Color hatColor = Color.BLACK;

    private int dx = 0;
    private int dy = 0;

    public HangMan(int initalX, int initalY) {
        // starting location
        xS = initalX;
        yS = initalY;
        counter = 0;

        Dimension dim = new Dimension(250, 475);
        this.setPreferredSize(dim);
        setFocusable(true);
        requestFocusInWindow();
        this.setVisible(true);

    }

    public void drawHangMan(Graphics g) {
       
        g.setColor(Color.BLACK);
        if (counter == 0) {
            repaint();

        }
        if (counter == 1) {
            drawHat(xS + 15, yS - 1, 20, 25, g);  // hat
            drawBrim(xS + 10, yS + 25, 30, 6, g);  // brim  
            repaint();

        }
        if (counter == 2) {
            drawHat(xS + 15, yS - 1, 20, 25, g);  // hat
            drawBrim(xS + 10, yS + 25, 30, 6, g);  // brim
            drawHead(xS, yS + 30, 50, 50, g); // head
            repaint();

        }
        if (counter == 3) {
            drawHat(xS + 15, yS - 1, 20, 25, g);  // hat
            drawBrim(xS + 10, yS + 25, 30, 6, g);  // brim
            drawHead(xS, yS + 30, 50, 50, g); // head
            drawBody(xS + 25, yS + 80, xS + 25, yS + 175, g);  // body
            repaint();

        }
        if (counter == 4) {
            drawHat(xS + 15, yS - 1, 20, 25, g);  // hat
            drawBrim(xS + 10, yS + 25, 30, 6, g);  // brim
            drawHead(xS, yS + 30, 50, 50, g); // head
            drawBody(xS + 25, yS + 80, xS + 25, yS + 175, g);  // body
            drawLeftLeg(xS - 20, yS + 225, xS + 25, yS + 175, g); //left leg 
            repaint();

        }
        if (counter == 5) {
            drawHat(xS + 15, yS - 1, 20, 25, g);  // hat
            drawBrim(xS + 10, yS + 25, 30, 6, g);  // brim
            drawHead(xS, yS + 30, 50, 50, g); // head
            drawBody(xS + 25, yS + 80, xS + 25, yS + 175, g);  // body
            drawLeftLeg(xS - 20, yS + 225, xS + 25, yS + 175, g); //left leg 
            drawRightLeg(xS + 25, yS + 175, xS + 65, yS + 225, g); //right leg
            repaint();

        }
        if (counter == 6) {
            drawHat(xS + 15, yS - 1, 20, 25, g);  // hat
            drawBrim(xS + 10, yS + 25, 30, 6, g);  // brim
            drawHead(xS, yS + 30, 50, 50, g); // head
            drawBody(xS + 25, yS + 80, xS + 25, yS + 175, g);  // body
            drawLeftLeg(xS - 20, yS + 225, xS + 25, yS + 175, g); //left leg 
            drawRightLeg(xS + 25, yS + 175, xS + 65, yS + 225, g); //right leg
            drawLeftArm(xS - 20, yS + 90, xS + 25, yS + 120, g); //left arm 
            repaint();

        }

        if (counter == 7) {
            drawHat(xS + 15, yS - 1, 20, 25, g);  // hat
            drawBrim(xS + 10, yS + 25, 30, 6, g);  // brim
            drawHead(xS, yS + 30, 50, 50, g); // head
            drawBody(xS + 25, yS + 80, xS + 25, yS + 175, g);  // body
            drawLeftLeg(xS - 20, yS + 225, xS + 25, yS + 175, g); //left leg 
            drawRightLeg(xS + 25, yS + 175, xS + 65, yS + 225, g); //right leg
            drawLeftArm(xS - 20, yS + 90, xS + 25, yS + 120, g); //left arm 
            drawRightArm(xS + 25, yS + 120, xS + 70, yS + 90, g); //right arm  
            repaint();

        }

       

    }

    public void drawLeftArm(int a, int b, int x, int y, Graphics g) {
        g.drawLine(a, b, x, y); //left arm
        repaint();

    }

    public void drawRightArm(int a, int b, int x, int y, Graphics g) {
        g.drawLine(a, b, x, y); //left arm
        repaint();

    }

    public void drawLeftLeg(int a, int b, int x, int y, Graphics g) {
        g.drawLine(a, b, x, y); //left arm
        repaint();

    }

    public void drawRightLeg(int a, int b, int x, int y, Graphics g) {
        g.drawLine(a, b, x, y); //left arm
        repaint();

    }

    public void drawBody(int a, int b, int x, int y, Graphics g) {
        g.drawLine(a, b, x, y); //left arm
        repaint();

    }

    public void drawHead(int a, int b, int x, int y, Graphics g) {
        g.drawOval(a, b, x, y); //left arm
        repaint();

    }

    public void drawHat(int a, int b, int x, int y, Graphics g) {
        g.drawRect(a, b, x, y); //left arm
        repaint();

    }

    public void drawBrim(int a, int b, int x, int y, Graphics g) {
        g.drawRect(a, b, x, y); //left arm
        repaint();

    }

    public void drawHanger(Graphics g) {
        g.fillRect(xS - 125, yS + 300, 80, 20);
        g.drawLine(xS - 85, yS + 300, xS - 85, yS + 80);
        g.drawLine(xS - 85, yS + 80, xS + 22, yS + 80);

    }

    public void incrementCounter() {
        counter++;

        repaint();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawHangMan(g);
        drawHanger(g);
        if(counter > 7){
        	g.setColor(Color.black);
        	
        	g.drawString("LOSER", 100, 500);
           
            repaint();
        }
        repaint();
        g.setFont(new Font("Sherif", Font.BOLD, 40));

    }

    public void actionPerformed(ActionEvent e) {
        repaint();
    }

}

//Shape Motion using applet

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class ShapeMotionApplet extends Applet implements Runnable {
    private int x, y;  // Position of the shape
    private int dx, dy;  // Velocity of the shape

    public void init() {
        // Set the initial position and velocity of the shape
        x = 50;
        y = 50;
        dx = 1;
        dy = 1;

        // Set the background color
        setBackground(Color.white);
    }

    public void start() {
        Thread thread = new Thread(this);
        thread.start();
    }

    public void stop() {
        // Stop the animation thread
        Thread.currentThread().interrupt();
    }

    public void run() {
        while (true) {
            // Update the position of the shape
            x += dx;
            y += dy;

            // Check if the shape has reached the boundaries of the applet
            if (x <= 0 || x >= getWidth() - 50) {
                dx = -dx;  // Reverse the velocity in the x-direction
            }
            if (y <= 0 || y >= getHeight() - 50) {
                dy = -dy;  // Reverse the velocity in the y-direction
            }

            // Repaint the applet to display the updated position of the shape
            repaint();

            // Delay for a short period to control the animation speed
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void paint(Graphics g) {
        // Clear the applet
        super.paint(g);

        // Draw the shape at its current position
        g.setColor(Color.red);
        g.fillOval(x, y, 50, 50);
    }
}
//HTML File
<html>
    <head>
        <title>Shape Motion Applet</title>
    </head>
    <body>
        <applet code="ShapeMotionApplet.class" width="400" height="300"></applet>
    </body>
</html>

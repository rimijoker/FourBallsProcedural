import processing.core.PApplet;

public class FourBalls extends PApplet {
    public static final int HEIGHT = 480;
    public static final int WIDTH = 640;
    public static final int DIAMETER = 20;
    public static int speed = 0;


    public static void main(String[] args) {
        PApplet.main("FourBalls");
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();
    }

    public void draw() {
        drawEllipses();
        System.out.println(speed);
        speed++;
    }

    public void drawEllipses() {

        for (int i = 1; i < 5; i++) {
            int S = i * speed;
            int H = i * HEIGHT / 5;
            ellipse(S, H, DIAMETER, DIAMETER);
        }
    }
}


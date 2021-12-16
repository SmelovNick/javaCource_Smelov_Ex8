import java.awt.*;

public enum Season {
    WINTER(Color.WHITE),
    SPRING(Color.CYAN),
    SUMMER(Color.GREEN),
    AUTUMN(Color.YELLOW);

    Season(Color color) {
        this.color = color;
    }

    private Color color;

    public Color getColor() {
        return color;
    }
}

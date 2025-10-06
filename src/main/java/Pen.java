public class Pen {
    public enum Color {
        RED("red"), GREEN("green"), BLUE("blue");
        private final String color;
        Color(String color) { this.color = color; }
        @Override public String toString() { return color; }
    }

    private Color color;
    private boolean isCapped;

    public Pen() {
        this.color = Color.RED;
        this.isCapped = true;
    }

    public Pen(Color color) {
        this.color = color;
        this.isCapped = true;
    }

    public void capOn() {
        isCapped = true;
    }

    public void capOff() {
        isCapped = false;
    }

    public String draw() {
        return isCapped ? "" : "Drawing " + color.toString();
    }

    public void changeColor(Color newColor) {
        if (isCapped) {
            this.color = newColor;
        }
    }
}

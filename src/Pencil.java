public class Pencil {
        private String color;
        private int length;

    public Pencil() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override                       // we put this instrument "override" because we want to make a view how printout will look like.
    public String toString() {
        return "Pencil{" +
                "color='" + color + '\'' +
                ", length=" + length +
                '}';
    }
}

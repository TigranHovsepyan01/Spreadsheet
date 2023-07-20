public class Cell {
    private Object value;

    private Color color;
    private Type type;

    public void setValue(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    public Color getColor() {
        return color;
    }

    public void setType(Type type) {
        this.type = type;
    }
    public Type getType(){
        return type;
    }
}

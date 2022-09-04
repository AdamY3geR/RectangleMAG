public class pepper
{
    private String color;
    private int weight;
    private int pieces;
    public pepper(String color, int weight, int pieces)
    {
        this.color = color;
        this.weight = weight;
        this.pieces = pieces;
    }

    public String getColor() {
        return color;
    }

    public int getPieces() {
        return pieces;
    }

    public int getWeight() {
        return weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPieces(int pieces) {
        this.pieces = pieces;
    }
}

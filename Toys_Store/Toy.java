public class Toy {
    public int id;
    public String name;
    public int quantity;
    public int winningProbability;

    public Toy(int id, String name, int quantity, int winningProbability) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.winningProbability = winningProbability;
    }

    
    public int getId() {
        return id;
    }
    private void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    private void setName(String name) {
        this.name = name;
    }
    public int getQuantity() {
        return quantity;
    }
    private void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getWinningProbability() {
        return winningProbability;
    }
    public void setWinningProbability(int winningProbability) {
        this.winningProbability = winningProbability;
    }
    public String toString(){
        return String.format("%s %s - %s - %s", id, name, quantity, winningProbability);
    }
}
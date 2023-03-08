import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lottery {
    private List<Toy> prod_list; 
    private static List<Toy> DEFAULT = new ArrayList<>(Arrays.asList(new Toy(2,"Лего", 5, 1)));
    public Lottery (List<Toy> prod_list) {
        this.prod_list = prod_list;
    }

    public Lottery () {
        this(DEFAULT);
    }
    public String toString(){
        StringBuilder result = new StringBuilder();
        prod_list.forEach(i-> result.append(i.toString()+"\n"));
        return result.toString();
    }

    public List<Toy> findByWinningProbability(int winningProbability){
        List<Toy> result = new ArrayList<>();
        prod_list.forEach(i->{
            if (i.getWinningProbability()==(winningProbability))
            //i.setQuantity() = (quantity - 1);
            result.add(i);
        });
        return result;
    }

}
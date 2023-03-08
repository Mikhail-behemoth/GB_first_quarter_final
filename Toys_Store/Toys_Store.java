import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

//

public class Toys_Store {
    public static void main(String[] args) {
        Toy car = new Toy(1,"Машинка", 5, 15);
        System.out.println(car);

        Lottery mach1 = new Lottery();
        System.out.println(mach1);

        List<Toy> prizes = new ArrayList<>();
        prizes.add(car);
        prizes.add(new Toy(2,"Самолётик", 5, 70));
        prizes.add(new Toy(3,"Плюшевый мишка", 5, 55));

        Lottery mach2 = new Lottery(prizes);
        System.out.println(mach2);

        Lottery mach4 = new Lottery(prizes);
        System.out.println(mach4.findByWinningProbability(70));
        
    }
}


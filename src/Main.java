import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        ArrayList<Integer> jupSan = new ArrayList<>();
        ArrayList<Integer> takSan = new ArrayList<>();
        Random random =  new Random();
        for (int i = 0; i < 50; i++) {
            integers.add(random.nextInt(1,100));
            if (integers.get(i)%2==1){
                takSan.add(integers.get(i));
            }
            if (integers.get(i)%2 ==0){
                jupSan.add(integers.get(i));
            }
        }
        System.out.println("Jup sandar "+ jupSan);
        System.out.println("  ");
        System.out.println("Tak sandar "+ takSan);

    }
}
import java.util.Random;
public class headOrTails {
    public static void main(String[] args){
        int a = new Random().nextInt(2);
        int cntHeads = 0;
        int cntTails = 0;
        System.out.println("Who are you?");
        System.out.print("> ");
        String name = new java.util.Scanner(System.in).nextLine();
        System.out.println("Hello, " + name + "!");

        System.out.println("Tossing a coin...");
        for(int i = 0; i < 3; i++){
            if(a == 0){
                System.out.println("Round " + i + ": Heads");
                cntHeads++;
            }
            else if(a == 1){
                System.out.println("Round " + i + ": Tails");
                cntTails++;
            }
        }
        System.out.println("Heads: " + cntHeads+ "," + "Tails: " + cntTails);
    }
}
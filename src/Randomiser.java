import java.util.*;


public class Randomiser {

    Random rand = new Random();
    static Scanner keyboard = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        Randomiser IO = new Randomiser();
        System.out.println("Welcome to the menu.");
        printMenu();
        char c = keyboard.next().charAt(0);
        keyboard.nextLine();
        while (c != 'f') {
            switch(c) {

                case 'a':
                    IO.rollDie();
                    break;
                case 'b':
                    IO.flipCoin();
                    break;
                case 'c':
                    IO.listPrime();
                    break;
                case 'l':
                    IO.listWords();
                    break;
                case 'k':
                    IO.doThis();
                default:
                    System.out.println("Select a or b");
            }
            printMenu();
            c = keyboard.next().charAt(0);
            keyboard.nextLine();
        }
        System.out.println("Thanks");
    }

    private static void printMenu() {

        System.out.println("Press 'a' for a dice roll");
        System.out.println("Press 'b' for a coin flip");
        System.out.println("Press 'c' to list primes under n");
    }

    public void rollDie() {
        System.out.println("Roll some dice");
        int diceToRoll;
        int diceSize;
        try {
            String[] diceRoll = keyboard.nextLine().split("d");
            diceToRoll = Integer.parseInt(diceRoll[0]);
            diceSize = Integer.parseInt(diceRoll[1]);
            System.out.println("You rolled a " + diceToRoll + "d" + diceSize);
            if (diceSize < 1 || diceSize > 999 || diceToRoll < 1 || diceToRoll > 999) {
                System.out.println("Numbers from 1 to 999 only lol");
            } else {
                for (int i = 0; i < diceToRoll; i++) {
                    int diceValue = rand.nextInt(diceSize) + 1;
                    System.out.print(diceValue + ", ");
                }
                System.out.println("\n");
            }
        } catch (NumberFormatException e) {
            System.out.println("Please type in the format 1d6");
        }
    }



    public void flipCoin() {
        int flip = rand.nextInt(2);
        switch(flip) {

            case 0:
                System.out.println("Tails");
                break;
            case 1:
                System.out.println("Heads");
                break;
        }
        System.out.println("\n");

    }

    public boolean isPrime(int n) {
        boolean value = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n%i == 0) {
                value = false;
            }
        } return value;

    }

    public void listPrime() {
        System.out.println("Type in a number to list all primes below it");
        try {
            int n = Integer.parseInt(keyboard.nextLine());
            for (int i = 1; i <= n; i++) {
                list.add(i);
            }
            for (int i = 0; i < list.size() - 1; i++) {
                if (!isPrime(list.get(i))) {
                    list.remove(list.get(i));
                    i--;
                }
            }
            list.remove(list.size()-1);
            System.out.println(list);
            list.clear();
        } catch (NumberFormatException e) {
            System.out.println("\n");
        }
    }

    public void listWords() {
        String p = "Four candles";
        String k = "Fork handles";

        System.out.println(p.equals(k));


    }

    public void doThis() {
//        int[] myInt = new int[24];
//        for (int i = 0; i < myInt.length; i++) {
//            myInt[i] = i;
//            System.out.println(myInt[i]);
//        }
//        ArrayList<String> myArray = new ArrayList<>();
//        myArray.add("Frank");
//        myArray.add("Ursula");
//        myArray.add("Connie");
//        myArray.add("Kevin");
//        Iterator<String> it = myArray.iterator();
//        while (it.hasNext()) {
//            String s = it.next();
//            System.out.println(s.substring(0, 1));
//        }

        HashMap<Integer, String> members = new HashMap<>();
        Scanner input = new Scanner(System.in);
        members.put(1, "Allen Green");
        members.put(2, "Noodles");
        System.out.println("Type in 1 or 2");
        char c = input.next().charAt(0);
        input.nextLine();
        System.out.println(members.get(1));
    }

}



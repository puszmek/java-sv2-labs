package introexceptiontrycatchtrace;

public class Jackpot {

    public static void main(String[] args) {

        Winner winner = new Winner();
        winner.addPerson(null);
        try {
            System.out.println(" A mai Jackpot nyertese: " + winner.getWinner());
        } catch (NullPointerException npe) {
            System.out.println("Hibás sorsolás!");
        }
    }
}

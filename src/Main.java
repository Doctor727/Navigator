public class Main {
    public static void main(String[] args) {
        Navigator nav = new Navigator(700);
        new Thread(nav).start();
    }
}
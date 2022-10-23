public class Navigator implements Runnable {
    int Distance, Speed, Time;
    public Navigator(int Distance) {
        this.Distance = Distance;
    }

    @Override
    public void run() {
        do {
            Speed = (int) (Math.random() * ((30 - 15) + 1)) + 15;
            Distance = Distance - (Speed);
            Time = Distance / Speed;
            System.out.println("Current speed " + Speed + " m/s");
            if (Time > 4) {
                System.out.println("To the destination " + Distance + " m, " + Time + " s");
            } else if (Time == 4 || Time == 3 || Time == 2) {
                System.out.println("To the destination " + Distance + " m, " + Time + " s");
            } else if (Time == 1) {
                System.out.println("To the destination " + Distance + " m, " + Time + " s");
            } else {
                System.out.println("You're almost there");
            }
            System.out.println();
            if (Distance < Speed) {
                System.out.println("You've arrived");
            }
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } while (Distance >= Speed);
    }
}
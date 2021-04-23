public class Main {

    public static void main(String[] args) {
        Main.run();

    }

    private static void run() {

        IHumanLifecycleObserver [] observers = new IHumanLifecycleObserver[]{
            new  Mother(),
            new BestFriend()
        };
        HumanLifecycle lifecycle= new HumanLifecycle(observers);
        lifecycle.runLifecycle();

    }
}

public class Main {
    public static void main(String[] args) {


        // Don't support Multi Threading
        NonThreadedSingleton nonThreadedSingleton = NonThreadedSingleton.getInstance();




        // Support Multi Threading
        Thread thread1 = new Thread(() ->
            {ThreadSafeLazyIntialization threadSafeLazyIntialization = ThreadSafeLazyIntialization.getInstance();});

        Thread thread2 = new Thread(() ->
            {ThreadSafeLazyIntialization threadSafeLazyIntialization = ThreadSafeLazyIntialization.getInstance();});



        // Support Multi Threading
        Thread thread3 = new Thread(() ->
            {ThreadSafeEagerInitialization threadSafeEagerInitialization = ThreadSafeEagerInitialization.getInstance();});

        Thread thread4 = new Thread(() ->
            {ThreadSafeEagerInitialization threadSafeEagerInitialization = ThreadSafeEagerInitialization.getInstance();});

    }
}
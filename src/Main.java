public class Main {
    @FunctionalInterface
    public interface OnTaskDoneListener<String> {
        void onDone(String v);
    }

    public static void main(String[] args) {
        OnTaskDoneListener<String> listener = System.out::println;
        Worker worker = new Worker(listener);
        worker.execute();
        worker.start();
    }
}

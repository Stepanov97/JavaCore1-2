public class Main {
    @FunctionalInterface
    public interface OnTaskDoneListener<String> {
        void onDone(int i);
    }
    @FunctionalInterface
    public interface OnErrorListener<String> {
        void onError(int i);
    }

    public static void main(String[] args) {
        OnTaskDoneListener<String> listener1 = i -> System.out.println("Task " + i + " is done");
        OnErrorListener<String> listener2 = i -> System.out.println("Task " + i + " NOT is done");
        Worker worker = new Worker(listener1,listener2);
        worker.start();
    }
}

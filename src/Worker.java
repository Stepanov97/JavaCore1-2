public class Worker {
    private Main.OnTaskDoneListener<String> callback;

    public Worker(Main.OnTaskDoneListener<String> callback) {
        this.callback = callback;
    }

    public void start() {
        for (int i = 0; i <= 100; i++) {
            if (i == 33) {
                callback.onDone("Task " + i + " is NOT done");
            } else {
                callback.onDone("Task " + i + " is done");
            }
        }
    }
}
public class Worker {
    private Main.OnTaskDoneListener<String> callback1;
    private Main.OnErrorListener<String> callback2;

    public Worker(Main.OnTaskDoneListener<String> callback1,Main.OnErrorListener<String> callback2) {
        this.callback1 = callback1;
        this.callback2 = callback2;

    }

    public void start() {
        for (int i = 0; i <= 100; i++) {
            if (i == 33) {
                callback2.onError(i);
            } else {
                callback1.onDone(i);
            }
        }
    }
}
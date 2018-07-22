class RunThread {
    public static void main(String[] args) {
        ThreadDemo x = new ThreadDemo("Thread 1");
        x.start();

        ThreadDemo y = new ThreadDemo("Thread 2");
        y.start();
    }
}
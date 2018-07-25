# Threads
* It is used for asynchronous behaviour. 
* Thread can be created using **Runnable Interface** or **Extending Thread**
* Thread.sleep(mills) pauses the current thread execution for defined **millseconds**.
* We can also use Thread.sleep(mills,nano) which indicates the time in millisecond and nanosecond.

**ThreadDemo.java**
```java
class ThreadDemo extends Thread{
    String name; 
    ThreadDemo(String n){
        name = n; 
        System.out.println("Creating: " +name);
    }

    public void run(){
        System.out.println("Running: " + name);

        try{
            for(int i = 4; i> 0; i--){
                System.out.println("Thread: "+name+" Printing: " + i);
                Thread.sleep(500);
            }
        }
            catch(InterruptedException e)
            {
                System.out.println("Thread "+ name + " interupted!");
            }
            System.out.println("Thread "+name+" exiting");
    }
   
}
```

**RunThread.java**
```java
class RunThread {
    public static void main(String[] args) {
        ThreadDemo x = new ThreadDemo("Thread 1");
        x.start();

        ThreadDemo y = new ThreadDemo("Thread 2");
        y.start();
    }
}
```

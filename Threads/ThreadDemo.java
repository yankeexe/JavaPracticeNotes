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

       
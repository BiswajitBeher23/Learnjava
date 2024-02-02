package interms.multithreading;

class Runnabledemo extends Thread {
    private Thread t;
    private String taskname;

    Runnabledemo(String name) {
        taskname = name;
        System.out.println("Creating the task " + taskname);
    }

    public void run() {
        System.out.println("Running task is " + taskname);

        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Task:  " + taskname + "," + i);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println("Task " + taskname + " is  interrupted.");
        }
        System.out.println("Exiting from " + taskname);
    }

    public void start(){
        System.out.println("Starting the task "+ taskname);
        if (t == null) {
            t = new Thread(this, taskname);
            t.start();
        }
    }
}

public class threadbasic {

    public static void main(String[] args) {
        Runnabledemo Ts1 = new Runnabledemo("Brush");
        Runnabledemo Ts2 = new Runnabledemo("Breakfast");
        Runnabledemo Ts3 = new Runnabledemo("preparing for college");
        Runnabledemo Ts4 = new Runnabledemo("Going to room");
        
        Ts1.start();
        Ts2.start();
        Ts3.start();
        Ts4.start();

        try {
            Ts1.join();
            Ts2.join();
            Ts3.join();
            Ts4.join();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Interrupted"+ e);
        }

    }
}

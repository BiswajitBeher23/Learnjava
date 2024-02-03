package interms.multithreading;

class Task {
    public void TaskDemo() {
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Task is running..." + i);
            }
        } catch (Exception e) {
            System.out.println("Task is interrupted.");
        }
    }
}

class Runnabledemo extends Thread {
    private Thread t;
    private String taskname;
    Task TD;

    Runnabledemo(String name, Task td) {
        taskname = name;
        TD = td;
    }

    public void run() {
        synchronized(TD){
            TD.TaskDemo();
        }
        System.out.println("Exiting from " + taskname);
    }

    public void start() {
        System.out.println("Starting the task " + taskname);
        if (t == null) {
            t = new Thread(this, taskname);
            t.start();
        }
    }
}

public class threadbasic {

    public static void main(String[] args) {

        Task TS = new Task();

        Runnabledemo Ts1 = new Runnabledemo("Brush", TS);
        Runnabledemo Ts2 = new Runnabledemo("Breakfast", TS);
        Runnabledemo Ts3 = new Runnabledemo("preparing for college", TS);
        Runnabledemo Ts4 = new Runnabledemo("Going to room", TS);

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
            System.out.println("Interrupted" + e);
        }

    }
}

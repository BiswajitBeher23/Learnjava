
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

class Runnabledemos extends Thread {
    private Thread t;
    private String taskname;
    Task TD;

    Runnabledemos(String name, Task td) {
        taskname = name;
        TD = td;
    }

    public void run() {
        synchronized (TD) {
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

        Runnabledemos Ts1 = new Runnabledemos("Brush", TS);
        Runnabledemos Ts2 = new Runnabledemos("Breakfast", TS);
        Runnabledemos Ts3 = new Runnabledemos("preparing for college", TS);
        Runnabledemos Ts4 = new Runnabledemos("Going to room", TS);

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

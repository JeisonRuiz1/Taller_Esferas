package model;

public abstract class MyThread implements Runnable{

    private Thread thread;
    private boolean isRunning;
    private boolean pause;
    private long speed;
    

    /**
     * Complejidad O(2)
     * @param speed
     */
    public MyThread(long speed){
        this.speed = speed;
        thread = new Thread(this);
    }

    /**
     * Complejidad O(2)
     */
    public void start(){
        isRunning = true;
        thread.start();
    }

    /**
     * Complejidad O(log N)
     */
    public synchronized void stop(){
        isRunning = false;
        notify();
    }

    /**
     * Complejidad O(2)
     */
    public synchronized void pause(){
        pause = true;
        notify();
    }

    /**
     * Complejidad O(2)
     */
    public synchronized void resume(){
        pause = false;
        notify();
    }
    protected abstract void executeTask();
    
    /**
     * complejidad O(N log N)
     */
    @Override
    public void run() {
        while(isRunning){
            executeTask();
            synchronized (this){
                while(pause) {
                    if(!isRunning){
                        break;
                    }
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            try {
                Thread.sleep(speed);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
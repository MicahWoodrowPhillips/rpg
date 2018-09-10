package com.lrg.star.app;


import com.lrg.star.app.gui.DesktopGui;

public class DesktopApp implements Runnable
{
    DesktopGui gui;
    Thread mainThread;
    ThreadGroup threadGroup;
    
    DesktopApp(ThreadGroup threadGroup)
    {
        this.threadGroup = threadGroup;
        System.out.println(getThread().getName() + " has started.");
    }
    
    public Thread getThread()
    {
        if(mainThread == null || !mainThread.isAlive())
        {
            mainThread = new Thread(threadGroup, this, "DesktopApp" + (System.currentTimeMillis() % 1000));
            mainThread.start();
        }
        return this.mainThread;
    }

    @Override
    public void run()
    {
        int n = 0;
        try
        {
            System.out.println("I did it, I'm doing it! " + n++);
            mainThread.sleep(500);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        
    }

}

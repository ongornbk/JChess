import Engine.ResourceImage;
import Engine.ResourceManager;

import java.io.File;
import java.lang.Thread;
import java.awt.image.BufferStrategy;
import java.awt.*;

public class Game extends Canvas implements Runnable{

Thread thread;

private boolean running = false;
private ChessBoard m_board;
private ResourceManager m_resources = Engine.ResourceManager.getInstance();


public Game ()
{
    new Window(800,800,"Chess Game Java Project",this);
}

    public static void main(String args[]){
        new Game();
    }

    public synchronized void start()
    {
        thread = new Thread();
        thread.start();
        running = true;

        InitializeResources();

        m_board = new ChessBoard();
    }

    public synchronized void stop()
    {

        try
        {
            thread.join();
            running = false;
        }
catch (Exception e)
{
    e.printStackTrace();
}

    }

    private synchronized void InitializeResources()
    {

        ResourceImage pawn_black = new ResourceImage("pawn_black.png");
        m_resources.PushResource("pawn_black.png",pawn_black);

        ResourceImage pawn_white = new ResourceImage("pawn_white.png");
        m_resources.PushResource("pawn_white.png",pawn_white);

        ResourceImage rook_black = new ResourceImage("rook_black.png");
        m_resources.PushResource("rook_black.png",rook_black);

        ResourceImage rook_white = new ResourceImage("rook_white.png");
        m_resources.PushResource("rook_white.png",rook_white);

        ResourceImage bishop_black = new ResourceImage("bishop_black.png");
        m_resources.PushResource("bishop_black.png",bishop_black);

        ResourceImage bishop_white = new ResourceImage("bishop_white.png");
        m_resources.PushResource("bishop_white.png",bishop_white);

    }

    public void run()
    {
        long lastTime = System.nanoTime();
        double amountOfTicks = 60.0;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
        long timer = System.currentTimeMillis();
        int frames = 0;

        while(running)
        {
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;
            while(delta>=1)
            {
                tick();
                delta--;
            }
            if(running) {
                update(((float)delta));
                render();
            }
            frames++;

            if(System.currentTimeMillis()- timer > 1000)
            {
                timer += 1000;
                System.out.println("FPS : " + frames);
                frames = 0;
            }
        }

       stop();

    }





    private void tick()
    {

    }

    private void update(float dt)
    {
    }

    private void render()
    {
        BufferStrategy bs = this.getBufferStrategy();
        if(bs == null)
        {
            this.createBufferStrategy(3);
            return;
        }

        Graphics gs = bs.getDrawGraphics();

        Engine.Graphics.Image.SetGraphics(gs);

        gs.setColor(new Color(133,133,145));

        for(int i = 0;i < 8;i++)
        {
            for(int j = 0;j < 8;j++)
            {
                if(((i+j)%2)==0)
                    gs.setColor(new Color(133,133,145));
                else
                    gs.setColor(new Color(55,44,45));

                gs.fillRect(i*100,j* 100,100,100);
            }
        }



        m_board.Render();

        Engine.Graphics.Renderer.getInstance().Begin();

        Engine.Graphics.Renderer.getInstance().End();

        gs.dispose();
        bs.show();
    }

}




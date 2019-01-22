package Engine.Graphics;

import java.util.Vector;

public class Renderer {
    private static Renderer ourInstance = new Renderer();

    public static Renderer getInstance() {
        return ourInstance;
    }

    private Vector<IRenderObject> m_renderer;

    private Renderer() {
        m_renderer = new Vector<IRenderObject>();
    }
    
    public void Begin()
    {
        for (IRenderObject ro : m_renderer) {

            ro.Draw();

        }
    }

    public void End()
    {
        m_renderer.clear();
    }

    public void Push(IRenderObject object)
    {
        m_renderer.add(object);
    }
    
    
}


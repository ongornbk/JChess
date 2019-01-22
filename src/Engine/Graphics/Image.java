package Engine.Graphics;

import Engine.IResource;
import Engine.ResourceImage;
import Engine.ResourceType;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

public class Image implements IRenderObject  {

    private BufferedImage m_image;
    private static Graphics m_graphics = null;

    public static void SetGraphics(Graphics gfx)
    {
        m_graphics = gfx;
    }


    public Image(BufferedImage image)
    {
        m_image = image;
    }

    @Override
    public void Draw() {

        m_graphics.drawImage(m_image,20,20,null);
    }


}

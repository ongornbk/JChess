package Engine.Graphics;

import Engine.IResource;
import Engine.ResourceImage;
import Engine.ResourceType;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

public class Image implements IRenderObject  {

    private BufferedImage m_image;

    private Engine.Core.Point2D<Integer> m_position;

    private static Graphics m_graphics = null;

    public static void SetGraphics(Graphics gfx)
    {
        m_graphics = gfx;
    }


    public Image(BufferedImage image)
    {
        m_image = image;
        m_position = new Engine.Core.Point2D(0,0);
    }

    public Image(Image image)
    {
        this.m_position = image.m_position;
        this.m_image = image.m_image;
    }

    public Image(Image image,Engine.Core.Point2D<Integer> position)
    {
        this.m_position = position;
        this.m_image = image.m_image;
    }

    public Image(BufferedImage image,Engine.Core.Point2D<Integer> position)
    {
        m_image = image;
        m_position = position;
    }

    @Override
    public void Draw() {
        m_graphics.drawImage(m_image,m_position.x,m_position.y,null);
    }


}

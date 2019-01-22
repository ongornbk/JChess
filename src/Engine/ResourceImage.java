package Engine;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.File;

public class ResourceImage implements IResource{

    BufferedImage m_image = null;

    public ResourceImage(String filename)
    {
        try {
            File file = new File(filename);
            if(!file.exists())
            {
                System.out.println(filename + " does not exist!");
            }
            m_image = ImageIO.read(file);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public BufferedImage Load()
    {
        return m_image;
    }

    @Override
    public ResourceType GetType() {
        return ResourceType.IMAGE;
    }
}

package Engine.Graphics;

import Engine.IResource;
import Engine.ResourceImage;
import Engine.ResourceType;

import java.awt.image.BufferedImage;

public class Image implements IRenderObject {

    private BufferedImage m_image;

    public Image(BufferedImage image)
    {
        m_image = image;
    }

    @Override
    public void Draw() {
System.out.println("Chrzescijanie tancza!");
    }
}

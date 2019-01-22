package Engine;

import java.util.HashMap;
import java.util.Map;


public class ResourceManager {

    private Map<String,IResource> m_resources;

    private static ResourceManager ourInstance = new ResourceManager();

    public static ResourceManager getInstance() {
        return ourInstance;
    }

    private ResourceManager() {
        m_resources = new HashMap<String,IResource>();
    }

    public void PushResource(String name, IResource resource)
    {
        m_resources.put(name,resource);
    }

    public Engine.IResource GetResource(String name)
    {
       return m_resources.get(name);
    }

}


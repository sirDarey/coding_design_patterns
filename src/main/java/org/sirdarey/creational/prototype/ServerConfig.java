package org.sirdarey.creational.prototype;

import java.util.ArrayList;
import java.util.List;

//implement Cloneable interface
class ServerConfig implements Cloneable {

    private String serverName;
    private List<String> loadedPlugins;

    public ServerConfig(String serverName) {
        this.serverName = serverName;
        this.loadedPlugins = new ArrayList<>();
    }

    // Expensive operation simulation
    public void loadPluginsFromDB() {
        System.out.println("\nLoading plugins from DB (Expensive)...");

        this.loadedPlugins.add("SecurityPlugin");
        this.loadedPlugins.add("LoggerPlugin");
    }

    public List<String> getPlugins() {
        return loadedPlugins;
    }


    @Override // Overriding clone for Deep Copy (Critical!)
    public ServerConfig clone() {
        try {
            ServerConfig copy = (ServerConfig) super.clone();
            // Deep copy the list, otherwise both objects share the same list reference
            copy.loadedPlugins = new ArrayList<>(this.loadedPlugins);

            return copy;

        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
package org.sirdarey.creational.prototype;

class PrototypeUsage {

    /**
     * Prototype Pattern Usage Example
     * 1. Create an initial complex object (e.g., ServerConfig) that is expensive to create.
     * 2. Clone the object to create new instances quickly.
     * 3. Modify the cloned instances as needed without affecting the original.
     * 4. Demonstrate deep copy to ensure cloned objects are independent.
     */

    public static void main(String[] args) {

        // 1. Create initial object (Expensive)
        ServerConfig masterConfig = new ServerConfig("MasterServer");
        masterConfig.loadPluginsFromDB();

        // 2. Clone it (Cheap)
        ServerConfig slaveConfig = masterConfig.clone();

        System.out.println("Master Plugins: " + masterConfig.getPlugins());
        System.out.println("Slave Plugins: " + slaveConfig.getPlugins());

        // 3. Modify the clone
        slaveConfig.getPlugins().add("CustomSlavePlugin");

        // 4. Verify independence (Deep Copy)
        System.out.println("Slave Modified: " + slaveConfig.getPlugins());
        System.out.println("Master Unchanged: " + masterConfig.getPlugins());
    }
}
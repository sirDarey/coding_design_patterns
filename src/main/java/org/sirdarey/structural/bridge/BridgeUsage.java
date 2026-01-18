package org.sirdarey.structural.bridge;

class BridgeUsage {

    /**
     * Bridge design pattern is a structural design pattern that decouples an abstraction from its implementation
     * so that the two can vary independently. It is useful when both the abstraction and the implementation
     * may have multiple variations and you want to avoid a combinatorial explosion of classes.
     */

    public static void main(String[] args) {

        System.out.println("\n-----Starting Bridge Pattern Demo -----\n");

        Shape redCircle = new Circle(new Red());
        Shape blueCircle = new Circle(new Blue());

        redCircle.draw();  // Drawing Circle... Applying Red Color
        blueCircle.draw(); // Drawing Circle... Applying Blue Color

        System.out.println("\n-----Ending Bridge Pattern Demo -----\n");
    }
}
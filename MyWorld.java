import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        // Jeremy's world: smaller arena for dodge-it
        super(500, 300, 1);

        Hero hero = new Hero();
        addObject(hero, 50, 50);
    }
}

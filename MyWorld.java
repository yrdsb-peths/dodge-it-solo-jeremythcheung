import greenfoot.*;

public class MyWorld extends World
{
    public MyWorld()
    {
        // Resolved: use goomba's 800x500 world with Jeremy's hero spawn
        super(800, 500, 1);

        Hero hero = new Hero();
        addObject(hero, 50, 50);

        Banana banana = new Banana();
        addObject(banana, 600, 100);

        Banana banana2 = new Banana();
        addObject(banana2, 400, 200);
    }
}

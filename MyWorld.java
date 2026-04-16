import greenfoot.*;

public class MyWorld extends World
{
    public MyWorld()
    {
        super(600, 400, 1);

        // Sky blue background
        GreenfootImage bg = new GreenfootImage(600, 400);
        bg.setColor(new Color(135, 206, 235));
        bg.fill();
        setBackground(bg);

        // Player follows the mouse cursor
        Hero hero = new Hero();
        addObject(hero, 300, 200);

        // Three bananas coming from the right at random speeds
        addObject(new Banana(), 600, 100);
        addObject(new Banana(), 600, 200);
        addObject(new Banana(), 600, 300);
    }
}

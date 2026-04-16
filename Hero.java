import greenfoot.*;

public class Hero extends Actor
{
    public Hero()
    {
        setImage("man01.png");
    }

    public void act()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if (mouse != null)
        {
            setLocation(mouse.getX(), mouse.getY());
        }

        if (isTouching(Banana.class))
        {
            getWorld().addObject(new Gameover(), getWorld().getWidth() / 2, getWorld().getHeight() / 2);
            Greenfoot.stop();
        }
    }
}

import greenfoot.*;

public class Banana extends Actor
{
    private int speed;

    public Banana()
    {
        setImage("bananas.png");
        speed = 3 + Greenfoot.getRandomNumber(5);
    }

    public void act()
    {
        setLocation(getX() - speed, getY());

        if (getX() <= 0)
        {
            reset();
        }
    }

    private void reset()
    {
        speed = 3 + Greenfoot.getRandomNumber(5);
        setLocation(getWorld().getWidth(), Greenfoot.getRandomNumber(getWorld().getHeight()));
    }
}

import greenfoot.*;

public class Cloud extends Actor
{
    private int speed;

    public Cloud(int speed)
    {
        this.speed = speed;
        GreenfootImage img = new GreenfootImage(80, 40);
        img.setColor(new Color(255, 255, 255, 200));
        img.fillOval(0, 15, 50, 25);
        img.fillOval(15, 5, 50, 30);
        img.fillOval(30, 10, 40, 25);
        setImage(img);
    }

    public void act()
    {
        setLocation(getX() - speed, getY());
        if (getX() < -50) {
            setLocation(getWorld().getWidth() + 50, getY());
        }
    }
}

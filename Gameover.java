import greenfoot.*;

public class Gameover extends Actor
{
    public Gameover()
    {
        GreenfootImage img = new GreenfootImage(300, 80);
        img.setColor(new Color(0, 0, 0, 180));
        img.fill();
        img.setColor(Color.RED);
        img.setFont(new Font("Arial", true, false, 48));
        img.drawString("GAME OVER", 20, 58);
        setImage(img);
    }

    public void act() {}
}

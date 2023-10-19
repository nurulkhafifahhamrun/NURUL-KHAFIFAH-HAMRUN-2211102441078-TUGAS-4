import greenfoot.*;

public class MyWorld extends World
{
    private int currentLevel = 1;
    
    public MyWorld()
    {    
        super(800, 600, 1);
        prepare();
    }
    
    public void act() {
        if (getObjects(ObjectSpecial.class).isEmpty()) {
            if (currentLevel < 3) {
                currentLevel++;
                showText("Level " + currentLevel, getWidth() / 2, getHeight() / 2);
                Greenfoot.delay(100);
                nextLevel();
            } else {
                showText("Game Over - You Win!", getWidth() / 2, getHeight() / 2);
                Greenfoot.stop();
            }
        }
    }
    
    public void prepare() {
        addObject(new Character(), getWidth() / 2, getHeight() - 30);
        addObject(new ObjectSpecial(), Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
        // Tambahkan pengaturan awal lainnya untuk level Anda di sini
    }
    
    public void nextLevel() {
        removeObjects(getObjects(ObjectSpecial.class));
        prepare();
        // Tambahkan kondisi khusus atau tantangan untuk setiap level di sini
    }
}



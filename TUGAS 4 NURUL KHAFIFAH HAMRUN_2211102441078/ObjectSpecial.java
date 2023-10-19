import greenfoot.*;

public class ObjectSpecial extends Actor
{
    private GreenfootSound collectSound; // Variabel collectSound untuk suara
    
    public ObjectSpecial(){
        setImage("beeper.png");
    }
    
    public void act()
    {
        checkForCollision();
    }
    
    public void checkForCollision() {
        Actor character = getOneIntersectingObject(Character.class);
        if (character != null) {
            ((Character) character).increaseScore();
            getWorld().removeObject(this);
            mainkanSuaraPengumpulan();
        }
    }
    
    public void mainkanSuaraPengumpulan() {
        if (collectSound == null) {
            // Muat file suara di sini. Pastikan "collect.wav" ada dalam direktori proyek Anda.
            collectSound = new GreenfootSound("collect.wav");
        }
        collectSound.play();
    }
}


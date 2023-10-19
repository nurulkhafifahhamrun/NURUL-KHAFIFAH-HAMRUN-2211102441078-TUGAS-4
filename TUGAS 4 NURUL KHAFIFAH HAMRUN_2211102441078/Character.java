import greenfoot.*;

public class Character extends Actor {
    private int score = 0;
    private GreenfootImage[] characterImages; // array untuk animasi karakter
    private int animationIndex = 0;

    public Character() {
        characterImages = new GreenfootImage[4];
        for (int i = 0; i < 4; i++) {
            characterImages[i] = new GreenfootImage("polar-bear.png");
        }
        setImage(characterImages[0]);
    }

    public void act() {
        move(3);
        animateCharacter();
    }

    public void animateCharacter() {
        if (animationIndex < 3) {
            animationIndex++;
        } else {
            animationIndex = 0;
        }
        setImage(characterImages[animationIndex]);
    }

    public void increaseScore() {
        score++; // Menambahkan 1 ke skor saat dipanggil
        // Anda bisa menambahkan kode lain di sini jika diperlukan
    }

    public int getScore() {
        return score; // Mengembalikan nilai skor saat dipanggil
    }
}




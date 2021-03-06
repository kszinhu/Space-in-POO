import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Shooting {
  private Image shootImages[] = new Image[2];
  private Sound soundManager = new Sound();
  private int x, y;
  private int height, width;
  private boolean isVisible;

  private static final int WIDTH = 1024;
  private static int speed = 10;

  public Shooting(int x, int y) {
    this.x = x;
    this.y = y;
    soundManager.playSound(2);
    isVisible = true;
  }

  public void load() {
    shootImages[0] = new ImageIcon("players\\shootGirl.png").getImage();
    shootImages[1] = new ImageIcon("players\\shootBoy.png").getImage();

    height = shootImages[0].getHeight(null);
    width = shootImages[0].getWidth(null);
  }

  public void update() {
    this.x += speed;
    if (this.x > WIDTH)
      isVisible = false;
  }

  public Rectangle getBounds() {
    return new Rectangle(x, y, width, height);
  }

  public boolean isVisible() {
    return isVisible;
  }

  public void setVisible(boolean ifVisible) {
    this.isVisible = ifVisible;
  }

  public static int getSpeed() {
    return speed;
  }

  public static void setSpeed(int newSpeed) {
    speed = newSpeed;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public Image getImage(int shootStatus) {
    return shootImages[shootStatus];
  }

}
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Enemy extends JPanel {

  private int x, y;
  private int height, width;
  private boolean isVisible;
  private Image Enemy;

  private static int SPEED = 5;
  int moveStatus = 0;

  public Enemy(int x, int y) {
    this.x = x;
    this.y = y;
    isVisible = true;
  }

  public void load() {
    Enemy = new ImageIcon("enemies\\Duke.png").getImage();
    this.height = Enemy.getHeight(null);
    this.width = Enemy.getWidth(null);
  }

  public void update() {
    this.x -= SPEED;
  }

  public boolean isVisible() {
    return isVisible;
  }

  public void setVisible(boolean ifVisible) {
    this.isVisible = ifVisible;
  }

  public Rectangle getBounds() {
    return new Rectangle(x, y, width, height);
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public Image getImage() {
    return Enemy;
  }

  public void setImage(Image photo) {
    this.Enemy = photo;
  }

  public static void setSpeed(int Speed) {
    SPEED = Speed;
  }

}

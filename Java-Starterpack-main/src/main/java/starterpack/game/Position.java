package starterpack.game;

public class Position {
  private int x;
  private int y;
  private int hashCode;

  public Position() {}

  public Position(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  public void translate(Position destination) {
    this.x = destination.getX();
    this.y = destination.getY();
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof Position)) {
      return false;
    }
    Position p = (Position) obj;
    // If the individual coordinates are the same
    return ((this.getX() == p.getX()) && (this.getY() == p.getY()));
  }

  @Override
  public String toString() {
    return "(" + x + ", " + y + ")";
  }

  @Override
  public int hashCode() {
    return this.hashCode;
  }
}

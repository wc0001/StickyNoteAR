package StickyNoteAR;

public class StickyNote {
  int[] color = new int[3];
  Double[] location = new Double[3];
  Double[] normal = new Double[3];
  String data;

  public StickyNote(int[] color, Double[] location, Double[] normal, String data) {
      this.color = color;
      this.location = location;
      this.normal = normal;
      this.data = data;
  }

  public int[] getColor() {
      return color;
  }

  public Double[] getLocation() {
      return location;
  }

  public Double[] getNormal() {
      return normal;
  }

  public String getData() {
      return data;
  }
}

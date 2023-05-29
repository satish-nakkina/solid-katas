package christmasLights.interfaces;

public interface LightGrid {
    void turnOn(int startX, int startY, int endX, int endY);
    void turnOff(int startX, int startY, int endX, int endY);
    void toggle(int startX, int startY, int endX, int endY);
}
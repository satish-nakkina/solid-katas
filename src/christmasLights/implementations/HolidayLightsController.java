package christmasLights.implementations;

import christmasLights.interfaces.LightGrid;

public class HolidayLightsController {
    private LightGrid lightGrid;
    private int count=0;

    public HolidayLightsController(LightGrid lightGrid) {
        this.lightGrid = lightGrid;
    }

    public void executeInstructions(String[] instructions) {
        for (String instruction : instructions) {
            String[] parts = instruction.split(" ");

            if (parts[0].equals("turn")) {
                int startX = Integer.parseInt(parts[2].split(",")[0]);
                int startY = Integer.parseInt(parts[2].split(",")[1]);
                int endX = Integer.parseInt(parts[4].split(",")[0]);
                int endY = Integer.parseInt(parts[4].split(",")[1]);

                if (parts[1].equals("on")) {
                    System.out.println("on");
                    lightGrid.turnOn(startX, startY, endX, endY);
                } else if (parts[1].equals("off")) {
                    lightGrid.turnOff(startX, startY, endX, endY);
                }
            } else if (parts[0].equals("toggle")) {
                int startX = Integer.parseInt(parts[1].split(",")[0]);
                int startY = Integer.parseInt(parts[1].split(",")[1]);
                int endX = Integer.parseInt(parts[3].split(",")[0]);
                int endY = Integer.parseInt(parts[3].split(",")[1]);

                lightGrid.toggle(startX, startY, endX, endY);
            }
        }
    }

    public int getTotalBrightness() {
        return lightGrid.getTotalBrightness();
    }
    public int getTotalLightsLit() {
        return lightGrid.getTotalLightsLit();
    }
}

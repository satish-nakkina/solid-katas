package christmasLights.implementations;

import christmasLights.interfaces.BrightnessCalculator;
import christmasLights.interfaces.LightCounter;
import christmasLights.interfaces.LightGrid;

public class LightGridImpl implements LightGrid, BrightnessCalculator, LightCounter {
    private int[][] lights;
    private int[][] brightness;

    private int totalBrightness;
    private int totalLightsLit;
    private int gridSize;
    public LightGridImpl(int gridSize) {
        lights = new int[gridSize][gridSize];
        brightness= new int[gridSize][gridSize];
        this.gridSize=gridSize;
        totalBrightness=0;
        totalLightsLit=0;
    }

    public void turnOn(int startX, int startY, int endX, int endY) {
        for (int i = startX; i <= endX; i++) {
            for (int j = startY; j <= endY; j++) {
                if(lights[i][j]==0){
                    lights[i][j]=1;
                }
                brightness[i][j]++;
            }
        }
    }

    public void turnOff(int startX, int startY, int endX, int endY) {
        for (int i = startX; i <= endX; i++) {
            for (int j = startY; j <= endY; j++) {
                if(lights[i][j]==1){
                    lights[i][j]=0;
                }
                brightness[i][j]=Math.max(brightness[i][j]-1,0);
            }
        }
    }

    public void toggle(int startX, int startY, int endX, int endY) {
        for (int i = startX; i <= endX; i++) {
            for (int j = startY; j <= endY; j++) {
                if(lights[i][j]==0){
                    lights[i][j]=1;
                }
                else{
                    lights[i][j]=0;
                }
                brightness[i][j]+=2;
            }
        }
    }

    @Override
    public int getTotalBrightness() {
        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j <gridSize; j++) {

                totalBrightness+=brightness[i][j];
            }
        }
        return  totalBrightness;
    }

    @Override
    public int getTotalLightsLit() {
        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j <gridSize; j++) {

                if(lights[i][j]>0){
                    totalLightsLit++;
                }
            }
        }
        return  totalLightsLit;
    }

}

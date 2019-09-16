package structure.proxy;

import java.net.URL;

public class HighResolutionImage implements Image {
    private URL imageUrl;
    private long startTime;
    private int height;
    private int width;

    public HighResolutionImage(URL imageUrl) {
        this.imageUrl = imageUrl;
        this.startTime=System.currentTimeMillis();
        this.height=600;
        this.width=600;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public boolean isLoad(){
        long endTime = System.currentTimeMillis();
        return endTime-startTime>3000;
    }


    @Override
    public void showImage() {
        System.out.println("real: "+imageUrl);
    }
}

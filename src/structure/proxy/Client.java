package structure.proxy;

import java.net.URL;

public class Client {
    public static void main(String[] args) throws Exception{
        String image = "http://image.jpg";
        URL url = new URL(image);
        HighResolutionImage high = new HighResolutionImage(url);
        ImageProxy proxy = new ImageProxy(high);
        proxy.showImage();
    }
}

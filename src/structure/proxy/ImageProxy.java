package structure.proxy;

public class ImageProxy implements Image {
    private HighResolutionImage high;

    public ImageProxy(HighResolutionImage high) {
        this.high = high;
    }



    @Override
    public void showImage() {
        while (!high.isLoad()){
            try {
                System.out.println("Temp: "+high.getHeight()+" "+high.getWidth());
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        high.showImage();
    }
}

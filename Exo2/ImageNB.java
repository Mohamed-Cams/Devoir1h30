package Exo2;

public class ImageNB extends Image{
    public ImageNB(int h, int w){
    super(h,w);
    for(int i=0;i<h;i++){
    for(int j=0;j<w;j++){
    this.t[i][j] = new PixelNB();
    }
    }
    }
   }

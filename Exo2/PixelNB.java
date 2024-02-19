package Exo2;

public class PixelNB extends Pixel{
    public PixelNB(){
    super();
    }
    public void setRed(int r){
    if(r>=0 && r<=255){
    this.r = r;
    this.g = r;
    this.b = r;
    }
    }
    public void setGreen(int g){
    if(g>=0 && g<=255){
    this.r = g;
    this.g = g;
    this.b = g;
    }
    }
    public void setBlue(int b){
    if(b>=0 && b<=255){
    this.r = b;
    this.g = b;
    this.b = b;
    }
    }
   }
package Exo2;

public class Pixel{
    int r,g,b;
    public Pixel(){
    this.r = 0; this.g = 0; this.b = 0;
    }
    public void setRed(int r){
    if(r>=0 && r<=255) this.r = r;
    }
    public void setGreen(int g){
    if(g>=0 && g<=255) this.g = g;
    }
    public void setBlue(int b){
    if(b>=0 && b<=255) this.b = b;
    }
    
    }
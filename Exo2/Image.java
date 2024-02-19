package Exo2;

public class Image{
    Pixel[][] t; // la premiere dimension est verticale
    public Image(int h, int w){
    this.t = new Pixel[h][w];
    for(int i=0;i<h;i++){
    for(int j=0;j<w;j++){
    this.t[i][j] = new Pixel();
    }
    }
    }
    public void setPixel(int i, int j, int r, int g, int b){
    if(i>=0 && i<this.t.length && j>=0 && j<this.t[0].length){
    this.t[i][j].setRed(r);
    this.t[i][j].setGreen(g);
    this.t[i][j].setBlue(b);
    }
    }
    public String toString(){
    String s = "";
    for(int i=0;i<this.t.length;i++){
    for(int j=0;j<this.t[0].length;j++){
    s = s + " " + this.t[i][j].toString();
    }
    s = s + "\n";
    }
    return s;
 }
 }

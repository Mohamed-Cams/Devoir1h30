package Exo3;

public class Vote{
    String candidat;
    int voix;
    public Vote(String c, int v){
    this.candidat = c;
    this.voix = v;
    }
    public boolean equals(Object o){
    return o instanceof Vote && ((Vote) o).candidat.equals(this.candidat);
    }
   } 

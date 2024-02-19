package Exo3;

    public class WTA extends Etat{
        public WTA(String n, int e, int g){
        super(n,e,g);
        }
        public int getGrandElecteurs(String candidat){
        int vc = this.getVoix(candidat);
        boolean prems = true;
        for(Vote v:this.votes){
        if(v.voix>vc) return 0;
    }
    return this.gdElec;
    }
   }


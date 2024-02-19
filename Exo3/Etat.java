package Exo3;

import java.util.ArrayList;

public abstract class Etat{
 String nom;
 int electeurs, gdElec;
 ArrayList<Vote> votes;
 public Etat(String nom, int n, int ge){
 this.nom = nom;
 this.electeurs = n;
 this.gdElec = ge;
 this.votes = new ArrayList<Vote>();
 }
 public String getNom(){ return this.nom; }
 public void setVotes(String candidat, int voix){
 Vote v = new Vote(candidat, voix);
 if(!this.votes.contains(v)) this.votes.add(v);
 }
 public int getVoix(String c){
 for(Vote v:this.votes){
 if(v.candidat.equals(c)) return v.voix;
 }
 return 0;
 }
 public abstract int getGrandElecteurs(String candidat);
}
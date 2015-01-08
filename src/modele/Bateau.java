package modele;


import java.util.ArrayList;
/**
 * <b>Bateau est la classe représentant notre objet bateau.</b>
 * <p>
 * Un bateau est caractérisé par les informations suivantes :
 * <ul>
 * <li>Une taille composé de case </li>
 * <li>Le nom du joueur a qui appartient le site</li>
 * <li>Un etat qui retourne l'etat du bateau</li>
 * </ul>
 * </p>
 * <p>
 * 
 * 
 * </p>
 * 
 * 
 * @author Barry & Diagana
 * @version 3.0
 */
public class Bateau {
	
	/** est la taille du bateau composé de case.
	 * 
	 */
	 int taille;
	 
	 
	 ArrayList<Case> bateau = new ArrayList<>();
	 
	 /**
	  *Retourne l'etat du bateau (Coulé/Non coulé).
	  */
	 boolean etat;   //False = Non coulé , True = Coulé
	 String joueur;
	/**
	 * la construction du bateau se fait en initialisant 
	 */
	public Bateau (int taille, String joueur){
    	this.taille= taille;
    	this.etat= true;
    	this.joueur="";
	}

	/**
	 *Permet de placer le bateau selon lo 
	 */
	  Bateau (int taille, Coordonnees a, String joueur) {
	
		for (int i=0;i<taille-1;i++){
			if (a.orientation){
				bateau.add(new Case(a.x,a.y+i));
			}
			else{
				bateau.add(new Case(a.x+i,a.y));
			}
		}
		this.joueur=joueur;
		this.etat=false;
	 }
	  /**
	   * recupére l'etat du bateau
	   * @return
	   */
	public boolean isEtat() {
		
		return etat;
		}
		
	/**
	 * affiche l'etat du bateau
	 * @param etat
	 */

	public void setEtat(boolean etat) {
		
		this.etat = etat;
	}
	
	
}

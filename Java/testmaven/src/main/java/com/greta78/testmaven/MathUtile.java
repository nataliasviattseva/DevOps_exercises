package com.greta78.testmaven;

public class MathUtile {
	private int valeur;
	private int factorielle;
	private int somme;
	private int aleatoire;

	// Initialise Valeur à N
	public MathUtile(int N) {
		valeur = N;
	}

	// Effectue N!
	public int factorielle() {
		int i = 1;
		int facto = 1;
		while (i <= valeur) {
			facto = facto * i;
			i++;
		}
		factorielle = facto;
		return facto;
	}

	// Effectue ∑N
	public int somme() {
		int s = 0;
		int i = 0;
		while (i <= valeur) {
			s = s + i;
			i++;
		}
		somme = s;
		return s;
	}

	// Tire un nombre entre 0 et N
	public int aleatoire() {
		int r;
		r = (int) (Math.round(valeur * Math.random()));
		aleatoire = r;
		return r;
	}

	public void affiche() {
		System.out.println(
		"Valeur :" + valeur + " Factorielle: " + factorielle + " Somme:" + somme + " valeur aléatoire:" + aleatoire);
		}

}

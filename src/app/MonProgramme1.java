package app;

import metier.MaThread;

public class MonProgramme1 {

	public static void main(String[] args) throws Exception {

		MaThread mt1 = new MaThread(200);
		MaThread mt2 = new MaThread(400);
		Thread t1 = new Thread(mt1);
		Thread t2 = new Thread(mt2);
		t1.start();
		t2.start();

		/*
		 * Un fois l'instanciation d'une thread effectuée, la méthode start() invoquera
		 * automatiquement la méthode run().
		 */

		int i;
		for (i = 0; i < 5; i++) {
			System.out.println("La thread initiale " + i);
			Thread.sleep(300);
		}
		System.out.println("La thread initiale se termine");

		/*
		 * L'usage de threads :
		 * 
		 * s'exécutant en parallèle sur plusieurs processeurs permet des gains de temps
		 * considérables; permet aussi de rendre les entrées/sorties asynchrones; mais
		 * leur utilisation n'a pas que des avantages, le code est souvent difficile à
		 * comprendre et à débuguer.
		 * 
		 */

		/*
		 * Une thread se termine lorsque la méthode run() se termine ou lors de l'appel
		 * à la méthode stop(). Lorsqu'une thread est terminée l'objet de type Thread
		 * est toujours accessible mais il n'est plus possible de reprendre son
		 * exécution via la méthode start(). Lorsqu'une thread est terminée l'objet de
		 * type Thread est toujours accessible (appel à la méthode isAlive()).
		 */

	}

}
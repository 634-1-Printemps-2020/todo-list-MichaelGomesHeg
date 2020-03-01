package metier;

import java.util.ArrayList;

public class GestionListe {

    public GestionListe() {
    }

    public void listeComplete(ArrayList<Tache> liste){
        System.out.println("Liste des tâches :");
        for(Tache tache : liste) {
            System.out.println(tache);
        }
    }

    public void filterByStatus(ArrayList<Tache> liste, StatusState condition){
        System.out.println("Liste filtré selon status = " + condition);
        for(Tache tache : liste) {
            if (tache.getStatus() == condition) {
                System.out.println(tache);
            }
        }
    }

    public void filterByResolution(ArrayList<Tache> liste, ResolutionState condition){
        System.out.println("Liste filtré selon status = " + condition);
        for(Tache tache : liste) {
            if (tache.getReslution() == condition) {
                System.out.println(tache);
            }
        }
    }
}

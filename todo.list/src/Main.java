import exception.DateException;
import metier.GestionListe;
import metier.ResolutionState;
import metier.StatusState;
import metier.Tache;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws DateException {
	// write your code here
        ArrayList<Tache> historiqueNonTrié = new ArrayList<>();
        GestionListe gestion = new GestionListe();

        //Creation des taches
        Tache examenProg = new Tache("Michael Gomes", "Examen de programation", LocalDate.now(), StatusState.OPEN, ResolutionState.IGNORED);
        Tache examenStat = new Tache("Paul Louis", "Examen de statistique", LocalDate.of(2020, 03, 3), StatusState.OPEN, ResolutionState.DONE);

        //Enregistrement tache
        historiqueNonTrié.add(examenProg);
        historiqueNonTrié.add(examenStat);

        //Test tache examenProg
        examenProg.AnnulerTache();
        examenProg.Replanification(LocalDate.of(2020, 07, 3));

        //Test tache examenStat
        examenStat.AnnulerTache();
        examenStat.Replanification(LocalDate.of(2020, 07, 4));

        //Afficher liste des taches
        gestion.listeComplete(historiqueNonTrié);
        gestion.filterByStatus(historiqueNonTrié, StatusState.CANCELED);
        gestion.filterByResolution(historiqueNonTrié, ResolutionState.DONE);
    }
}

package metier;

import java.util.Date;

public class Tache {
    String createur;
    String descritpion;
    Date executioinPlanif;
    StatusState status;
    ResolutionState reslution;

    public Tache(String createur, String descritpion, Date executioinPlanif, StatusState status, ResolutionState reslution) {
        this.createur = createur;
        this.descritpion = descritpion;
        this.executioinPlanif = executioinPlanif;
        this.status = status;
        this.reslution = reslution;
    }

    public StatusState AnnulerTache(){
        return this.status = StatusState.CANCELED;
    }



}

package metier;

import exception.DateException;
import java.time.LocalDate;

public class Tache {
    String createur;
    String descritpion;
    LocalDate executionPlanif;
    StatusState status;
    ResolutionState reslution;


    public Tache(String createur, String descritpion, LocalDate executionPlanif, StatusState status, ResolutionState reslution) throws DateException {
        this.createur = createur;
        this.descritpion = descritpion;
        this.executionPlanif = executionPlanif;
        if(executionPlanif.isBefore(LocalDate.now())){
            throw new DateException("Date inférieur a la date du jour");
        }
        this.status = status;
        this.reslution = reslution;
    }

    public StatusState AnnulerTache(){
        return this.status = StatusState.CANCELED;
    }

    public void Replanification(LocalDate executionPlanif) throws DateException {
        if (executionPlanif.isBefore(LocalDate.now())) {
            throw new DateException("Date inférieur a la date du jour");
        } else {
            this.executionPlanif = executionPlanif;
        }
    }

    @Override
    public String toString() {
        return "Tache{" +
                "createur='" + createur + '\'' +
                ", descritpion='" + descritpion + '\'' +
                ", executionPlanif=" + executionPlanif +
                ", status=" + status +
                ", reslution=" + reslution +
                '}';
    }

    public StatusState getStatus() {
        return status;
    }

    public ResolutionState getReslution() {
        return reslution;
    }
    public String getCreateur() {
        return createur;
    }

    public String getDescritpion() {
        return descritpion;
    }

    public LocalDate getExecutionPlanif() {
        return executionPlanif;
    }
}

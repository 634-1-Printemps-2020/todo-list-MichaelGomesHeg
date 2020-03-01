package metier;

import exception.DateException;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class TacheTest {

    @Test
    public void creationTache() throws DateException {
        Tache tache = new Tache("test", "Ceci est un test", LocalDate.now(), StatusState.OPEN, ResolutionState.DONE);
        Assert.assertEquals("test", tache.getCreateur());
        Assert.assertEquals("Ceci est un test", tache.getDescritpion());
        Assert.assertEquals(LocalDate.now(), tache.getExecutionPlanif());
        Assert.assertEquals(StatusState.OPEN, tache.getStatus());
        Assert.assertEquals(ResolutionState.DONE, tache.getReslution());
    }

    @Test
    public void annulationTache() throws DateException{
        Tache tache = new Tache("test", "Ceci est un test", LocalDate.now(), StatusState.OPEN, ResolutionState.DONE);
        tache.AnnulerTache();
        Assert.assertEquals(StatusState.CANCELED, tache.getStatus());
    }

    @Test
    public void replanification() throws DateException {
        Tache tache = new Tache("test", "Ceci est un test", LocalDate.now(), StatusState.OPEN, ResolutionState.DONE);
        tache.Replanification(LocalDate.of(2021, 01, 01));
        Assert.assertEquals(LocalDate.of(2021, 01, 01), tache.getExecutionPlanif() );
    }

    @Test(expected = DateException.class)
    public void exceptionReplanification() throws DateException {
        Tache tache = new Tache("test", "Ceci est un test", LocalDate.now(), StatusState.OPEN, ResolutionState.DONE);
        tache.Replanification(LocalDate.of(1998, 03, 07));
    }
}
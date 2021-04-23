import java.time.LocalDate;

public class HumanLifecycle {

   private IHumanLifecycleObserver [] observers;

    public HumanLifecycle(IHumanLifecycleObserver[] observers) {
        this.observers = observers;
    }

    public void runLifecycle (){
        runHumanBirth();
        runHumanWentKindergarten();
        runHumanWentSchool();
        runHumanWentUniversity();
        runHumanGotJob();
        runHumanMadeFamily();
        runHumanCreateChild();
        runHumanRetired();
        runHumanDied();
    }

    private void runHumanRetired() {
        for (int i = 0; i < observers.length; i++) {
            observers[i].onHumanRetired(LocalDate.of(2065,2,21),"TeamLead",6000.0,300.0);
        }

    }

    private void runHumanGotJob() {
        for (int i = 0; i < observers.length; i++) {
            observers[i].onHumanGotJob(LocalDate.of(2022,12,1),"taine", 350);
        }

    }

    private void runHumanDied() {

        for (int i = 0; i < observers.length; i++) {
            observers[i].onHumanDied(LocalDate.of(2082,7,21),false,"Somali");
        }

    }

    private void runHumanCreateChild() {

        for (int i = 0; i < observers.length; i++) {
            observers[i].onHumanCreateChild(LocalDate.of(2032,12,2),true,"Svyatopolk", 3.1f,50);
        }
    }

    private void runHumanMadeFamily() {
        for (int i = 0; i < observers.length; i++) {
            observers[i].onHumanMadeFamily(LocalDate.of(2031,6,4),"Anna",36);
        }
    }

    private void runHumanWentUniversity() {
        for (int i = 0; i < observers.length; i++) {
            observers[i].onHumanWentUniversity(LocalDate.of(2017,9,1),"Politekh","Computer since",1000);
        }
    }

    private void runHumanWentSchool() {
        for (int i = 0; i < observers.length; i++) {
            observers[i].onHumanWentSchool(LocalDate.of(2006,9,1),147,'A');
        }
    }
    private void runHumanWentKindergarten() {
        for (int i = 0; i < observers.length; i++) {
            observers[i].onWentToKindergarten(LocalDate.of(2002,9,1),3, "Nataliya Ivanovna");
        }
        
    }

    private void runHumanBirth() {
        for (int i = 0; i < observers.length; i++) {
            observers[i].onBirth(LocalDate.of(2000,6,4),true,"Vasia", 3.2f,52);
        }
    }

}

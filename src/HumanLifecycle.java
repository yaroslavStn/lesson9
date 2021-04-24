import java.time.LocalDate;

public class HumanLifecycle {

    private IHumanLifecycleObserver[] observers;

    public HumanLifecycle(IHumanLifecycleObserver[] observers) {
        this.observers = observers;
    }

    public void runLifecycle() {
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
        for (IHumanLifecycleObserver observer : observers) {
            observer.onHumanRetired(new IHumanLifecycleObserver.onHumanRetiredParam(LocalDate.of(2065, 2, 21), "TeamLead", 6000.0, 300.0));
        }

    }

    private void runHumanGotJob() {
        for (IHumanLifecycleObserver observer : observers) {
            observer.onHumanGotJob(new IHumanLifecycleObserver.onHumanGotJobParam(LocalDate.of(2022, 12, 1), "taine", 350));
        }

    }

    private void runHumanDied() {
        for (IHumanLifecycleObserver observer : observers) {
            observer.onHumanDied(new IHumanLifecycleObserver.onHumanDiedParam(LocalDate.of(2082, 7, 21), false, "Somali"));
        }

    }

    private void runHumanCreateChild() {

        for (IHumanLifecycleObserver observer : observers) {
            observer.onHumanCreateChild(new IHumanLifecycleObserver.onHumanCreateChildParam(LocalDate.of(2032, 12, 2), true, "Svyatopolk", 3.1f, 50));
        }
    }

    private void runHumanMadeFamily() {
        for (IHumanLifecycleObserver observer : observers)
            observer.onHumanMadeFamily(new IHumanLifecycleObserver.onHumanMadeFamilyParam(LocalDate.of(2031, 6, 4), "Anna", 36));
    }

    private void runHumanWentUniversity() {
        for (IHumanLifecycleObserver observer : observers) {
            observer.onHumanWentUniversity(new IHumanLifecycleObserver.onHumanWentUniversityParam(LocalDate.of(2017, 9, 1), "Politekh", "Computer since", 1000));
        }
    }

    private void runHumanWentSchool() {
        for (IHumanLifecycleObserver observer : observers) {
            observer.onHumanWentSchool(new IHumanLifecycleObserver.onHumanWentSchoolParam(LocalDate.of(2006, 9, 1), 147, 'A'));
        }
    }

    private void runHumanWentKindergarten() {
        for (IHumanLifecycleObserver observer : observers) {
            observer.onWentToKindergarten(new IHumanLifecycleObserver.onWentToKindergartenParam(LocalDate.of(2002, 9, 1), 3, "Nataliya Ivanovna"));
        }
    }

    private void runHumanBirth() {
        for (IHumanLifecycleObserver observer : observers) {
            observer.onBirth(new IHumanLifecycleObserver.onBirthParam(LocalDate.of(2000, 6, 4), true, "Vasia", 3.2f, 52));
        }
    }

}

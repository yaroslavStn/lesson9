import java.time.LocalDate;

public interface IHumanLifecycleObserver {

    void onBirth(LocalDate date,boolean gender, String name, float weight, int height);
    void onWentToKindergarten(LocalDate date, int groupNum, String teacherName);
    void onHumanWentSchool (LocalDate date, int schoolNum, char course);
    void onHumanWentUniversity(LocalDate date, String universityName, String faculty, int rating);
    void onHumanGotJob(LocalDate date,  String position, double salary);
    void onHumanMadeFamily(LocalDate date, String spouseName, int spouseAge);
    void onHumanCreateChild(LocalDate date,boolean gender, String name, float weight, int height);
    void onHumanRetired(LocalDate date, String position, double lastSalary, double benefit);
    void onHumanDied(LocalDate date, boolean natural, String locate);

}

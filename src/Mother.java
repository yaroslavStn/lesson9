import java.time.LocalDate;

public class Mother implements IHumanLifecycleObserver {

    private String role = "мама: ";


    @Override
    public void onBirth(LocalDate date, boolean gender, String name, float weight, int height) {
        System.out.println(
                role +
                        date.toString()
                        + " У меня родился "
                        + (gender ? "мальчик" : "девочка")
                        + " с весом "
                        + String.format("%.1f, кг", weight)
                        + " ростом "
                        + height
                        + " cm, я назвала его"
                        + name
        );
    }

    @Override
    public void onWentToKindergarten(LocalDate date, int groupNum, String teacherName) {
        System.out.println(
                role +
                        date.toString()
                        + " я отдала его в "
                        + groupNum
                        + " группу местного садика, его воспитателя звали"
                        + teacherName
        );

    }

    @Override
    public void onHumanWentSchool(LocalDate date, int schoolNum, char course) {
        System.out.println(
                role +
                        date.toString()
                        + " он пошел в "
                        + schoolNum
                        + " школу, в 1-"
                        + course
                        + " класс."
        );

    }

    @Override
    public void onHumanWentUniversity(LocalDate date, String universityName, String faculty, int rating) {
        System.out.println(
                role +
                        date.toString()
                        + " он с отличием окончил школу и поступил в "
                        + universityName
                        + " на факультет: "
                        + faculty
                        + "с прохожным баллом "
                        + rating
        );
    }

    @Override
    public void onHumanGotJob(LocalDate date, String position, double salary) {
        System.out.println(
                role +
                        date.toString()
                        + "устроился на работу "
                        + position
                        + " поначалу ему платили немного, всего"
                        + salary
                        + "у.е."
        );

    }

    @Override
    public void onHumanMadeFamily(LocalDate date, String spouseName, int spouseAge) {
        System.out.println(
                role +
                        date.toString()
                        + " мой ребенок создал семью с"
                        + spouseName
                        + "ей на тот момент было"
                        + spouseAge
                        + "лет."
        );
    }

    @Override
    public void onHumanCreateChild(LocalDate date, boolean gender, String name, float weight, int height) {
        System.out.println(
                role +
                        date.toString()
                        + " у них появился ребенок, "
                        +  (gender ? "мальчик" : "девочка")
                        + " по имени"
                        + name
        );
    }


    @Override
    public void onHumanRetired(LocalDate date, String position, double lastSalary, double benefit) {

    }

    @Override
    public void onHumanDied(LocalDate date, boolean natural, String locate) {

    }
}

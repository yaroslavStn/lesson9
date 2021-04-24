import java.time.LocalDate;

public class Mother implements IHumanLifecycleObserver {

    private String role = "мама: ";


    @Override
    public void onBirth(onBirthParam birthParam) {
        System.out.println(
                role +
                        birthParam.date.toString()
                        + " У меня родился "
                        + (birthParam.gender ? "мальчик" : "девочка")
                        + " с весом "
                        + String.format("%.1f, кг", birthParam.weight)
                        + " ростом "
                        + birthParam.height
                        + " cm, я назвала его"
                        + birthParam.name
        );
    }

    @Override
    public void onWentToKindergarten(onWentToKindergartenParam wentToKindergartenParam) {
        System.out.println(
                role +
                       wentToKindergartenParam.date.toString()
                        + " я отдала его в "
                        + wentToKindergartenParam.groupNum
                        + " группу местного садика, его воспитателя звали"
                        + wentToKindergartenParam.teacherName
        );

    }

    @Override
    public void onHumanWentSchool(onHumanWentSchoolParam wentSchoolParam) {
        System.out.println(
                role +
                        wentSchoolParam.date.toString()
                        + " он пошел в "
                        + wentSchoolParam.schoolNum
                        + " школу, в 1-"
                        + wentSchoolParam.course
                        + " класс."
        );

    }

    @Override
    public void onHumanWentUniversity(onHumanWentUniversityParam wentUniversityParam) {
        System.out.println(
                role +
                        wentUniversityParam.date.toString()
                        + " он с отличием окончил школу и поступил в "
                        + wentUniversityParam.universityName
                        + " на факультет: "
                        + wentUniversityParam.faculty
                        + "с прохожным баллом "
                        + wentUniversityParam.rating
        );
    }

    @Override
    public void onHumanGotJob(onHumanGotJobParam gotJobParam) {
        System.out.println(
                role +
                        gotJobParam.date.toString()
                        + "устроился на работу "
                        + gotJobParam.position
                        + " поначалу ему платили немного, всего"
                        + gotJobParam.salary
                        + "у.е."
        );

    }

    @Override
    public void onHumanMadeFamily(onHumanMadeFamilyParam familyParam) {
        System.out.println(
                role +
                        familyParam.date.toString()
                        + " мой ребенок создал семью с"
                        + familyParam.spouseName
                        + "ей на тот момент было"
                        + familyParam.spouseAge
                        + "лет."
        );
    }

    @Override
    public void onHumanCreateChild(onHumanCreateChildParam createChildParam) {
        System.out.println(
                role +
                       createChildParam.date.toString()
                        + " у них появился ребенок, "
                        +  (createChildParam.gender ? "мальчик" : "девочка")
                        + " по имени"
                        + createChildParam.name
        );
    }


    @Override
    public void onHumanRetired(onHumanRetiredParam retiredParam) {

    }

    @Override
    public void onHumanDied(onHumanDiedParam diedParam) {

    }
}

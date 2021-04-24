import java.time.LocalDate;

public class BestFriend implements IHumanLifecycleObserver {
    private String role = "Best friend: ";


    @Override
    public void onBirth(onBirthParam birthParam) {
        System.out.println(
                role +
                        " мой друг "
                        + birthParam.name
                        + " родился "
                        + birthParam.date.toString()
                        + (birthParam.gender ? ", он отличный парень" : ", она классная девченка")
        );
    }

    @Override
    public void onWentToKindergarten(onWentToKindergartenParam wentToKindergartenParam) {

    }


    @Override
    public void onHumanWentSchool(onHumanWentSchoolParam schoolParam) {
        System.out.println(
                role +
                        schoolParam.date
                        + " мы вместе пошли в первый класс "
                        + schoolParam.schoolNum
                        + " школу, в нашем дворе."

        );

    }

    @Override
    public void onHumanWentUniversity(onHumanWentUniversityParam universityParam) {
        System.out.println(
                role +
                        " мы решили поступить в "
                        + universityParam.universityName
                        + " на факультет "
                        + universityParam.faculty
        );
    }

    @Override
    public void onHumanGotJob(onHumanGotJobParam jobParam) {
        System.out.println(
                role +
                        "в "
                        + jobParam.date.getYear()
                        + " году устроился на работу на позицию "
                        + jobParam.position
                        + " с зарплатой "
                        + jobParam.salary
                        + "у.е."
        );

    }

    @Override
    public void onHumanMadeFamily(onHumanMadeFamilyParam familyParam) {
        System.out.println(
                role
                        + " я был свидетелем на свадьбе с "
                        + familyParam.spouseName
                        + " "
                        + familyParam.spouseAge
                        + "лет, свадьба состоялась "
                        + familyParam.date.toString()
        );
    }

    @Override
    public void onHumanCreateChild(onHumanCreateChildParam childParam) {
        System.out.println(
                role +
                        childParam.date.toString()
                        + " родился "
                        + (childParam.gender ? "мальчик" : "девочка")
                        + " его назвали "
                        + childParam.name
                        + (childParam.gender ? " он " : " она ")
                        + "родился здоровым: "
                        + String.format("%.1f кг, ", childParam.weight)
                        + childParam.height
                        + "см."
        );
    }


    @Override
    public void onHumanRetired(onHumanRetiredParam retiredParam) {
        System.out.println(
                role +
                        "Карьера была весьма успеышной, к пенсии удалось дослужится до"
                        + retiredParam.position
                        + " с зп "
                        + retiredParam.lastSalary
                        + " у.е.. Карьера завершилась в "
                        + retiredParam.date.getYear()
        );

    }

    @Override
    public void onHumanDied(onHumanDiedParam diedParam) {
        System.out.println(
                role +
                        "В "
                        + diedParam.date.getYear()
                        + (diedParam.natural ? " скоропостижно скончался в " : " был коварно убит в ")
                        + diedParam.locate
        );

    }
}

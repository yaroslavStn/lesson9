import java.time.LocalDate;

public class BestFriend implements IHumanLifecycleObserver {
    private String role = "Best friend: ";


    @Override
    public void onBirth(LocalDate date, boolean gender, String name, float weight, int height) {
        System.out.println(
                role +
                        " мой друг "
                        + name
                        + " родился "
                        + date.toString()
                        + (gender ? ", он отличный парень" : ", она классная девченка")
        );
    }

    @Override
    public void onWentToKindergarten(LocalDate date, int groupNum, String teacherName) {

    }

    @Override
    public void onHumanWentSchool(LocalDate date, int schoolNum, char course) {
        System.out.println(
                role +
                        date
                        + " мы вместе пошли в первый класс "
                        + schoolNum
                        + " школу, в нашем дворе."

        );

    }

    @Override
    public void onHumanWentUniversity(LocalDate date, String universityName, String faculty, int rating) {
        System.out.println(
                role +
                        " мы решили поступить в "
                        + universityName
                        + " на факультет "
                        + faculty
        );
    }

    @Override
    public void onHumanGotJob(LocalDate date, String position, double salary) {
        System.out.println(
                role +
                        "в "
                        + date.getYear()
                        + " году устроился на работу на позицию "
                        + position
                        + " с зарплатой "
                        + salary
                        + "у.е."
        );

    }

    @Override
    public void onHumanMadeFamily(LocalDate date, String spouseName, int spouseAge) {
        System.out.println(
                role
                        + " я был свидетелем на свадьбе с "
                        + spouseName
                        + " "
                        + spouseAge
                        + "лет, свадьба состоялась "
                        + date.toString()
        );
    }

    @Override
    public void onHumanCreateChild(LocalDate date, boolean gender, String name, float weight, int height) {
        System.out.println(
                role +
                        date.toString()
                        + " родился "
                        + (gender ? "мальчик" : "девочка")
                        + " его назвали "
                        + name
                        + (gender ? " он " : " она ")
                        + "родился здоровым: "
                        + String.format("%.1f кг, ", weight)
                        + height
                        + "см."
        );
    }


    @Override
    public void onHumanRetired(LocalDate date, String position, double lastSalary, double benefit) {
        System.out.println(
                role +
                        "Карьера была весьма успеышной, к пенсии удалось дослужится до"
                        + position
                        + " с зп "
                        + lastSalary
                        + " у.е.. Карьера завершилась в "
                        + date.getYear()
        );

    }

    @Override
    public void onHumanDied(LocalDate date, boolean natural, String locate) {
        System.out.println(
                role +
                        "В "
                        + date.getYear()
                        + (natural ? " скоропостижно скончался в " : " был коварно убит в ")
                        + locate
        );

    }
}

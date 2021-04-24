import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Main.run();

    }

    private static void run() {

        IHumanLifecycleObserver mama = new IHumanLifecycleObserver() {
            private String role = "мама: ";


            @Override
            public void onBirth(onBirthParam birthParam) {
                System.out.println(
                        role +
                                birthParam.date.toString()
                                + " У меня родился "
                                + (birthParam.gender ? "мальчик" : "девочка")
                                + " с весом "
                                + String.format("%.1f, кг",birthParam.weight)
                                + " ростом "
                                + birthParam.height
                                + " cm, я назвала его"
                                + birthParam.name
                );
            }

            @Override
            public void onWentToKindergarten(onWentToKindergartenParam kindergartenParam) {
                System.out.println(
                        role +
                                kindergartenParam.date.toString()
                                + " я отдала его в "
                                + kindergartenParam.groupNum
                                + " группу местного садика, его воспитателя звали"
                                + kindergartenParam.teacherName
                );

            }

            @Override
            public void onHumanWentSchool(onHumanWentSchoolParam schoolParam) {
                System.out.println(
                        role +
                                schoolParam.date.toString()
                                + " он пошел в "
                                + schoolParam.schoolNum
                                + " школу, в 1-"
                                + schoolParam.course
                                + " класс."
                );

            }

            @Override
            public void onHumanWentUniversity(onHumanWentUniversityParam universityParam) {
                System.out.println(
                        role +
                                universityParam.date.toString()
                                + " он с отличием окончил школу и поступил в "
                                + universityParam.universityName
                                + " на факультет: "
                                +universityParam.faculty
                                + "с прохожным баллом "
                                + universityParam.rating
                );
            }

            @Override
            public void onHumanGotJob(onHumanGotJobParam jobParam) {
                System.out.println(
                        role +
                                jobParam.date.toString()
                                + "устроился на работу "
                                +jobParam.position
                                + " поначалу ему платили немного, всего"
                                + jobParam.salary
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
                                + (createChildParam.gender ? "мальчик" : "девочка")
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


        };

        IHumanLifecycleObserver friend = new IHumanLifecycleObserver() {
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
            public void onHumanMadeFamily(onHumanMadeFamilyParam madeFamilyParam) {
                System.out.println(
                        role
                                + " я был свидетелем на свадьбе с "
                                + madeFamilyParam.spouseName
                                + " "
                                + madeFamilyParam.spouseAge
                                + "лет, свадьба состоялась "
                                + madeFamilyParam.date.toString()
                );
            }

            @Override
            public void onHumanCreateChild(onHumanCreateChildParam createChildParam) {
                System.out.println(
                        role +
                                createChildParam.date.toString()
                                + " родился "
                                + (createChildParam.gender ? "мальчик" : "девочка")
                                + " его назвали "
                                + createChildParam.name
                                + (createChildParam.gender ? " он " : " она ")
                                + "родился здоровым: "
                                + String.format("%.1f кг, ", createChildParam.weight)
                                + createChildParam.height
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

        };

        IHumanLifecycleObserver[] observers = new IHumanLifecycleObserver[]{
                mama,
                friend
        };
        HumanLifecycle lifecycle = new HumanLifecycle(observers);
        lifecycle.runLifecycle();

    }
}

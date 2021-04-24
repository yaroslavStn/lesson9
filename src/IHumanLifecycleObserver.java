import java.time.LocalDate;

public interface IHumanLifecycleObserver {

    void onBirth(onBirthParam birthParam);

    void onWentToKindergarten(onWentToKindergartenParam wentToKindergartenParam);

    void onHumanWentSchool(onHumanWentSchoolParam wentSchoolParam);

    void onHumanWentUniversity(onHumanWentUniversityParam wentUniversityParam);

    void onHumanGotJob(onHumanGotJobParam gotJobParam);

    void onHumanMadeFamily(onHumanMadeFamilyParam madeFamilyParam);

    void onHumanCreateChild(onHumanCreateChildParam createChildParam);

    void onHumanRetired(onHumanRetiredParam retiredParam);

    void onHumanDied(onHumanDiedParam diedParam);

    class onBirthParam {
        LocalDate date;
        boolean gender;
        String name;
        float weight;
        int height;

        public onBirthParam(LocalDate date, boolean gender, String name, float weight, int height) {
            this.date = date;
            this.gender = gender;
            this.name = name;
            this.weight = weight;
            this.height = height;
        }
    }

    class onHumanWentUniversityParam {
        LocalDate date;
        String universityName;
        String faculty;
        int rating;

        public onHumanWentUniversityParam(LocalDate date, String universityName, String faculty, int rating) {
            this.date = date;
            this.universityName = universityName;
            this.faculty = faculty;
            this.rating = rating;
        }
    }

    class onHumanGotJobParam {
        LocalDate date;
        String position;
        double salary;

        public onHumanGotJobParam(LocalDate date, String position, double salary) {
            this.date = date;
            this.position = position;
            this.salary = salary;
        }
    }

    class onHumanMadeFamilyParam {
        LocalDate date;
        String spouseName;
        int spouseAge;

        public onHumanMadeFamilyParam(LocalDate date, String spouseName, int spouseAge) {
            this.date = date;
            this.spouseName = spouseName;
            this.spouseAge = spouseAge;
        }
    }

    class onHumanCreateChildParam {
        LocalDate date;
        boolean gender;
        String name;
        float weight;
        int height;

        public onHumanCreateChildParam(LocalDate date, boolean gender, String name, float weight, int height) {
            this.date = date;
            this.gender = gender;
            this.name = name;
            this.weight = weight;
            this.height = height;
        }
    }

    class onHumanRetiredParam {
        LocalDate date;
        String position;
        double lastSalary;
        double benefit;

        public onHumanRetiredParam(LocalDate date, String position, double lastSalary, double benefit) {
            this.date = date;
            this.position = position;
            this.lastSalary = lastSalary;
            this.benefit = benefit;
        }
    }

    class onHumanDiedParam {
        LocalDate date;
        boolean natural;
        String locate;

        public onHumanDiedParam(LocalDate date, boolean natural, String locate) {
            this.date = date;
            this.natural = natural;
            this.locate = locate;
        }
    }

    class onWentToKindergartenParam {
        LocalDate date;
        int groupNum;
        String teacherName;

        public onWentToKindergartenParam(LocalDate date, int groupNum, String teacherName) {
            this.date = date;
            this.groupNum = groupNum;
            this.teacherName = teacherName;
        }
    }

    class onHumanWentSchoolParam {
        LocalDate date;
        int schoolNum;
        char course;

        public onHumanWentSchoolParam(LocalDate date, int schoolNum, char course) {
            this.date = date;
            this.schoolNum = schoolNum;
            this.course = course;
        }
    }

}

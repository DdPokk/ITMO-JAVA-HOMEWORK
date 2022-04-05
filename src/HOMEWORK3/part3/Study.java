package HOMEWORK3.part3;

class Study {
    private String course;

    public Study(String course) {
        this.course = course;
    }

    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }

    public String printCourse() {return this.course;}
}

class Test {
    public static void main(String[] args) {
        Study test = new Study("Изучение Java это просто!");
        System.out.println(test.printCourse());
    }
}


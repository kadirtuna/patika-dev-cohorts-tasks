public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    double oralNote;
    double oralWeight; // e.g. 0.20 means oral is 20% of final grade

    public Course(String name, String code, String prefix, double oralWeight) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.oralNote = 0;
        this.oralWeight = oralWeight;
    }

    public double getFinalNote() {
        return (oralNote * oralWeight) + (note * (1 - oralWeight));
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("Islem basarili.");
        } else {
            System.out.println(t.name + " akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null)
            System.out.println(this.name + " dersinin akademisyeni: " + courseTeacher.name);
        else
            System.out.println(this.name + " dersine akademisyen atanmamistir.");
    }
}

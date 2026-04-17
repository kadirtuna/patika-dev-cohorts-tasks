public class Student {
    String name, stuNo;
    int classes;
    Course mat, fizik, kimya;
    double average;
    boolean isPass;

    public Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.isPass = false;
    }

    public void addBulkExamNote(int mat, int fizik, int kimya) {
        if (mat >= 0 && mat <= 100) this.mat.note = mat;
        if (fizik >= 0 && fizik <= 100) this.fizik.note = fizik;
        if (kimya >= 0 && kimya <= 100) this.kimya.note = kimya;
    }

    public void addBulkOralNote(int mat, int fizik, int kimya) {
        this.mat.oralNote = mat;
        this.fizik.oralNote = fizik;
        this.kimya.oralNote = kimya;
    }

    public void calcAverage() {
        this.average = (mat.getFinalNote() + fizik.getFinalNote() + kimya.getFinalNote()) / 3;
    }

    public void isPass() {
        if (mat.note == 0 || fizik.note == 0 || kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemis.");
            return;
        }
        calcAverage();
        this.isPass = this.average > 55;
        printNote();
        System.out.println("Ortalama: " + this.average);
        System.out.println(this.isPass ? "Sinifi Gecti." : "Sinifta Kaldi.");
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Ogrenci: " + this.name);
        System.out.println("Matematik Notu: " + mat.getFinalNote());
        System.out.println("Fizik Notu: " + fizik.getFinalNote());
        System.out.println("Kimya Notu: " + kimya.getFinalNote());
    }
}

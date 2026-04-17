public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (salary < 1000) return 0;
        return salary * 0.03;
    }

    public double bonus() {
        if (workHours > 40) return (workHours - 40) * 30;
        return 0;
    }

    public double raiseSalary() {
        int currentYear = 2021;
        int yearsWorked = currentYear - hireYear;
        if (yearsWorked < 10) return salary * 0.05;
        else if (yearsWorked < 20) return salary * 0.10;
        else return salary * 0.15;
    }

    @Override
    public String toString() {
        double raise = raiseSalary();
        double taxAmount = tax();
        double bonusAmount = bonus();
        double salaryWithAdjustments = salary - taxAmount + bonusAmount;
        double totalSalary = salaryWithAdjustments + raise;

        return "Adi: " + name + "\n" +
               "Maasi: " + salary + "\n" +
               "Calisma Saati: " + workHours + "\n" +
               "Baslangic Yili: " + hireYear + "\n" +
               "Vergi: " + taxAmount + "\n" +
               "Bonus: " + bonusAmount + "\n" +
               "Maas Artisi: " + raise + "\n" +
               "Vergi ve Bonuslar ile birlikte maas: " + salaryWithAdjustments + "\n" +
               "Toplam Maas: " + totalSalary;
    }
}

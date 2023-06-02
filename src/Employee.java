class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;
    double taxSalary;
    int bonusSalary;
    double tempSalary;
    int year = 2021;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        if (this.salary >= 1000) {
            this.taxSalary = this.salary * 0.03;
            return this.taxSalary;
        }
        return 0;
    }

    double bonus() {
        if (this.workHours > 40) {

            return (this.workHours - 40) * 30;
        }
        return 0;
    }

    double raiseSalary() {
        if (this.year - this.hireYear < 10) {
            this.tempSalary = this.salary * 0.05;
        } else if (this.year - this.hireYear > 9 && this.year - this.hireYear < 20) {
            this.tempSalary = this.salary * 0.10;
        } else if (this.year - this.hireYear > 19) {
            this.tempSalary = this.salary * 0.15;
        }

        return this.salary += this.tempSalary;
    }


    public String toString() {
        return "Adı : " + this.name + "\nMaaşı : " + this.salary + "\nÇalışma Saati : " + this.workHours +
                "\nBaşlangıç yılı : " + this.hireYear + "\nVergi : " + tax() + "\nBonus : " + bonus() +
                "\nMaaş Artışı : " + raiseSalary() + "\nVergi ve Bonuslar ile birlikte maaş : " + (this.salary + bonus() - tax()) +
                "\nToplam Maaş : " + (this.salary + raiseSalary());
    }
}
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int size = 10;
        Employee[] worker = new Employee[10];

        worker[0] = new Employee("Ivan", "Petrovich", "Calamstin", 3, 3568f);
        worker[1] = new Employee("Iva", "Petrovich", "Colvi", 3, 8960f);
        worker[2] = new Employee("Nina", "Petrovich", "Recartin", 2, 7640f);
        worker[3] = new Employee("Igor", "Petrovich", "Restart", 1, 8890f);
        worker[4] = new Employee("Svetlana", "Petrovich", "Maliko", 5, 6798f);
        worker[5] = new Employee("Maria", "Petrovich", "Neelova", 5, 7754f);
        worker[6] = new Employee("Oleg", "Petrovich", "Xoftin", 5, 8862f);
        worker[7] = new Employee("Ivan", "Petrovich", "Zernov", 1, 5120f);
        worker[8] = new Employee("Irvud", "Petrovich", "Nemo", 3, 4586f);
        worker[9] = new Employee("Stas", "Petrovich", "Mordred", 3, 7652f);

        int numberDepartment = 3;
        float randomSalary = 6500f;
        int procent = 10;
        int lenEmployee = worker.length;

        makeListEmployee(worker, lenEmployee);
        float sumSalary = calculateSumSalary(worker, lenEmployee);
        System.out.println("sum = " + sumSalary);
        findMaxSalary(worker, lenEmployee);
        findMinSalary(worker, lenEmployee);
        calculateAvgSalary(sumSalary, lenEmployee);
        getListFio(worker, lenEmployee);
        indexingSalary(worker, lenEmployee, procent);
        calcSixMethodsDepartment(worker, lenEmployee, numberDepartment);
        getSalaryLess(worker, lenEmployee, randomSalary);
        getSalaryMore(worker, lenEmployee, randomSalary);
    }

    public static void makeListEmployee (Employee[] worker, int len) {
        for (int i = 0; i < len; i++) {
            System.out.print(worker[i].getId() + "  ");
            System.out.println(worker[i]);
        }
    }

    public static void getSalaryLess(Employee[] worker, int lenEmployee, float randomSalary) {
        for (int i = 0; i < lenEmployee; i++) {
            if (worker[i].getSalary() < randomSalary) {
                System.out.print(worker[i].getId() + "  ");
                System.out.println(worker[i]);
            }
        }
    }

    public static void getSalaryMore(Employee[] worker, int lenEmployee, float randomSalary) {
        for (int i = 0; i < lenEmployee; i++) {
            if (worker[i].getSalary() > randomSalary) {
                System.out.print(worker[i].getId() + "  ");
                System.out.println(worker[i]);
            }
        }
    }

    public static float calculateSumSalary(Employee[] worker, int len) {
        float sum = 0f;
        for (int k = 0; k < len; k++){
            sum += worker[k].getSalary();
        }
        return sum;
    }

    public static void findMinSalary(Employee[] worker, int len) {
        float min = worker[0].getSalary();
        for (int k = 1; k < len; k++){
            if (min > worker[k].getSalary()) {
                min = worker[k].getSalary();
            }
        }
        System.out.println("min = " + min);
    }

    public static void findMaxSalary(Employee[] worker, int len) {
        float max = worker[0].getSalary();
        for (int k = 1; k < len; k++){
            if (max < worker[k].getSalary()) {
                max = worker[k].getSalary();
            }
        }
        System.out.println("max = " + max);
    }

    public static void calculateAvgSalary(float s, int l) {
        float avgSalary = s / l;
        System.out.println("avgSalary = " + avgSalary);
    }

    public static void getListFio(Employee[] worker, int len) {
        for (int i = 0; i < len; i++) {
            System.out.println((i + 1) + "  " + worker[i].getName() + ' ' +
                    worker[i].getSurname() + ' ' + worker[i].getLastName());
        }
    }
    public static void getListFioDepartment(Employee[] worker, int len, int numberDepartment) {
        for (int i = 0; i < len; i++) {
            if (worker[i].getDepartment() == numberDepartment) {
                System.out.println((i + 1) + "  " + worker[i].getName() + ' ' +
                        worker[i].getSurname() + ' ' + worker[i].getLastName() +
                        " salary = " + worker[i].getSalary());
            }
        }
    }

    public static void indexingSalary(Employee[] worker, int len, int procent) {
        for (int i = 0; i < len; i++) {
            float newSalary = worker[i].getSalary() + worker[i].getSalary() * procent / 100;
            worker[i].setSalary(newSalary);
            System.out.println("worker[" + (i + 1) + "] = " + worker[i]);
        }
    }

    public static void calcSixMethodsDepartment(Employee[] worker, int len, int numberDepartment) {
        Employee[] filtrWorker = new Employee[10];
        int k = 0;
        for (int i = 0; i < len; i++) {
            if (worker[i].getDepartment() == numberDepartment) {
                filtrWorker[k] = worker[i];
                k += 1;
            }
        }
        int procent = 5;
        len = k;
        makeListEmployee(filtrWorker, len);
        float sumSalary = calculateSumSalary(filtrWorker, len);
        System.out.println("sum = " + sumSalary);
        findMaxSalary(filtrWorker, len);
        findMinSalary(filtrWorker, len);
        calculateAvgSalary(sumSalary, len);
        getListFioDepartment(filtrWorker, len, numberDepartment);
        indexingSalary(filtrWorker, len, procent);
    }
}
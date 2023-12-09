// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int size = 10;
        Employee[] worker = new Employee[10];

        worker[0] = new Employee("Ivan", "Petrovich", "Calamstin", 3, 3568);
        worker[1] = new Employee("Iva", "Petrovich", "Colvi", 3, 8960);
        worker[2] = new Employee("Nina", "Petrovich", "Recartin", 2, 7640);
        worker[3] = new Employee("Igor", "Petrovich", "Restart", 1, 8890);
        worker[4] = new Employee("Svetlana", "Petrovich", "Maliko", 5, 6798);
        worker[5] = new Employee("Maria", "Petrovich", "Neelova", 5, 7754);
        worker[6] = new Employee("Oleg", "Petrovich", "Xoftin", 5, 8862);
        worker[7] = new Employee("Ivan", "Petrovich", "Zernov", 1, 5120);
        worker[8] = new Employee("Irvud", "Petrovich", "Nemo", 3, 4586);
        worker[9] = new Employee("Stas", "Petrovich", "Mordred", 3, 7652);

        int lenEmployee = worker.length;
        makeListEmployee(worker, lenEmployee);
        int sumSalary = calculateSumSalary(worker, lenEmployee);
        System.out.println("sum = " + sumSalary);
        findMaxSalary(worker, lenEmployee);
        findMinSalary(worker, lenEmployee);
        calculateAvgSalary(sumSalary, lenEmployee);
        getListFio(worker, lenEmployee);
    }

    public static void makeListEmployee (Employee[] worker, int len) {
        for (int i = 0; i < len; i++) {
            System.out.print(worker[i].getId() + "  ");
            System.out.println(worker[i]);
        }
    }

    public static int calculateSumSalary(Employee[] worker, int len) {
        int sum = 0;
        for (int k = 0; k < len; k++){
            sum += worker[k].getSalary();
        }
        return sum;
    }

    public static void findMinSalary(Employee[] worker, int len) {
        int min = worker[0].getSalary();
        for (int k = 1; k < len; k++){
            if (min > worker[k].getSalary()) {
                min = worker[k].getSalary();
            }
        }
        System.out.println("min = " + min);
    }

    public static void findMaxSalary(Employee[] worker, int len) {
        int max = worker[0].getSalary();
        for (int k = 1; k < len; k++){
            if (max < worker[k].getSalary()) {
                max = worker[k].getSalary();
            }
        }
        System.out.println("max = " + max);
    }

    public static void calculateAvgSalary(int s, int l) {
        float avgSalary = s / l;
        System.out.println("avgSalary = " + avgSalary);
    }

    public static void getListFio(Employee[] worker, int len) {
        for (int i = 0; i < len; i++) {
            System.out.println((i + 1) + "  " + worker[i].getName() + ' ' +
                    worker[i].getSurname() + ' ' + worker[i].getLastName());
        }

    }
}
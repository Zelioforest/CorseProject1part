// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static Employee[] worker = new Employee[10];


    public static void main(String[] args) {

        worker[0] = new Employee("Ivan", "Petrovich", "Calamstin", 3, 3568f);
        worker[1] = new Employee("Iva", "Petrovich", "Colvi", 3, 8660f);
        worker[2] = new Employee("Nina", "Petrovich", "Recartin", 2, 7640f);
        worker[3] = new Employee("Igor", "Petrovich", "Restart", 1, 8890f);
        worker[4] = new Employee("Svetlana", "Petrovich", "Maliko", 5, 6798f);
        worker[5] = new Employee("Maria", "Petrovich", "Neelova", 5, 7754f);
        worker[6] = new Employee("Oleg", "Petrovich", "Xoftin", 5, 8862f);
        worker[7] = new Employee("Ivan", "Petrovich", "Zernov", 1, 5120f);
        worker[8] = new Employee("Irvud", "Petrovich", "Nemo", 3, 4586f);
        worker[9] = new Employee("Stas", "Petrovich", "Mordred", 3, 7652f);


        float randomSalary = 6500f;
        int procent = 10;
        int lenEmployee = worker.length;

        makeListEmployee();
        System.out.println("sum = " + calculateSumSalary());
        findMaxSalary();
        findMinSalary();
        calculateAvgSalary();
        indexingSalary(procent);
        getListFio();

        int numberDepartment = 3;
        System.out.println("sum = " + calculateSumSalary(numberDepartment));
        findMinSalary(numberDepartment);
        findMaxSalary(numberDepartment);
        calculateAvgSalary(numberDepartment);
        indexingSalary(numberDepartment, procent);
        getListFio(numberDepartment);

//        calcSixMethodsDepartment(worker, lenEmployee, numberDepartment);
//        getSalaryLess(worker, lenEmployee, randomSalary);
//        getSalaryMore(worker, lenEmployee, randomSalary);
    }

    public static void makeListEmployee () {
        for (int i = 0; i < worker.length; i++) {
            System.out.print(worker[i].getId() + "  ");
            System.out.println(worker[i]);
        }
    }


    public static float calculateSumSalary() {
        float sum = 0f;
        for (int k = 0; k < worker.length; k++){
            sum += worker[k].getSalary();
        }
        return sum;
    }

    public static float calculateSumSalary(int numberDepartment) {
        float sum = 0f;
        for (int k = 0; k < worker.length; k++){
            if (worker[k].getDepartment() == numberDepartment) {
                sum += worker[k].getSalary();
            }
        }
        return sum;
    }

    public static void findMinSalary() {
        Employee workWithMinSalary = worker[0];
        float min = worker[0].getSalary();
        for (int k = 1; k < worker.length; k++){
            if (min > worker[k].getSalary()) {
                min = worker[k].getSalary();
                workWithMinSalary = worker[k];
            }
        }
        System.out.println(workWithMinSalary);
    }

    public static void findMinSalary(int numberDepartment) {
        Employee workWithMinSalary = worker[0];
        float min = worker[0].getSalary();
        for (int k = 1; k < worker.length; k++){
            if (min > worker[k].getSalary() && worker[k].getDepartment() == numberDepartment) {
                min = worker[k].getSalary();
                workWithMinSalary = worker[k];
            }
        }
        System.out.println(workWithMinSalary);
    }


    public static void findMaxSalary() {
        Employee workWithMaxSalary = worker[0];
        float max = worker[0].getSalary();
        for (int k = 1; k < worker.length; k++){
            if (max < worker[k].getSalary()) {
                max = worker[k].getSalary();
                workWithMaxSalary = worker[k];
            }
        }
        System.out.println(workWithMaxSalary);
    }

    public static void findMaxSalary(int numberDepartment) {
        Employee workWithMaxSalary = worker[0];
        float max = worker[0].getSalary();
        for (int k = 1; k < worker.length; k++){
            if (max < worker[k].getSalary() && worker[k].getDepartment() == numberDepartment) {
                max = worker[k].getSalary();
                workWithMaxSalary = worker[k];
            }
        }
        System.out.println(workWithMaxSalary);
    }

    public static void calculateAvgSalary() {
        float sumSalary = calculateSumSalary();
        float avgSalary = sumSalary / worker.length;
        System.out.println("avgSalary = " + avgSalary);
    }

    public static void calculateAvgSalary(int numberDepartment) {
        float sumSalary = calculateSumSalary(numberDepartment);
        float avgSalary = sumSalary / worker.length;
        System.out.println("avgSalary = " + avgSalary);
    }

    public static void indexingSalary(int procent) {
        for (int i = 0; i < worker.length; i++) {
            float newSalary = worker[i].getSalary() + worker[i].getSalary() * procent / 100;
            worker[i].setSalary(newSalary);
            System.out.println("worker[" + (i + 1) + "] = " + worker[i]);
        }
    }

    public static void indexingSalary(int numberDepartment, int procent) {
        for (int i = 0; i < worker.length; i++) {
            if (worker[i].getDepartment() == numberDepartment) {
                float newSalary = worker[i].getSalary() + worker[i].getSalary() * procent / 100;
                worker[i].setSalary(newSalary);
                System.out.println("worker[" + (i + 1) + "] = " + worker[i]);
            }
        }
    }

    public static void getListFio() {
        for (int i = 0; i < worker.length; i++) {
            System.out.println((i + 1) + "  " + worker[i].getName() + ' ' +
                    worker[i].getSurname() + ' ' + worker[i].getLastName());
        }
    }

    public static void getListFio(int numberDepartment) {
        for (int i = 0; i < worker.length; i++) {
            if (worker[i].getDepartment() == numberDepartment) {
                System.out.println((i + 1) + "  " + worker[i].getName() + ' ' +
                        worker[i].getSurname() + ' ' + worker[i].getLastName());
            }
        }
    }
    public static void getSalaryLess(float randomSalary) {
        for (int i = 0; i < worker.length; i++) {
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
}
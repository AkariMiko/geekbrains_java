package geekbrains.lession_1;

public class lesson_5 {
    public static void main(String[] args) {
        Employee[] employee = {
            new Employee("Zigrett Born", "palladin", "z_klerrick@war.com", 43234, 20, 35),
            new Employee("Tessia Lonbreff", "princess", "tes_princess@war.com", 23525, 25, 19),
            new Employee("Minerva Dortlee", "Priest", "heal@war.com", 12411, 25, 51),
            new Employee("Touka Shigaraki", "Robber", "swift_blade@war.com", 33333, 15, 21),
            new Employee("B'orn Oakshield", "Tank", "100%shield@war.com", 55552, 15, 41),
        };

        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getAge() >= 40){
                System.out.println(employee[i]);
            }
        }
    }
}

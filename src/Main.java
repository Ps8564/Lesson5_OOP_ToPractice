import controller.Controller;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр контроллера, который управляет всеми операциями
        Controller controller = new Controller();

        // Создаем несколько студентов и одного преподавателя
        controller.createStudent("Иванов", "Иван", "Иванович");
        controller.createStudent("Петров", "Петр", "Петрович");
        controller.createTeacher("Сидоров", "Сидор", "Сидорович");

        // Предполагаем, что ID присваиваются последовательно начиная с 1
        // ID преподавателя
        int teacherId = 1;
        // ID студентов
        java.util.List<Integer> studentIds = Arrays.asList(2, 3);

        // Создаем учебную группу с одним преподавателем и двумя студентами
        controller.createStudentGroup(teacherId, studentIds);

        // Отображаем информацию о созданной учебной группе
        controller.printStudentGroup();
    }
}
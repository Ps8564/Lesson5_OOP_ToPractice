package model;

public class Student extends User {
    private final Integer studentId;

    public Student(Integer studentId, String surname, String firstname, String patronymic) {
        super(surname, firstname, patronymic);
        this.studentId=studentId;
    }
    public Integer getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "Student{" + "teacherId=" + studentId + "surname='" + super.getSurname() + '\'' + ", firstname='" + super.getFirstname() + '\'' +
                ", patronymic='" + super.getPatronymic() + '\'' +
                '}';
    }
}

public class UnivetsityTest {
    public static void main(String[] args) {
        University university = new University();

        university.addFaculty("Science and Technology");
        university.addFaculty("Engineering");
        university.addFaculty("Arts and Humanities");

        University.Faculty faculty = university.new Faculty("Computer Science");

        faculty.addDepartament("Software Engineering");
        faculty.addDepartament("Artificial Intelligence");
        faculty.addDepartament("Computer Networks");

        University.Faculty.Department department = faculty.new Department("Operating Systems");

        department.addCourse("Introduction to Operating Systems");
        department.addCourse("Operating Systems: Principles and Practices");
        department.addCourse("Operating Systems: Design and Implementation");

        university.informationFaculty();
        System.out.println("----------------------------------------");
        faculty.informationDepartament();
        System.out.println("----------------------------------------");
        department.informationCouse();



    }
}

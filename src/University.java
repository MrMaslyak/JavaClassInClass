import java.util.ArrayList;
import java.util.List;

public class University {

    private List<Faculty> faculties = new ArrayList<>();

    public void addFaculty(String name) {
        faculties.add(new Faculty(name));
    }

    public void informationFaculty() {
        for (Faculty faculty : faculties) {
            System.out.println("Faculty: " + faculty.getName());
            faculty.informationDepartament();
        }
    }

    public class Faculty {

        private String name;
        private ArrayList<Department> departament = new ArrayList<Department>();

        public Faculty(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void addDepartament(String name) {
            departament.add(new Department(name));
        }

        public void informationDepartament() {
            for (Department departament : departament) {
                System.out.println("Departament: "+departament.getName());
                departament.informationCouse();
            }
        }

        public class Department {

            private String name;
            private ArrayList<String> collectionCouse = new ArrayList<String>();

            public Department(String name) {
                this.name = name;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public void addCourse(String name) {
                collectionCouse.add(name);
            }

            public void informationCouse() {
                for (String couse : collectionCouse) {
                    System.out.println("Course: " + couse);
                }
            }
        }
    }
}

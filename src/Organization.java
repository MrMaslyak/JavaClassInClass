import java.util.ArrayList;

public class Organization {
    ArrayList<Division> divisions = new ArrayList<>();


    Organization() {

    }

    public void addDivision(String name) {
        divisions.add(new Division(name));
    }

    public void informationDivision() {
        for (Division division : divisions) {
            System.out.println("Division: " + division.getName());
            division.informationTeam();
        }
    }

    public class Division {
        String name;
        ArrayList<Team> listCommandTeam = new ArrayList<>();

        public Division(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void addTeam(String name) {
            listCommandTeam.add(new Team(name));
        }

        public void informationTeam() {
            for (Team team : listCommandTeam) {
                System.out.println("Team: " + team.getName());
            }
        }

        public class Team {
            String name;
            ArrayList<Project> projectsList = new ArrayList<>();

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public Team(String name) {
                this.name = name;
            }

            public void addProject(String name) {
                projectsList.add(new Project(name));
            }

            public void informationProject() {
                for (Project project : projectsList) {
                    System.out.println("Project: " + project.getName());
                }
            }


            public class Project {

                String name;

                public Project(String name) {
                    this.name = name;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }


            }
        }
    }
}

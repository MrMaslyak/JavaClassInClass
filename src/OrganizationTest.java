public class OrganizationTest {

    public static void main(String[] args) {

        Organization org = new Organization();
        org.addDivision("OrgDivision");
        org.addDivision("OrgDivision2");
        org.addDivision("OrgDivision3");
        org.informationDivision();
        System.out.println("------------------------------------------");

        Organization.Division div = org.new Division("DivisionName");
        div.addTeam("Team1");
        div.addTeam("Team2");
        div.addTeam("Team3");
        div.informationTeam();
        System.out.println("------------------------------------------");

        Organization.Division.Team team = div.new Team("TeamName");
        team.addProject("Project1");
        team.addProject("Project2");
        team.addProject("Project3");
        team.informationProject();
        System.out.println("------------------------------------------");

    }
}

package cv03;

import java.util.Arrays;

public class TeamLeaderNededi {
    private Employee[] teamMembers  ;
    private int numOfTeamMembers;
    Employee employee;

    public TeamLeaderNededi(String name, String surname, int maxNumOfTeamMembers) {
//        super(name, surname, "ja to tady ridim");
        employee = new Employee(name,surname, "ja to tady ridim");
        teamMembers = new Employee[maxNumOfTeamMembers];
        numOfTeamMembers = 0;
    }

    public Boolean addTeamMember(Employee employee){
        if(employee == null) return false;
        if(teamMembers.length <= numOfTeamMembers) return false;
        teamMembers[numOfTeamMembers++] = employee;
//        numOfTeamMembers++; to ++mam o radek nahoru
        return true;
    }

    public static TeamLeaderNededi getNewTeamLeader (String name, String surname, String maxNumOfTeamMembersStr){
        return new TeamLeaderNededi(name, surname, Integer.parseInt(maxNumOfTeamMembersStr));
    }

//    @Override
    public String getJobDescription() {
        StringBuilder sb = new StringBuilder();
        sb.append(employee.getJobDescription());
        sb.append("\nVedu tyto lidi");
        for(int i = 0; i < numOfTeamMembers; i++){
            sb.append("\n" + teamMembers[i].toString());
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return "Jsem "+ employee.getName() + " " + employee.getSurname() +", " + getJobDescription();
    }
}

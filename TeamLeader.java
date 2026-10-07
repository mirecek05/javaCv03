package cv03;

public class TeamLeader extends Employee{
    private Employee[] teamMembers  ;
    private int numOfTeamMembers;

    public TeamLeader(String name, String surname, int maxNumOfTeamMembers) {
        super(name, surname, "ja to tady ridim");
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

    public static TeamLeader  getNewTeamLeader (String name, String surname, String maxNumOfTeamMembersStr){
        return new TeamLeader(name, surname, Integer.parseInt(maxNumOfTeamMembersStr));
    }

    @Override
    public String getJobDescription() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.getJobDescription());
        sb.append("\nVedu tyto lidi");
        for(int i = 0; i < numOfTeamMembers; i++){
            sb.append("\n" + teamMembers[i].toString());
        }
        return sb.toString();
    }
}

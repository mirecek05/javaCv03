package cv03;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Employee e1 = new Employee("Mira","Borec", "student");
        Employee e2 = new Employee("Jarda","Kotlan", "starosta");
        TeamLeaderNededi leader = new TeamLeaderNededi("Jan", "Vedouci",  10);
        leader.addTeamMember(e1);
        leader.addTeamMember(e2);
        System.out.println(leader);

        /*Employee e;
        Random r = new Random();
        if(r.nextBoolean()) e = e1; else e = leader;
        System.out.println(e.toString());*/
    }
}
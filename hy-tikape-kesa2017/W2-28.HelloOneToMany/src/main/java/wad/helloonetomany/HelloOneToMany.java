package wad.helloonetomany;

import wad.helloonetomany.dao.Database;
import wad.helloonetomany.dao.AgentDao;
import java.util.UUID;
import wad.helloonetomany.dao.AgencyDao;
import wad.helloonetomany.domain.Agency;
import wad.helloonetomany.domain.Agent;

public class HelloOneToMany {

    public static void main(String[] args) throws Exception {
        Database database = new Database("jdbc:h2:./database");
        AgentDao agentDao = new AgentDao(database);
        AgencyDao agencyDao = new AgencyDao(database);

        System.out.println("** All agencies:");
        for (Agency agency : agencyDao.findAll()) {
            System.out.println("\t" + agency.getId() + "\t" + agency.getName());
        }

        Agency a = new Agency(UUID.randomUUID().toString().substring(0, 8));
        a = agencyDao.create(a);
        System.out.println("** All agencies after adding a new agency:");
        for (Agency agency : agencyDao.findAll()) {
            System.out.println("\t" + agency.getId() + "\t" + agency.getName());
        }

        System.out.println("");
        System.out.println("** All agents:");
        for (Agent agent : agentDao.findAll()) {
            System.out.println("\t" + agent.getId() + "\t" + agent.getName() + "\t(" + agent.getAgency().getName() + ")");
        }

        String rnd = UUID.randomUUID().toString();
        Agent agent = new Agent(rnd.substring(0, 4), a, rnd.substring(2, 8));
        agentDao.create(agent);

        System.out.println("");
        System.out.println("** All agents after adding a new agent:");
        for (Agent ag : agentDao.findAll()) {
            System.out.println("\t" + ag.getId() + "\t" + ag.getName() + "\t(" + ag.getAgency().getName() + ")");
        }
    }
}

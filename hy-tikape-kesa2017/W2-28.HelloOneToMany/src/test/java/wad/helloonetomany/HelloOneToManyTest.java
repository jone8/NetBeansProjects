package wad.helloonetomany;

import fi.helsinki.cs.tmc.edutestutils.Points;
import java.io.File;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import wad.helloonetomany.dao.AgencyDao;
import wad.helloonetomany.dao.AgentDao;
import wad.helloonetomany.dao.Database;
import wad.helloonetomany.domain.Agency;
import wad.helloonetomany.domain.Agent;

@Points("28")
public class HelloOneToManyTest {

    private Database database;
    private AgentDao agentDao;
    private AgencyDao agencyDao;
    private String databaseName;

    @Before
    public void setUp() throws Exception {
        this.databaseName = "tmp" + UUID.randomUUID().toString().substring(0, 6);
        this.database = new Database("jdbc:h2:./" + this.databaseName);
        this.agentDao = new AgentDao(this.database);
        this.agencyDao = new AgencyDao(this.database);
    }

    @After
    public void tearDown() throws Exception {
        if (new File(databaseName + ".mv.db").exists()) {
            new File(databaseName + ".mv.db").delete();
        }

        if (new File(databaseName + ".trace.db").exists()) {
            new File(databaseName + ".trace.db").delete();
        }
    }

    @Test
    public void createdAgentHasAgency() throws Exception {
        String rnd = UUID.randomUUID().toString();
        Agency a = new Agency(rnd.substring(0, 5));
        a = agencyDao.create(a);

        Agent agent = new Agent(rnd.substring(0, 4), a, rnd.substring(0, 6));
        Agent storedAgent = this.agentDao.create(agent);

        assertNotNull(storedAgent);
        assertNotNull(storedAgent.getAgency());

        assertEquals(agent.getId(), storedAgent.getId());
        assertEquals(agent.getName(), storedAgent.getName());

        assertEquals(a.getId(), storedAgent.getAgency().getId());
        assertEquals(a.getName(), storedAgent.getAgency().getName());
    }

    @Test
    public void addingToDatabaseIncreasesAgentCount() throws Exception {
        List<Agent> agents = this.agentDao.findAll();
        assertNotNull(agents);

        createdAgentHasAgency();
        assertEquals(agents.size() + 1, this.agentDao.findAll().size());
    }

    @Test
    public void allAddedAgentsFoundFromDatabase() throws Exception {
        List<Agent> agentsBeforeAdd = this.agentDao.findAll();

        Agency a = new Agency(UUID.randomUUID().toString().substring(0, 5));
        a = agencyDao.create(a);

        List<Agent> agents = createAgentsWithAgency(a, 5);

        assertEquals(agentsBeforeAdd.size() + 5, this.agentDao.findAll().size());

        for (Agent agent : agents) {
            Agent fromDatabase = this.agentDao.findOne(agent.getId());
            assertEquals(agent.getName(), fromDatabase.getName());
            assertNotNull(agent.getAgency());
        }
    }

    @Test
    public void canDeleteAllFromDatabase() throws Exception {
        Agency a = new Agency(UUID.randomUUID().toString().substring(0, 5));
        a = agencyDao.create(a);

        createAgentsWithAgency(a, 5 + new Random().nextInt(10));

        assertTrue(this.agentDao.findAll().size() > 0);

        for (Agent agent : this.agentDao.findAll()) {
            this.agentDao.delete(agent.getId());
        }

        assertEquals(0, this.agentDao.findAll().size());
    }

    @Test
    public void deletingAgentsDoesNotRemoveAgencies() throws Exception {
        canDeleteAllFromDatabase();
        assertTrue(this.agencyDao.findAll().size() > 0);
    }

    @Test
    public void findByAgencyReturnsCorrectAgentCount() throws Exception {
        Agency a = new Agency(UUID.randomUUID().toString().substring(0, 5));
        a = agencyDao.create(a);

        Agency b = new Agency(UUID.randomUUID().toString().substring(0, 5));
        b = agencyDao.create(b);

        List<Agent> agencyAAgents = createAgentsWithAgency(a, 5 + new Random().nextInt(10));
        List<Agent> agencyBAgents = createAgentsWithAgency(b, 5 + new Random().nextInt(10));

        assertEquals(agencyAAgents.size(), this.agentDao.findByAgency(a).size());
        assertEquals(agencyBAgents.size(), this.agentDao.findByAgency(b).size());

        assertEquals(agencyAAgents.size() + agencyBAgents.size(), this.agentDao.findByAgency(a).size() + this.agentDao.findByAgency(b).size());
    }

    @Test
    public void findByAgencyReturnsCorrectAgents() throws Exception {
        Agency agency = new Agency(UUID.randomUUID().toString().substring(0, 5));
        agency = agencyDao.create(agency);

        List<Agent> agents = createAgentsWithAgency(agency, 5 + new Random().nextInt(10));

        for (Agent agent : this.agentDao.findByAgency(agency)) {
            boolean found = false;
            for (Agent ag : agents) {
                if (agent.getName().equals(ag.getName())) {
                    found = true;
                    break;
                }
            }

            assertTrue(found);
        }
    }

    public List<Agent> createAgentsWithAgency(Agency a, int count) throws SQLException {
        List<Agent> agents = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            String details = UUID.randomUUID().toString();

            Agent agent = new Agent(details.substring(0, 4), a, details.substring(0, 6));
            this.agentDao.create(agent);
            agents.add(agent);
        }
        return agents;
    }
}

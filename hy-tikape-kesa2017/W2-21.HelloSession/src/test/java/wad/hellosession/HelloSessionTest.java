package wad.hellosession;

import fi.helsinki.cs.tmc.edutestutils.Points;
import static org.assertj.core.api.Assertions.assertThat;
import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

@Points("21")
public class HelloSessionTest extends FluentTest {

    public WebDriver webDriver = new HtmlUnitDriver();

    @Override
    public WebDriver getDefaultDriver() {
        return webDriver;
    }

    @ClassRule
    public static ServerRule server = new ServerRule();

    @Test
    public void countStartsFromOneInNewSession() {
        webDriver.manage().deleteAllCookies();
        goTo("http://localhost:" + server.getPort() + "/");
        assertThat(pageSource().contains("counter: 1"));
    }

    @Test
    public void countIncreasesForNewRequests() {
        webDriver.manage().deleteAllCookies();
        goTo("http://localhost:" + server.getPort() + "/");

        for (int i = 1; i < 5; i++) {
            goTo("http://localhost:" + server.getPort() + "/");
            assertThat(pageSource().contains("counter: " + i));
        }
    }

    @Test
    public void eachSeparateSessionHasIndividualCount() {
        countIncreasesForNewRequests();
        countIncreasesForNewRequests();
    }
}

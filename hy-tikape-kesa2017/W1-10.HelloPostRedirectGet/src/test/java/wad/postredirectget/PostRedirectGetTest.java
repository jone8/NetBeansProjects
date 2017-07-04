package wad.postredirectget;

import fi.helsinki.cs.tmc.edutestutils.Points;
import java.util.UUID;
import static org.assertj.core.api.Assertions.assertThat;
import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

@Points("10")
public class PostRedirectGetTest extends FluentTest {

    public WebDriver webDriver = new HtmlUnitDriver();

    @Override
    public WebDriver getDefaultDriver() {
        return webDriver;
    }

    @ClassRule
    public static ServerRule server = new ServerRule();

    @Test
    public void postRedirectedToGet() {
        goTo("http://localhost:" + server.getPort() + "/");

        String data = "TEST: " + UUID.randomUUID().toString();

        fill("input[type=text]").with(data);
        click("input");

        webDriver.navigate().refresh();
        webDriver.navigate().refresh();

        assertThat(pageSource()).containsOnlyOnce(data);
    }

}

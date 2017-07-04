package wad.helloroutes;

import fi.helsinki.cs.tmc.edutestutils.Points;
import static org.assertj.core.api.Assertions.assertThat;
import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

@Points("2")
public class HelloRoutesTest extends FluentTest {

    public WebDriver webDriver = new HtmlUnitDriver();

    @Override
    public WebDriver getDefaultDriver() {
        return webDriver;
    }

    @ClassRule
    public static ServerRule server = new ServerRule();

    @Test
    public void helloRoutesTest() {
        goTo("http://localhost:" + server.getPort() + "/hello");
        assertThat(pageSource()).contains("Hello");
        assertThat(pageSource()).doesNotContain("Routes");

        goTo("http://localhost:" + server.getPort() + "/routes");
        assertThat(pageSource()).contains("Routes");
        assertThat(pageSource()).doesNotContain("Hello");
    }

}

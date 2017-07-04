package wad.hellothymeleaf;

import fi.helsinki.cs.tmc.edutestutils.Points;
import static org.assertj.core.api.Assertions.assertThat;
import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

@Points("5")
public class HelloThymeleafTest extends FluentTest {

    public WebDriver webDriver = new HtmlUnitDriver();

    @Override
    public WebDriver getDefaultDriver() {
        return webDriver;
    }

    @ClassRule
    public static ServerRule server = new ServerRule();

    @Test
    public void indexShownAtRoot() {
        goTo("http://localhost:" + server.getPort() + "/");
        assertThat(pageSource()).contains("Hello Thymeleaf");
        assertThat(pageSource()).doesNotContain("dQw4w9WgXcQ");

    }

    @Test
    public void videoShownAtVideo() {
        goTo("http://localhost:" + server.getPort() + "/video");
        assertThat(pageSource()).contains("dQw4w9WgXcQ");
        assertThat(pageSource()).doesNotContain("Hello Thymeleaf");
    }

    @Test
    public void linkFromRootLeadsToVideo() {
        goTo("http://localhost:" + server.getPort() + "/");
        find("a").click();
        assertThat(pageSource()).contains("dQw4w9WgXcQ");
    }
}

package wad.hellomodel;

import fi.helsinki.cs.tmc.edutestutils.Points;
import static org.assertj.core.api.Assertions.assertThat;
import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

@Points("6")
public class HelloModelTest extends FluentTest {

    public WebDriver webDriver = new HtmlUnitDriver();

    @Override
    public WebDriver getDefaultDriver() {
        return webDriver;
    }

    @ClassRule
    public static ServerRule server = new ServerRule();

    @Test
    public void titleShownOnPage() {
        goTo("http://localhost:" + server.getPort() + "/");
        assertThat(pageSource()).doesNotContain("HelloWorld");
        assertThat(pageSource()).doesNotContain("SuperStory");
        goTo("http://localhost:" + server.getPort() + "/?title=HelloWorld");
        assertThat(pageSource()).contains("HelloWorld");
        assertThat(pageSource()).doesNotContain("SuperStory");
        goTo("http://localhost:" + server.getPort() + "/?title=SuperStory");
        assertThat(pageSource()).contains("SuperStory");
        assertThat(pageSource()).doesNotContain("HelloWorld");
    }

    @Test
    public void personShownOnPage() {
        goTo("http://localhost:" + server.getPort() + "/");
        assertThat(pageSource()).doesNotContain("Robot");
        assertThat(pageSource()).doesNotContain("Girl");
        goTo("http://localhost:" + server.getPort() + "/?person=Robot");
        assertThat(pageSource()).contains("Robot");
        assertThat(pageSource()).doesNotContain("Girl");
        goTo("http://localhost:" + server.getPort() + "/?title=Girl");
        assertThat(pageSource()).contains("Girl");
        assertThat(pageSource()).doesNotContain("Robot");
    }

    @Test
    public void bothShownOnPage() {
        goTo("http://localhost:" + server.getPort() + "/?title=HelloWorld&person=Robot");
        assertThat(pageSource()).doesNotContain("Girl");
        assertThat(pageSource()).doesNotContain("SuperStory");
        assertThat(pageSource()).contains("Robot");
        assertThat(pageSource()).contains("HelloWorld");

        goTo("http://localhost:" + server.getPort() + "/?title=SuperStory&person=Girl");
        assertThat(pageSource()).doesNotContain("Robot");
        assertThat(pageSource()).doesNotContain("HelloWorld");
        assertThat(pageSource()).contains("Girl");
        assertThat(pageSource()).contains("SuperStory");
    }
}

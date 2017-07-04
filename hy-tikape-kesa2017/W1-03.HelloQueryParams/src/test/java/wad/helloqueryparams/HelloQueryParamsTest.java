package wad.helloqueryparams;

import fi.helsinki.cs.tmc.edutestutils.Points;
import static org.assertj.core.api.Assertions.assertThat;
import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

@Points("3")
public class HelloQueryParamsTest extends FluentTest {

    public WebDriver webDriver = new HtmlUnitDriver();

    @Override
    public WebDriver getDefaultDriver() {
        return webDriver;
    }

    @ClassRule
    public static ServerRule server = new ServerRule();

    @Test
    public void queryParamsTest() {
        goTo("http://localhost:" + server.getPort() + "/hello");
        assertThat(pageSource()).contains("Hello");
        assertThat(pageSource()).doesNotContain("param");
        goTo("http://localhost:" + server.getPort() + "/hello?param=param");
        assertThat(pageSource()).contains("Hello");
        assertThat(pageSource()).contains("param");

        goTo("http://localhost:" + server.getPort() + "/params");
        assertThat(pageSource()).doesNotContain("aaa");
        assertThat(pageSource()).doesNotContain("bbb");
        assertThat(pageSource()).doesNotContain("ccc");
        goTo("http://localhost:" + server.getPort() + "/params?aaa=aaa&bbb=bbb&ccc=ccc");
        assertThat(pageSource()).contains("aaa");
        assertThat(pageSource()).contains("bbb");
        assertThat(pageSource()).contains("ccc");
    }

}

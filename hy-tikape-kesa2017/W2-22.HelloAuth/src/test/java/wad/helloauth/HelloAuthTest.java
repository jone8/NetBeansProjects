package wad.helloauth;

import fi.helsinki.cs.tmc.edutestutils.Points;
import static org.assertj.core.api.Assertions.assertThat;
import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

@Points("22")
public class HelloAuthTest extends FluentTest {

    public WebDriver webDriver = new HtmlUnitDriver();

    @Override
    public WebDriver getDefaultDriver() {
        return webDriver;
    }

    @ClassRule
    public static ServerRule server = new ServerRule();

    @Test
    public void secretIsForbiddenWhenNotLoggedIn() {
        webDriver.manage().deleteAllCookies();
        goTo("http://localhost:" + server.getPort() + "/secret/");
        assertThat(pageSource().contains("Not allowed"));
        assertThat(!pageSource().contains("youtu"));
    }

    @Test
    public void invalidCredentialsShowsText() {
        webDriver.manage().deleteAllCookies();
        goTo("http://localhost:" + server.getPort() + "/");

        fill("input[name=username]").with("jack");
        fill("input[name=password]").with("bauer");
        submit("input[type=submit]");

        assertThat(pageSource()).contains("Invalid credentials");
    }

    @Test
    public void invalidCredentialsDeniedAccessToSecret() {
        webDriver.manage().deleteAllCookies();
        goTo("http://localhost:" + server.getPort() + "/");

        fill("input[name=username]").with("jack");
        fill("input[name=password]").with("bauer");
        submit("input[type=submit]");

        goTo("http://localhost:" + server.getPort() + "/secret/");
        assertThat(pageSource().contains("Not allowed"));
        assertThat(!pageSource().contains("youtu"));
    }

    @Test
    public void secretIsAvailableWhenLoggedIn() {
        webDriver.manage().deleteAllCookies();
        goTo("http://localhost:" + server.getPort() + "/");
        assertThat(!pageSource().contains("Not allowed"));
        assertThat(!pageSource().contains("youtu"));

        fill("input[name=username]").with("user");
        fill("input[name=password]").with("pw");
        submit("input[type=submit]");

        goTo("http://localhost:" + server.getPort() + "/secret/");
        assertThat(!pageSource().contains("Not allowed"));
        assertThat(pageSource().contains("youtu"));
    }

    @Test
    public void secretIsAvailableOnSubsequentRequestsWhenLoggedIn() {
        webDriver.manage().deleteAllCookies();
        goTo("http://localhost:" + server.getPort() + "/");
        assertThat(!pageSource().contains("Not allowed"));
        assertThat(!pageSource().contains("youtu"));

        fill("input[name=username]").with("user");
        fill("input[name=password]").with("pw");
        submit("input[type=submit]");

        for (int i = 0; i < 5; i++) {
            goTo("http://localhost:" + server.getPort() + "/secret/");
            assertThat(!pageSource().contains("Not allowed"));
            assertThat(pageSource().contains("youtu"));
        }
    }

    @Test
    public void secretIsUnavailableRemovingSessionCookies() {
        webDriver.manage().deleteAllCookies();
        goTo("http://localhost:" + server.getPort() + "/");
        assertThat(!pageSource().contains("Not allowed"));
        assertThat(!pageSource().contains("youtu"));

        fill("input[name=username]").with("user");
        fill("input[name=password]").with("pw");
        submit("input[type=submit]");

        for (int i = 0; i < 5; i++) {
            goTo("http://localhost:" + server.getPort() + "/secret/");
            assertThat(!pageSource().contains("Not allowed"));
            assertThat(pageSource().contains("youtu"));
        }

        webDriver.manage().deleteAllCookies();
        goTo("http://localhost:" + server.getPort() + "/secret/");
        assertThat(pageSource().contains("Not allowed"));
        assertThat(!pageSource().contains("youtu"));
    }
}

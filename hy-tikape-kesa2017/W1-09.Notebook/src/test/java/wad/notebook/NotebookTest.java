package wad.notebook;

import fi.helsinki.cs.tmc.edutestutils.Points;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import static org.assertj.core.api.Assertions.assertThat;
import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

@Points("9")
public class NotebookTest extends FluentTest {

    public WebDriver webDriver = new HtmlUnitDriver();

    @Override
    public WebDriver getDefaultDriver() {
        return webDriver;
    }

    @ClassRule
    public static ServerRule server = new ServerRule();

    @Test
    public void contentFromFormAddedToNotebook() {
        addContent(3, 10);
    }

    @Test
    public void onlyTenLatestMessagesShown() {
        addContent(25, 10);
    }

    public void addContent(int num, int maxSize) {
        List<String> items = new ArrayList<>();
        List<String> shouldNotContainItems = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            String content = "TODO: " + UUID.randomUUID().toString();
            goTo("http://localhost:" + server.getPort() + "/");
            shouldNotContainItems.stream().forEach(s -> assertThat(pageSource()).doesNotContain(s));

            fill("input[type=text]").with(content);
            click("input");

            items.add(content);
            while (items.size() > maxSize) {
                shouldNotContainItems.add(items.remove(0));
            }

            items.stream().forEach(s -> assertThat(pageSource()).contains(s));
        }
    }
}

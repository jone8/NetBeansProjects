package wad.hellopathvariables;

import fi.helsinki.cs.tmc.edutestutils.Points;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import static org.assertj.core.api.Assertions.assertThat;
import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

@Points("12")
public class HelloPathVariablesTest extends FluentTest {

    public WebDriver webDriver = new HtmlUnitDriver();

    @Override
    public WebDriver getDefaultDriver() {
        return webDriver;
    }

    @ClassRule
    public static ServerRule server = new ServerRule();

    @Test
    public void defaultGivesHat() {
        goTo("http://localhost:" + server.getPort() + "/");
        assertThat(pageSource()).contains("Hat");
    }

    @Test
    public void allHatsAvailable() {
        Map<String, Item> items = new HashMap<>();
        items.put("default", new Item("Hat", "default"));
        items.put("ascot", new Item("Ascot cap", "hat"));
        items.put("balaclava", new Item("Balaclava", "hat"));
        items.put("bicorne", new Item("Bicorne", "hat"));
        items.put("busby", new Item("Busby", "hat"));
        items.put("capotain", new Item("Capotain", "hat"));
        items.put("homburg", new Item("Homburg", "hat"));
        items.put("montera", new Item("Montera", "hat"));

        items.keySet().stream().forEach(s -> {
            goTo("http://localhost:" + server.getPort() + "/" + s);
            assertThat(pageSource()).contains(items.get(s).getName());

            items.keySet().stream().forEach(i -> {
                if (s.equals(i)) {
                    return;
                }

                assertThat(pageSource()).doesNotContain(items.get(i).getName());
            });
        });

    }
}

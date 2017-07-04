package wad.helloobjects;

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

@Points("11")
public class HelloObjectsTest extends FluentTest {

    public WebDriver webDriver = new HtmlUnitDriver();

    @Override
    public WebDriver getDefaultDriver() {
        return webDriver;
    }

    @ClassRule
    public static ServerRule server = new ServerRule();

    @Test
    public void addItem() {
        addItems(1);
    }

    @Test
    public void addMultipleItems() {
        addItems(5).stream().forEach(s -> {
            assertThat(pageSource()).containsOnlyOnce(s.getName());
            assertThat(pageSource()).containsOnlyOnce(s.getType());
        });
    }

    private List<Item> addItems(int count) {
        List<Item> items = new ArrayList<>();

        for (int i = 0; i < count; i++) {

            goTo("http://localhost:" + server.getPort() + "/");

            String name = "NAME: " + UUID.randomUUID().toString();
            String type = "TYPE: " + UUID.randomUUID().toString();

            items.add(new Item(name, type));

            fill("input[name=name]").with(name);
            fill("input[name=type]").with(type);
            click("input[type=submit]");

            webDriver.navigate().refresh();

            assertThat(pageSource()).containsOnlyOnce(name);
            assertThat(pageSource()).containsOnlyOnce(type);
        }

        return items;
    }
}

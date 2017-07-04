package wad.hellocategories;

import fi.helsinki.cs.tmc.edutestutils.Points;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import static org.assertj.core.api.Assertions.assertThat;
import org.fluentlenium.adapter.FluentTest;
import org.fluentlenium.core.domain.FluentWebElement;
import org.junit.After;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import wad.hellocategories.dao.Database;
import wad.hellocategories.domain.Category;
import wad.hellocategories.domain.Item;

@Points("29")
public class HelloCategoriesTest extends FluentTest {

    public WebDriver webDriver = new HtmlUnitDriver();

    @Override
    public WebDriver getDefaultDriver() {
        return webDriver;
    }

    @ClassRule
    public static ServerRule server = new ServerRule();

    @Before
    public void preClean() {
        doClean();
    }

    @After
    public void postClean() {
        doClean();
    }

    public void doClean() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(HelloCategoriesTest.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (new File("database.mv.db").exists()) {
            new File("database.mv.db").delete();
        }
        if (new File("database.trace.db").exists()) {
            new File("database.trace.db").delete();
        }

        try {
            new Database("jdbc:h2:./database");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void canAddCategory() {
        createCategory();
    }

    @Test
    public void canRemoveCategory() {
        Category c = createCategory();
        List<FluentWebElement> els = find("tr");

        for (FluentWebElement el : els) {
            if (el.getText().contains(c.getName())) {
                el.find("input[value='Delete!']").submit();
                break;
            }
        }

        goTo("http://localhost:" + server.getPort() + "/category");
        assertThat(!pageSource().contains(c.getName()));
    }

    @Test
    public void canAddMultipleCategories() {
        List<Category> cats = createCategories(3);
        goTo("http://localhost:" + server.getPort() + "/category");

        for (Category cat : cats) {
            assertThat(pageSource().contains(cat.getName()));
        }
    }

    @Test
    public void canNavigateToCategoryPage() {
        List<Category> cats = createCategories(2);

        for (Category cat : cats) {
            goTo("http://localhost:" + server.getPort() + "/category");
            findLinkAndClick(cat);
            assertThat(pageSource().contains(cat.getName()));

            cats.stream().filter(c -> c != cat).forEach(c -> assertThat(!pageSource().contains(c.getName())));
        }
    }

    @Test
    public void canAddItemsToCategory() {
        List<Category> cats = createCategories(2);

        List<Item> addedItems = new ArrayList<>();
        for (Category cat : cats) {
            goTo("http://localhost:" + server.getPort() + "/category");
            findLinkAndClick(cat);
            List<Item> items = createItems(2);

            goTo("http://localhost:" + server.getPort() + "/category");
            findLinkAndClick(cat);

            for (Item item : items) {
                assertThat(pageSource().contains(item.getName()));
            }

            for (Item item : addedItems) {
                assertThat(!pageSource().contains(item.getName()));
            }

            addedItems.addAll(items);
        }
    }

    @Test
    public void canRemoveItemsFromCategory() {
        List<Category> cats = createCategories(2);

        List<Item> addedItems = new ArrayList<>();
        for (Category cat : cats) {
            goTo("http://localhost:" + server.getPort() + "/category");
            findLinkAndClick(cat);
            List<Item> items = createItems(2);

            goTo("http://localhost:" + server.getPort() + "/category");
            findLinkAndClick(cat);

            items.stream().forEach(item -> assertThat(pageSource().contains(item.getName())));

            items.stream().forEach(item -> {
                goTo("http://localhost:" + server.getPort() + "/category");
                findLinkAndClick(cat);
                findLinkAndClick(item);
            });

            items.stream().forEach(item -> assertThat(!pageSource().contains(item.getName())));
        }
    }

    public void createCategoriesAndNavigateToThemAndAct() {
        List<Category> cats = createCategories(3);

        for (Category cat : cats) {
            goTo("http://localhost:" + server.getPort() + "/category");
            findLinkAndClick(cat);
            assertThat(pageSource().contains(cat.getName()));

            cats.stream().filter(c -> c != cat).forEach(c -> assertThat(!pageSource().contains(c.getName())));
        }
    }

    public void findLinkAndClick(Category cat) {
        find("a").stream().filter(l -> l.getText().contains(cat.getName())).findFirst().get().click();
    }

    public void findLinkAndClick(Item item) {
        for (FluentWebElement el : find("li")) {
            if (!el.getText().contains(item.getName())) {
                continue;
            }

            el.find("input[value='Delete!']").submit();
            break;
        }
    }

    public List<Category> createCategories(int count) {
        return IntStream.range(0, count).mapToObj(i -> createCategory()).collect(Collectors.toList());
    }

    public Category createCategory() {
        goTo("http://localhost:" + server.getPort() + "/category");

        String data = UUID.randomUUID().toString();

        Category c = new Category(data.substring(0, 6));

        assertThat(!pageSource().contains(c.getName()));

        fill("input[name=name]").with(c.getName());
        find("input[value='Add!']").click();

        assertThat(pageSource().contains(c.getName()));

        return c;
    }

    public List<Item> createItems(int count) {
        return IntStream.range(0, count).mapToObj(i -> createItem()).collect(Collectors.toList());
    }

    public Item createItem() {
        goTo("http://localhost:" + server.getPort() + "/category");

        String data = UUID.randomUUID().toString();

        Item i = new Item(data.substring(0, 6));

        assertThat(!pageSource().contains(i.getName()));

        fill("input[name=name]").with(i.getName());
        find("input[value='Add!']").click();

        assertThat(pageSource().contains(i.getName()));

        return i;
    }

}

package wad.shoppingspree;

import fi.helsinki.cs.tmc.edutestutils.Points;
import java.util.Arrays;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import org.fluentlenium.adapter.FluentTest;
import org.fluentlenium.core.domain.FluentWebElement;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

@Points("23")
public class ShoppingSpreeTest extends FluentTest {

    public WebDriver webDriver = new HtmlUnitDriver();
    private final List<String> items = Arrays.asList("Bongos", "Congas", "Darbukas", "Djembes");

    @Override
    public WebDriver getDefaultDriver() {
        return webDriver;
    }

    @ClassRule
    public static ServerRule server = new ServerRule();

    @Test
    public void noItemsInBasketAtStart() {
        goTo("http://localhost:" + server.getPort() + "/");
        long rows = find("table").first().find("tr").stream().filter(r -> r.getText().contains("0")).count();
        assertThat(rows == 5);
    }

    @Test
    public void addingItemToBasketIncrementsSomeItemCount() {
        webDriver.manage().deleteAllCookies();
        goTo("http://localhost:" + server.getPort() + "/");
        // Add first item to basket
        find("table").find("tr").get(1).find("input[type=submit]").first().click();

        long rows = find("table").first().find("tr").stream().filter(r -> r.getText().contains("0")).count();
        assertThat(rows == 4);

        rows = find("table").first().find("tr").stream().filter(r -> r.getText().contains("1")).count();
        assertThat(rows == 1);
    }

    @Test
    public void addingItemToBasketIncrementsCorrectItemCount() {
        webDriver.manage().deleteAllCookies();
        goTo("http://localhost:" + server.getPort() + "/");
        // Add first item to basket
        find("table").find("tr").get(1).find("input[type=submit]").first().click();
        assertThat(find("table").find("tr").get(1).getText().contains("1"));
    }

    @Test
    public void countIncreasesForEveryAdd() {
        webDriver.manage().deleteAllCookies();
        goTo("http://localhost:" + server.getPort() + "/");
        // Add first item to basket
        for (int i = 0; i < 10; i++) {
            FluentWebElement row = find("table").find("tr").get(1);
            assertThat(row.getText().contains("" + i));

            for (int j = 0; j < 10; j++) {
                if (i == j) {
                    continue;
                }

                assertThat(!row.getText().contains("" + j));
            }

            row.find("input[type=submit]").first().click();
        }
    }

    @Test
    public void eachItemHasSeparateCount() {
        webDriver.manage().deleteAllCookies();
        goTo("http://localhost:" + server.getPort() + "/");

        // add items to basket, each item separately
        for (int i = 1; i < 5; i++) {

            for (int j = 0; j < 10; j++) {
                FluentWebElement row = find("table").find("tr").get(i);
                assertThat(row.getText().contains("" + j));

                for (int k = 0; k < 10; k++) {
                    if (j == k) {
                        continue;
                    }

                    assertThat(!row.getText().contains("" + k));
                }

                row.find("input[type=submit]").first().click();
            }

        }
    }

}

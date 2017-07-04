package wad.hellodao;

import fi.helsinki.cs.tmc.edutestutils.Points;
import java.util.List;
import java.util.UUID;
import static org.assertj.core.api.Assertions.assertThat;
import org.fluentlenium.adapter.FluentTest;
import org.fluentlenium.core.domain.FluentWebElement;
import static org.junit.Assert.assertNotNull;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import wad.readinglist.domain.Book;

@Points("27")
public class ReadingListTest extends FluentTest {

    public WebDriver webDriver = new HtmlUnitDriver();

    @Override
    public WebDriver getDefaultDriver() {
        return webDriver;
    }

    @ClassRule
    public static ServerRule server = new ServerRule();

    @Test
    public void canAddABook() {
        createBook();
    }

    @Test
    public void canAddTwoBooks() {
        canAddABook();
        canAddABook();
    }

    public void bookIsUnreadByDefault() {
        Book b = createBook();
        boolean found = assertThatTitleAndStatusCorrectForOneBook(b, "unread");
        assertThat(found);
    }

    @Test
    public void canSetBookAsReading() {
        Book b = createBook();

        changeBookStatus(b, "unread", "input[value='Reading!']");

        // get elements again
        boolean found = assertThatTitleAndStatusCorrectForOneBook(b, "reading");

        assertThat(found);
    }

    @Test
    public void canSetBookAsRead() {
        Book b = createBook();

        changeBookStatus(b, "unread", "input[value='Read!']");

        boolean found = assertThatTitleAndStatusCorrectForOneBook(b, "read");
        assertThat(found);
    }

    @Test
    public void canSetBookAsUnread() {
        Book b = createBook();

        // set book as reading
        changeBookStatus(b, "unread", "input[value='Reading!']");
        assertThatTitleAndStatusCorrectForOneBook(b, "reading");

        // set book as unread
        changeBookStatus(b, "reading", "input[value='Unread!']");

        // check that it was updated
        boolean found = assertThatTitleAndStatusCorrectForOneBook(b, "unread");

        assertThat(found);
    }

    public void changeBookStatus(Book b, String expectedStatus, String buttonToClick) {
        List<FluentWebElement> rows = getBookTableRows();

        for (int i = 1; i < rows.size(); i++) {
            FluentWebElement el = rows.get(i);
            List<FluentWebElement> cells = el.find("td");

            if (cells.get(0).getText().contains(b.getTitle())) {
                assertThat(cells.get(1).getText().contains("unread"));
                cells.get(2).find("input[value='Reading!']").submit();
                break;
            }
        }
    }

    public boolean assertThatTitleAndStatusCorrectForOneBook(Book b, String status) {
        List<FluentWebElement> rows = getBookTableRows();
        boolean found = false;

        for (int i = 1; i < rows.size(); i++) {
            FluentWebElement el = rows.get(i);
            List<FluentWebElement> cells = el.find("td");

            if (cells.get(0).getText().contains(b.getTitle())) {
                found = true;
                assertThat(cells.get(1).getText().contains(status));
                break;
            }
        }

        return found;
    }

    public List<FluentWebElement> getBookTableRows() {
        goTo("http://localhost:" + server.getPort() + "/");

        List<FluentWebElement> rows = find("table").get(0).find("tr");
        assertNotNull(rows);
        assertThat(rows.size() > 1);

        return rows;
    }

    public Book createBook() {
        goTo("http://localhost:" + server.getPort() + "/");

        String data = UUID.randomUUID().toString();

        Book b = new Book(data.substring(0, 4), data.substring(4, 8), "unread");

        assertThat(!pageSource().contains(b.getIsbn()));
        assertThat(!pageSource().contains(b.getTitle()));

        fill("input[name=title]").with(b.getTitle());
        fill("input[name=isbn]").with(b.getIsbn());
        find("input[value='Add!']").click();

        assertThat(pageSource().contains(b.getIsbn()));
        assertThat(pageSource().contains(b.getTitle()));

        return b;
    }
}

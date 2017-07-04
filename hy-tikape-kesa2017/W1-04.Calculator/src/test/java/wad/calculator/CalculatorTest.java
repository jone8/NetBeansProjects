package wad.calculator;

import fi.helsinki.cs.tmc.edutestutils.Points;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import static org.assertj.core.api.Assertions.assertThat;
import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

@Points("4")
public class CalculatorTest extends FluentTest {

    public WebDriver webDriver = new HtmlUnitDriver();

    @Override
    public WebDriver getDefaultDriver() {
        return webDriver;
    }

    @ClassRule
    public static ServerRule server = new ServerRule();

    @Test
    public void addTest() {
        Random rand = new Random();
        List<Integer> pastResults = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int first = rand.nextInt(1000000) - 500000;
            int second = rand.nextInt(1000000) - 500000;

            goTo("http://localhost:" + server.getPort() + "/add?first=" + first + "&second=" + second);
            assertThat(pageSource()).contains("" + (first + second));

            for (Integer pastResult : pastResults) {
                assertThat(pageSource()).doesNotContain("" + pastResult);
            }

            pastResults.add(first + second);
        }
    }

    @Test
    public void multiplyTest() {
        Random rand = new Random();
        List<Integer> pastResults = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int first = rand.nextInt(1000) - 500;
            int second = rand.nextInt(1000) - 500;

            goTo("http://localhost:" + server.getPort() + "/multiply?first=" + first + "&second=" + second);
            assertThat(pageSource()).contains("" + (first * second));

            for (Integer pastResult : pastResults) {
                assertThat(pageSource()).doesNotContain("" + pastResult);
            }

            pastResults.add(first * second);
        }
    }

    @Test
    public void sumTest() {
        Random rand = new Random();
        char[] paramKeys = "abcdefghijklmn".toCharArray();

        List<Integer> pastResults = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int keys = rand.nextInt(paramKeys.length - 3) + 2;
            StringBuilder sb = new StringBuilder();
            int sum = 0;
            for (int j = 0; j < keys; j++) {
                int value = rand.nextInt(10000) - 5000;

                if (j >= 1) {
                    sb.append("&");
                }

                sb.append(paramKeys[j]).append("=").append(value);
                sum += value;
            }

            goTo("http://localhost:" + server.getPort() + "/sum?" + sb.toString());

            assertThat(pageSource()).contains("" + sum);

            for (Integer pastResult : pastResults) {
                assertThat(pageSource()).doesNotContain("" + pastResult);
            }

            pastResults.add(sum);
        }
    }
}

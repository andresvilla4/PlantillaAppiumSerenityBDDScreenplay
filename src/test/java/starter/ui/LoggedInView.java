package starter.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoggedInView {
    public static Target welcomeText = Target
            .the("Welcome Text")
            .located(By.xpath(""));
}

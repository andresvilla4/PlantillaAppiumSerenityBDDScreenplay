package starter.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class LoginView {
    public static Target txtUsername = Target
            .the("Username text")
            .located(AppiumBy.accessibilityId(""));

    public static Target txtPassword = Target
            .the("Password text")
            .located(AppiumBy.accessibilityId(""));

    public static Target btnLogin = Target
            .the("Login button")
            .located(AppiumBy.accessibilityId(""));
}

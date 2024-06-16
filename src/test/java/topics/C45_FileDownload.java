package topics;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.Assert.assertTrue;

public class C45_FileDownload extends TestBase {
    /*
  Go to https://testfile.org/
  Download a PDF file
  Verify it is downloaded
  */
    @Test
    public void downloadTest() throws InterruptedException {

//Go to URL: https://the-internet.herokuapp.com/download
        driver.get("https://the-internet.herokuapp.com/download");

//Download selenium-snapshot.png
        driver.findElement(By.linkText("selenium-snapshot.png")).click();

//Verify if the file downloaded successfully.
        Thread.sleep(500);
        assert Files.exists(Path.of(System.getProperty("user.home")+"/Downloads/selenium-snapshot.png"));
    }


}

/*
 * code provided by teacher
 *
 * Launch the default system browser.
 *
 * @see <a href="https://stackoverflow.com/questions/5226212/how-to-open-the-default-webbrowser-using-java">launch browser</a>
 */
import java.awt.Desktop;
import java.awt.Desktop.*;
import java.io.*;
import java.net.*;
public class Browser{

    public static void main(String[]args){
        launch("https://www.google.com");
    }
    /**
     * Launches the browser with the given url
     *
     * Supports Windows, Mac, and Linux.
     * @param url the page to open in the web browser
     * @throws IllegalArgumentException if the url is null
     */
    public static void launch(String url){
        if(url == null){
            throw new IllegalArgumentException("url cannot be null");
        }
        if(Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)){
            Desktop desktop = Desktop.getDesktop();
            try{
                desktop.browse(new URI(url));
            }catch(IOException | URISyntaxException ioe){
                ioe.printStackTrace();
            }
        }else{
            Runtime runtime = Runtime.getRuntime();
            try{
                runtime.exec("xdg-open " + url);
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }
}

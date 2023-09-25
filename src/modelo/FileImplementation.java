package modelo;

import java.util.ResourceBundle;

/**
 *
 * @author Jason, Ian.
 */
public class FileImplementation implements Model {

    @Override
    public String getGreating() {
        return ResourceBundle.getBundle("ficheros.greating").getString("mensaje");
    }
}

/*  String greating = null;
        try {
            Properties greatingFich = new Properties();
            String rutaProyecto = System.getProperty("user.dir");
            FileInputStream fis = new FileInputStream(rutaProyecto + "\\src\\ficheros\\greating.properties");
            greatingFich.load(fis);

            greating = greatingFich.getProperty("greating");

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return greating;
 */

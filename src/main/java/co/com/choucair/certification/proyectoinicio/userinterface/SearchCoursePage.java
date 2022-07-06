package co.com.choucair.certification.proyectoinicio.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage{
    public static final Target BUTTON_UC = Target.the("Seleccionar la universidad choucair").located(By.xpath("//div[@id='certificaciones']//strong"));
    public static final Target INPUT_COURSE = Target.the("Buscar el curso").located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the("Ir al curso ingresado").located(By.xpath("//button[@class='btn btn-secondary']"));
    public static final Target SELECT_COURSE = Target.the("Seleccion el curso").located(By.xpath("/html/body/div[2]/div[2]/div/div/div/section/div/div/div/h4/a"));
    public static final Target NAME_COURSE = Target.the("Extraer el nombre del curso").located(By.xpath("/html/body/div[1]/div[2]/div/header/div/div/div[2]/div[1]/div[1]/a/div/div/h1"));

}

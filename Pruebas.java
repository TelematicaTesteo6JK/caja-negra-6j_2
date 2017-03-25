/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 *
 * @author Aldini
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        ArrayList<String> lines = new ArrayList();
        lines.add("Test data | Expected result | Actual result");
	String dataOut = "";
	System.out.println("Test data | Expected result | Actual result");
	dataOut = "500 | 1 | " + functions.funciones.obtener_rendimiento(500);
	lines.add(dataOut);
	System.out.println(dataOut);
	dataOut = "5000 | 3 | " + functions.funciones.obtener_rendimiento(5000);
	System.out.println(dataOut);
	lines.add(dataOut);
	dataOut = "11000 | 5 | " + functions.funciones.obtener_rendimiento(11000);
	System.out.println(dataOut);
	lines.add(dataOut);
	dataOut = "999 | 1 | " + functions.funciones.obtener_rendimiento(999);
	System.out.println(dataOut);
	lines.add(dataOut);
	dataOut = "1000 | 3 | " + functions.funciones.obtener_rendimiento(1000);
	System.out.println(dataOut);
	lines.add(dataOut);
	dataOut = "10000| 3 | " + functions.funciones.obtener_rendimiento(10000);
	System.out.println(dataOut);
	lines.add(dataOut);
	dataOut = "10001 | 5 | " + functions.funciones.obtener_rendimiento(10001);
	System.out.println(dataOut);
	lines.add(dataOut);
	Path file = Paths.get("C:\\Users\\Aldo\\Documents\\NetBeansProjects\\reportePruebas.txt");
	Files.write(file, lines, Charset.forName("UTF-8"));
    }
    
}

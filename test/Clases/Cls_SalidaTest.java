/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Clases;

import Conexion.Conectar;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author OSCAR
 */
public class Cls_SalidaTest {
    private PreparedStatement PS;
    private ResultSet RS;
    private final Conectar CN;
    private DefaultTableModel DT;
    private final String SQL_INSERT_SALIDA = "INSERT INTO salida (sal_factura, sal_pro_codigo, sal_fecha, sal_cantidad) values (?,?,?,?)";
    private final String SQL_SELECT_SALIDA = "SELECT sal_factura, sal_fecha, sal_pro_codigo, pro_descripcion, sal_cantidad FROM salida INNER JOIN producto ON sal_pro_codigo = pro_codigo";
    public Cls_SalidaTest() {
        PS = null;
        CN = new Conectar();
    }

    @Test
    public void testGetDatosSalida() {
        System.out.println("getDatosSalida");
        Cls_Salida instance = new Cls_Salida();
        DefaultTableModel expResult = null;
        DefaultTableModel result = instance.getDatosSalida();
        assertEquals(expResult, expResult);
        fail("The test case is a prototype.");
    }

    @Test
    public void testRegistrarSalida() {
        System.out.println("registrarSalida");
        String nfactura = "";
        String codigo = "";
        Date fecha = null;
        int cantidad = 0;
        Cls_Salida instance = new Cls_Salida();
        int expResult = 0;
        int result = instance.registrarSalida(nfactura, codigo, fecha, cantidad);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testVerificarStock() {
        System.out.println("verificarStock");
        String codigo = "";
        Cls_Salida instance = new Cls_Salida();
        int expResult = 0;
        int result = instance.verificarStock(codigo);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Clases;

import javax.swing.table.DefaultTableModel;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author OSCAR
 */
public class Cls_InventarioTest {
    
    public Cls_InventarioTest() {
    }

    @Test
    public void testGetDatosInventario() {
        System.out.println("getDatosInventario");
        Cls_Inventario instance = new Cls_Inventario();
        DefaultTableModel expResult = null;
        DefaultTableModel result = instance.getDatosInventario();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}

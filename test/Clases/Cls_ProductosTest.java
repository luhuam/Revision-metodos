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
public class Cls_ProductosTest {
    
    public Cls_ProductosTest() {
    }
/*
    @Test
    public void testGetDatosProductos() {
        
        System.out.println("getDatosProductos");
        Cls_Productos instance = new Cls_Productos();
        DefaultTableModel expResult = null;
        DefaultTableModel result = instance.getDatosProductos();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
*/
    @Test
    public void testRegistrarProducto() {
        System.out.println("registrarProducto");
        String codigo = "";
        String descripcion = "";
        Cls_Productos instance = new Cls_Productos();
        int expResult = 1;
        int result = instance.registrarProducto(codigo, descripcion);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
/*
    @Test
    public void testInsertarProductoInventario() {
        System.out.println("insertarProductoInventario");
        String codigoProducto = "";
        Cls_Productos instance = new Cls_Productos();
        instance.insertarProductoInventario(codigoProducto);
        fail("The test case is a prototype.");
    }
*/
    /*
    @Test
    public void testVerificarCodigoInventario() {
        System.out.println("verificarCodigoInventario");
        String codigo = "";
        Cls_Productos instance = new Cls_Productos();
        int expResult = 0;
        int result = instance.verificarCodigoInventario(codigo);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
*/
    @Test
    public void testActualizarProducto() {
        System.out.println("actualizarProducto");
        String codigo = "";
        String descripcion = "";
        String codigo_old = "";
        Cls_Productos instance = new Cls_Productos();
        int expResult = 1;
        int result = instance.actualizarProducto(codigo, descripcion, codigo_old);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testEliminarProducto() {
        System.out.println("eliminarProducto");
        String codigo = "";
        Cls_Productos instance = new Cls_Productos();
        int expResult = 1;
        int result = instance.eliminarProducto(codigo);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}

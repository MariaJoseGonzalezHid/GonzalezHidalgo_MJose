
package dao;
/**
 *
 * @author mariajosegonzalezhidalgo
 */
import java.sql.Connection;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class PedidosDaoTest{
    
    public PedidosDaoTest(){
    }
    
    @BeforeClass
    public static void setUpClass(){
    }
    
    @AfterClass
    public static void tearDownClass(){
    }
    
    @Before
    public void setUp(){
    }
    
    @After
    public void tearDown(){
    }

    /**
     * Test of getConexion method, of class PedidosDao.
     */
    @Test
    public void testGetConexion(){
        System.out.println("getConexion");
        PedidosDao instance = new PedidosDao();
        Connection expResult = null;
        Connection result = instance.getConexion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class PedidosDao.
     */
    @Test
    public void testRead(){
        System.out.println("read");
        Integer idPedido = null;
        PedidosDao instance = new PedidosDao();
        Pedido expResult = null;
        Pedido result = instance.read(idPedido);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class PedidosDao.
     */
    @Test
    public void testInsert(){
        System.out.println("insert");
        Pedido pedido = null;
        PedidosDao instance = new PedidosDao();
        Integer expResult = null;
        Integer result = instance.insert(pedido);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class PedidosDao.
     */
    @Test
    public void testUpdate(){
        System.out.println("update");
        Pedido pedido = null;
        PedidosDao instance = new PedidosDao();
        Integer expResult = null;
        Integer result = instance.update(pedido);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class PedidosDao.
     */
    @Test
    public void testDelete(){
        System.out.println("delete");
        Integer idPedido = null;
        PedidosDao instance = new PedidosDao();
        Integer expResult = null;
        Integer result = instance.delete(idPedido);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listar method, of class PedidosDao.
     */
    @Test
    public void testListar(){
        System.out.println("listar");
        Integer posicion = null;
        PedidosDao instance = new PedidosDao();
        ArrayList<Pedido> expResult = null;
        ArrayList<Pedido> result = instance.listar(posicion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

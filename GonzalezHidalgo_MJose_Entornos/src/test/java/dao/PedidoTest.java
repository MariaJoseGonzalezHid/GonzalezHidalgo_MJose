/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
/**
 *
 * @author mariajosegonzalezhidalgo
 */
import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class PedidoTest {
    
    public PedidoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Pedido.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Pedido instance = new Pedido();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Pedido.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        Pedido instance = new Pedido();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCliente_id method, of class Pedido.
     */
    @Test
    public void testGetCliente_id() {
        System.out.println("getCliente_id");
        Pedido instance = new Pedido();
        Integer expResult = null;
        Integer result = instance.getCliente_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCliente_id method, of class Pedido.
     */
    @Test
    public void testSetCliente_id() {
        System.out.println("setCliente_id");
        Integer cliente_id = null;
        Pedido instance = new Pedido();
        instance.setCliente_id(cliente_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmpleado_id method, of class Pedido.
     */
    @Test
    public void testGetEmpleado_id() {
        System.out.println("getEmpleado_id");
        Pedido instance = new Pedido();
        Integer expResult = null;
        Integer result = instance.getEmpleado_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmpleado_id method, of class Pedido.
     */
    @Test
    public void testSetEmpleado_id() {
        System.out.println("setEmpleado_id");
        Integer empleado_id = null;
        Pedido instance = new Pedido();
        instance.setEmpleado_id(empleado_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEnvio_id method, of class Pedido.
     */
    @Test
    public void testGetEnvio_id() {
        System.out.println("getEnvio_id");
        Pedido instance = new Pedido();
        Integer expResult = null;
        Integer result = instance.getEnvio_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEnvio_id method, of class Pedido.
     */
    @Test
    public void testSetEnvio_id() {
        System.out.println("setEnvio_id");
        Integer envio_id = null;
        Pedido instance = new Pedido();
        instance.setEnvio_id(envio_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaPedido method, of class Pedido.
     */
    @Test
    public void testGetFechaPedido() {
        System.out.println("getFechaPedido");
        Pedido instance = new Pedido();
        Date expResult = null;
        Date result = instance.getFechaPedido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaPedido method, of class Pedido.
     */
    @Test
    public void testSetFechaPedido() {
        System.out.println("setFechaPedido");
        Date fechaPedido = null;
        Pedido instance = new Pedido();
        instance.setFechaPedido(fechaPedido);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaEntrega method, of class Pedido.
     */
    @Test
    public void testGetFechaEntrega() {
        System.out.println("getFechaEntrega");
        Pedido instance = new Pedido();
        Date expResult = null;
        Date result = instance.getFechaEntrega();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaEntrega method, of class Pedido.
     */
    @Test
    public void testSetFechaEntrega() {
        System.out.println("setFechaEntrega");
        Date fechaEntrega = null;
        Pedido instance = new Pedido();
        instance.setFechaEntrega(fechaEntrega);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaEnvio method, of class Pedido.
     */
    @Test
    public void testGetFechaEnvio() {
        System.out.println("getFechaEnvio");
        Pedido instance = new Pedido();
        Date expResult = null;
        Date result = instance.getFechaEnvio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaEnvio method, of class Pedido.
     */
    @Test
    public void testSetFechaEnvio() {
        System.out.println("setFechaEnvio");
        Date fechaEnvio = null;
        Pedido instance = new Pedido();
        instance.setFechaEnvio(fechaEnvio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCargo method, of class Pedido.
     */
    @Test
    public void testGetCargo() {
        System.out.println("getCargo");
        Pedido instance = new Pedido();
        BigDecimal expResult = null;
        BigDecimal result = instance.getCargo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCargo method, of class Pedido.
     */
    @Test
    public void testSetCargo() {
        System.out.println("setCargo");
        BigDecimal cargo = null;
        Pedido instance = new Pedido();
        instance.setCargo(cargo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDestinatario method, of class Pedido.
     */
    @Test
    public void testGetDestinatario() {
        System.out.println("getDestinatario");
        Pedido instance = new Pedido();
        String expResult = "";
        String result = instance.getDestinatario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDestinatario method, of class Pedido.
     */
    @Test
    public void testSetDestinatario() {
        System.out.println("setDestinatario");
        String destinatario = "";
        Pedido instance = new Pedido();
        instance.setDestinatario(destinatario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDireccionDestinatario method, of class Pedido.
     */
    @Test
    public void testGetDireccionDestinatario() {
        System.out.println("getDireccionDestinatario");
        Pedido instance = new Pedido();
        String expResult = "";
        String result = instance.getDireccionDestinatario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDireccionDestinatario method, of class Pedido.
     */
    @Test
    public void testSetDireccionDestinatario() {
        System.out.println("setDireccionDestinatario");
        String direccionDestinatario = "";
        Pedido instance = new Pedido();
        instance.setDireccionDestinatario(direccionDestinatario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCiudadDestinatario method, of class Pedido.
     */
    @Test
    public void testGetCiudadDestinatario() {
        System.out.println("getCiudadDestinatario");
        Pedido instance = new Pedido();
        String expResult = "";
        String result = instance.getCiudadDestinatario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCiudadDestinatario method, of class Pedido.
     */
    @Test
    public void testSetCiudadDestinatario() {
        System.out.println("setCiudadDestinatario");
        String ciudadDestinatario = "";
        Pedido instance = new Pedido();
        instance.setCiudadDestinatario(ciudadDestinatario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRegionDestinatario method, of class Pedido.
     */
    @Test
    public void testGetRegionDestinatario() {
        System.out.println("getRegionDestinatario");
        Pedido instance = new Pedido();
        String expResult = "";
        String result = instance.getRegionDestinatario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegionDestinatario method, of class Pedido.
     */
    @Test
    public void testSetRegionDestinatario() {
        System.out.println("setRegionDestinatario");
        String regionDestinatario = "";
        Pedido instance = new Pedido();
        instance.setRegionDestinatario(regionDestinatario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCpDestinatario method, of class Pedido.
     */
    @Test
    public void testGetCpDestinatario() {
        System.out.println("getCpDestinatario");
        Pedido instance = new Pedido();
        String expResult = "";
        String result = instance.getCpDestinatario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCpDestinatario method, of class Pedido.
     */
    @Test
    public void testSetCpDestinatario() {
        System.out.println("setCpDestinatario");
        String cpDestinatario = "";
        Pedido instance = new Pedido();
        instance.setCpDestinatario(cpDestinatario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPaisDestinatario method, of class Pedido.
     */
    @Test
    public void testGetPaisDestinatario() {
        System.out.println("getPaisDestinatario");
        Pedido instance = new Pedido();
        String expResult = "";
        String result = instance.getPaisDestinatario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPaisDestinatario method, of class Pedido.
     */
    @Test
    public void testSetPaisDestinatario() {
        System.out.println("setPaisDestinatario");
        String paisDestinatario = "";
        Pedido instance = new Pedido();
        instance.setPaisDestinatario(paisDestinatario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDetallesList method, of class Pedido.
     */
    @Test
    public void testGetDetallesList() {
        System.out.println("getDetallesList");
        Pedido instance = new Pedido();
        ArrayList<Detalle> expResult = null;
        ArrayList<Detalle> result = instance.getDetallesList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDetallesList method, of class Pedido.
     */
    @Test
    public void testSetDetallesList() {
        System.out.println("setDetallesList");
        ArrayList<Detalle> detallesList = null;
        Pedido instance = new Pedido();
        instance.setDetallesList(detallesList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

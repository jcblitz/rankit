/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.blitzstein.rankit.dao;

import java.util.Collection;
import net.blitzstein.rankit.domain.Item;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import static org.junit.Assert.*;

/**
 *
 * @author jcblitz
 */
public class ItemDaoImplTest {

    private static ApplicationContext applicationContext;

    @BeforeClass
    public static void setUpClass() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext(
                new String[]{"rankit-datasources.xml"});

    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getItem method, of class ItemDaoImpl.
     */
    @Test
    public void testGetItem() {
        System.out.println("getItem");
        long itemId = 1L;
        ItemDaoImpl instance = (ItemDaoImpl) applicationContext.getBean("itemDao", ItemDaoImpl.class);
        Item result = instance.getItem(itemId);
        assertEquals(1, result.getId());
    }
}

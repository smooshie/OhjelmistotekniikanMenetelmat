/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Smoosh
 */
public class LaskuriTest {
    
    YlhaaltaRajoitettuLaskuri laskuri;
    
    public LaskuriTest() {
    }
    

    @Before
    public void setUp() {
        laskuri = new YlhaaltaRajoitettuLaskuri(3);
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void AlkuArvo() {
       assertEquals(0, laskuri.arvo());
    }
    
    @Test
    public void EteneeKerran() {
        laskuri.seuraava();
        assertEquals(1, laskuri.arvo());
    }
    
    @Test
    public void EteneeKahdesti() {
        laskuri.seuraava();
        laskuri.seuraava();
        assertEquals(2, laskuri.arvo());
    }
    
    @Test
    public void LaskuriEteneeYlarajaan() {
        laskuri.seuraava();
        laskuri.seuraava();
        laskuri.seuraava();
        assertEquals(3, laskuri.arvo());
    }
    
    @Test
    public void LaskuriYlittaaYlarajan() {
        laskuri.seuraava();
        laskuri.seuraava();
        laskuri.seuraava();
        laskuri.seuraava();
        assertEquals(0, laskuri.arvo());
    }
    
    @Test
    public void LaskuriEteneeKehdestiYliYlirajan() {
        laskuri.seuraava();
        laskuri.seuraava();
        laskuri.seuraava();
        laskuri.seuraava();
        laskuri.seuraava();
        assertEquals(1, laskuri.arvo());
    }
    
    @Test
    public void asetaArvoToimiiOikein() {
        laskuri.asetaArvo(0);
        assertEquals(0, laskuri.arvo());
        laskuri.asetaArvo(2);
        assertEquals(2, laskuri.arvo());
        laskuri.asetaArvo(3);
        assertEquals(3, laskuri.arvo());
    }
    
    @Test
    public void asetaArvoYliMenevillaLuvuilla() {
        laskuri.asetaArvo(6);
        assertEquals(0, laskuri.arvo());
        laskuri.asetaArvo(-1);
        assertEquals(0, laskuri.arvo());
    }
    
    @Test
    public void EtunollaKunAlle10() {
        laskuri.seuraava();
        assertEquals("01", laskuri.toString());
    }
    
    @Test
    public void EiEtunollaaKunYli10() {
        YlhaaltaRajoitettuLaskuri isolaskuri = new YlhaaltaRajoitettuLaskuri(15);
        isolaskuri.asetaArvo(11);
        assertEquals("11", isolaskuri.toString());        
        
    }
}

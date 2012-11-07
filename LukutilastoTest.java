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
public class LukutilastoTest {
    
    Lukutilasto tilasto;
    
    public LukutilastoTest() {
    }
    
    @Before
    public void setUp() {
        tilasto = new Lukutilasto();
    }
    
    @Test
    public void LukutilastoSummaOnNolla() {
        assertEquals(0, tilasto.summa());
    }
    
     @Test
     public void LukutilastoMaaraOnNolla() {
         assertEquals(0, tilasto.haeLukujenMaara());
     }
     
     @Test
     public void LisaaYksiLuku() {
         tilasto.lisaaLuku(5);
         assertEquals(1, tilasto.haeLukujenMaara());
     }
     
     @Test
     public void LisaaYksiLukuSumma() {
         tilasto.lisaaLuku(5);
         assertEquals(5, tilasto.summa());
     }
     
     @Test
     public void LisaaUseitaLukuja() {
          tilasto.lisaaLuku(5);
          tilasto.lisaaLuku(5);
          tilasto.lisaaLuku(5);
          assertEquals(3, tilasto.haeLukujenMaara());
     }
     
     @Test
     public void LisaaUseitaLukujaSumma() {
          tilasto.lisaaLuku(5);
          tilasto.lisaaLuku(5);
          tilasto.lisaaLuku(5);
          assertEquals(15, tilasto.summa());
     }
     
     @Test
     public void NegatiivinenLukuSumma() {
          tilasto.lisaaLuku(-5);
          assertEquals(-5, tilasto.summa());
          assertEquals(1, tilasto.haeLukujenMaara());
     }
     
     @Test
     public void Miinustus() {
          tilasto.lisaaLuku(-5);
          tilasto.lisaaLuku(5);
          assertEquals(0, tilasto.summa());
          assertEquals(2, tilasto.haeLukujenMaara());
     }
    
     @Test
     public void Keskiarvo() {
          tilasto.lisaaLuku(5);
          tilasto.lisaaLuku(5);
         double tulos = tilasto.keskiarvo();
         double odotettu = 5;
         assertEquals(odotettu, tulos, 0.001);
     }
     
     @Test
     public void NegatiivinenKeskiarvo() {
          tilasto.lisaaLuku(2);
          tilasto.lisaaLuku(-4);
         double tulos = tilasto.keskiarvo();
         double odotettu = -1;
         assertEquals(odotettu, tulos, 0.001);
     }
}

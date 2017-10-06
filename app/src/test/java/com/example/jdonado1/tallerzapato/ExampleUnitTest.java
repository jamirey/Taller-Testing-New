package com.example.jdonado1.tallerzapato;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void probarMasculinoZapatillaNike(){

        double ve=120000;

        double vr = Metodo.Texting(0,0,0);

        assertEquals(ve,vr,0);

   }
    @Test
    public void probarMasculinoZapatillaAdidas(){

        double ve=140000;

        double vr = Metodo.Texting(0,0,1);

        assertEquals(ve,vr,0);

    }
    @Test
    public void probarMasculinoZapatillaPuma(){

        double ve=130000;

        double vr = Metodo.Texting(0,0,2);

        assertEquals(ve,vr,0);

    }
    public void probarMasculinoClasicoNike(){

        double ve=50000;

        double vr = Metodo.Texting(0,1,0);

        assertEquals(ve,vr,0);

    }
    public void probarMasculinoClasicoAdidas(){

        double ve=80000;

        double vr = Metodo.Texting(0,1,1);

        assertEquals(ve,vr,0);

    }
    public void probarMasculinoClasicoPuma(){

        double ve=100000;

        double vr = Metodo.Texting(0,1,2);

        assertEquals(ve,vr,0);

    }
    public void probarFemeninoZapatillaNike(){

        double ve=100000;

        double vr = Metodo.Texting(1,0,0);

        assertEquals(ve,vr,0);

    }
    public void probarFemeninoZapatillaAdidas(){

        double ve=130000;

        double vr = Metodo.Texting(1,0,1);

        assertEquals(ve,vr,0);

    }
    public void probarFemeninoZapatillaPuma(){

        double ve=110000;

        double vr = Metodo.Texting(1,0,2);

        assertEquals(ve,vr,0);

    }
    public void probarFemeninoClasicoNike(){

        double ve=60000;

        double vr = Metodo.Texting(1,1,0);

        assertEquals(ve,vr,0);

    }
    public void probarFemeninoClasicoAdidas(){

        double ve=70000;

        double vr = Metodo.Texting(1,1,1);

        assertEquals(ve,vr,0);

    }
    public void probarFemeninoClasicoPuma(){

        double ve=120000;

        double vr = Metodo.Texting(1,1,2);

        assertEquals(ve,vr,0);

    }


}
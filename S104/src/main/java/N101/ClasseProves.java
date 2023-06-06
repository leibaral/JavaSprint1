package N101;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
public class ClasseProves {
    @Test
    public void prova12Mesos(){
        ArrayList<String> llista = new CreaLlistaMesos().creaMesos();
        int totalMesos = llista.size();
        assertEquals(12, totalMesos);
    }

    @Test
    public void provaNotNull(){
        ArrayList<String> llista = new CreaLlistaMesos().creaMesos();
        assertNotNull(llista);
    }

    @Test
    public void prova8isAgost(){
        ArrayList<String> llista = new CreaLlistaMesos().creaMesos();
        assertEquals("Agost", llista.get(7));
    }

}

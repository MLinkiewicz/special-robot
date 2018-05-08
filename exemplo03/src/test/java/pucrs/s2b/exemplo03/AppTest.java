package pucrs.s2b.exemplo03;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest 

{
	
	@Test
	public void testFiveAndFiveGivesExame()
    {
        String expected = "Em exame";
		String actual = Medias.calcular(5.0, 5.0);
        assertEquals(expected, actual);
    }
	
	@Test
	public void testSevenAndSevenGivesApproved()
    {
        String expected = "Aprovado";
		String actual = Medias.calcular(7.0, 7.0);
        assertEquals(expected, actual);
    }
	
	@Test
	public void testTriAndTriGivesRep()
    {
        String expected = "Reprovado";
		String actual = Medias.calcular(3.0, 3.0);
        assertEquals(expected, actual);
    }
}

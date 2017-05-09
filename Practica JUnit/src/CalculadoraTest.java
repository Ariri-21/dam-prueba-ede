import static org.junit.Assert.*;

import org.junit.*;

public class CalculadoraTest {
	
	static Calculadora c;
	
	@Before
	public void setUpBefore(){
		c = new Calculadora();	
		System.out.println("setUpBefore");
	}

	
	@BeforeClass
	public static void setUpBeforeClass(){	
		System.out.println("BeforeClass");
	}
	
	
	@Test
	public void sumarTest(){
		
		double valorEsperado = 4.0;
		double valorReal = c.suma(2, 2);
		
		assertEquals(valorEsperado, valorReal, 0.001) ;
		System.out.println("sumarTest");
	}
	
	@Test
	public void restaTest(){
		double valorEsperado = 4.0;
		double valorReal = c.resta(6, 2);
		
		assertEquals(valorEsperado, valorReal, 0.001) ;
		System.out.println("restarTest");
	}
	
	@Test
	public void multiplicacionTest(){
		double valorEsperado = 4.0;
		double valorReal = c.multiplicacion(2, 2);
		
		assertEquals(valorEsperado, valorReal, 0.001) ;
		System.out.println("multiplicarTest");
	}
	
	@Test
	public void divisionTest(){
		double valorEsperado = 4.0;
		double valorReal = c.division(8, 2);
		
		assertEquals(valorEsperado, valorReal, 0.001) ;
		System.out.println("dividirTest");
	}
	
	@After
	public void setUpAfter(){
		c = new Calculadora();	
		System.out.println("setUpAfter");
	}
	
	@AfterClass
	public static void setUpAfterClass(){
		c=null;
		System.out.println("setUpAfterClass");
	}
	
	
	
}

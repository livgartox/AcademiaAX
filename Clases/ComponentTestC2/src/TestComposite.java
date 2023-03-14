import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestComposite {

	@Test
	void testA() {
		double d1=5.0;
		assertEquals(d1,5.0);
	}
	
	@Test
	void testB() {
		double d1=5.0;
		double d2=4.0;
		assertEquals(d1+d2,9.0);
	}
	
	@Test
	void testLeaf() {
		double d=6.0;
		Component c1=new LeafConstante(d);
		assertEquals(d,c1.getValor());
	}
	
	@Test
	void testLeaf2() {
		double d1=6.0;
		double d2=8.0;
		Component c1=new LeafConstante(d1);
		Component c2=new LeafConstante(d2);
		assertEquals(d1,c1.getValor());
		assertEquals(d2,c2.getValor());
	}
	
	@Test
	void testSuma() {
		double d1=6.0;
		double d2=8.0;
		Component c1=new LeafConstante(d1);
		Component c2=new LeafConstante(d2);
		
		Component suma=new SumaComponent(c1,c2);
		assertEquals(suma.getValor(),d1+d2);
	}
	
	@Test
	void testRestaa() {
		double d1=6.0;
		double d2=8.0;
		Component c1=new LeafConstante(d1);
		Component c2=new LeafConstante(d2);
		
		Component resta=new RestaComponent(c1,c2);
		assertEquals(resta.getValor(),d1-d2);
	}
	
	@Test
	void testMulti() {
		double d1=6.0;
		double d2=8.0;
		Component c1=new LeafConstante(d1);
		Component c2=new LeafConstante(d2);
		
		Component multi=new MultiComponent(c1,c2);
		assertEquals(multi.getValor(),d1*d2);
	}
	
	@Test
	void testDiv() {
		double d1=6.0;
		double d2=8.0;
		Component c1=new LeafConstante(d1);
		Component c2=new LeafConstante(d2);
		
		Component div=new DivComponent(c1,c2);
		assertEquals(div.getValor(),d1/d2);
	}
	
	@Test
	void testComplejo1() {
		Component com=new MultiComponent(
                new DivComponent(
                        new LeafConstante(2.8),
                        new RestaComponent(
                                new MultiComponent(
                                        new LeafConstante(5.8),
                                        new LeafConstante(6.8)),
                                new LeafConstante(1.8))),
                new SumaComponent(new MultiComponent(new LeafConstante(3.8),
                        new RestaComponent(
                                new LeafConstante(4.8),
                                new LeafConstante(8.8))),
                        new DivComponent(new LeafConstante(7.8),
                                new LeafConstante(9.8)))
        );
		
		assertEquals(com.getValor(),-1.07,0.1);
	}

	

}

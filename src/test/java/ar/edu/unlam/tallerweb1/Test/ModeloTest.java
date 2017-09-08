package ar.edu.unlam.tallerweb1.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;
import ar.edu.unlam.tallerweb1.SpringTest;
import ar.edu.unlam.tallerweb1.modelo.Barrio;
import ar.edu.unlam.tallerweb1.modelo.Direccion;
import ar.edu.unlam.tallerweb1.modelo.Farmacia;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.junit.Before;
import org.junit.Test;

 

public class ModeloTest extends SpringTest{
	
	private Farmacia farmacia1,farmacia2,farmacia3;
	private Session session;
	private List<Farmacia> misFarmacias;
	private Direccion direccion1,direccion2,direccion3;
	private Barrio barrio1,barrio2;

	@Before
	public void inicializacionAntesDeCadaTest(){			
		farmacia1 = new Farmacia();
		farmacia2 = new Farmacia();
		farmacia3 = new Farmacia();		
		direccion1=new Direccion();
		direccion2=new Direccion();
		direccion3=new Direccion();
		misFarmacias = new ArrayList<Farmacia>();
		session = getSession();	
		barrio1 =new Barrio();
		barrio2 =new Barrio();
	
	}	

@Test
@Transactional
@Rollback(true)
	public void test1() { //Hacer un Test que busque todas las farmacias de turno los dias martes
	
	farmacia1.setNombre("Farmacity");
	farmacia2.setNombre("Dr Ahorro");
	farmacia3.setNombre("CruzVerde");
	
	farmacia1.setDiaDeTurno("Martes");
	farmacia2.setDiaDeTurno("Lunes");
	farmacia3.setDiaDeTurno("Jueves");
	

	session.save(farmacia1);
	session.save(farmacia2);
	session.save(farmacia3);
	 
	misFarmacias =session.createCriteria(Farmacia.class).add(Restrictions.eq("diaDeTurno", "Martes")).list();
	
	assertThat(misFarmacias).hasSize(1);	

	
	}


@Test
@Transactional
@Rollback(true)
public void test2() { //Hacer un Test que busque todas las farmacias de una calle
	
	farmacia1.setNombre("Farmacity");
	farmacia2.setNombre("Dr Ahorro");
	farmacia3.setNombre("CruzVerde");
	
	
	direccion1.setCalle("Almafuerte");
	direccion1.setNumero("1234");

	direccion2.setCalle("Almafuerte");
	direccion2.setNumero("1235");

	direccion3.setCalle("Concordia");
	direccion3.setNumero("1236");
	
	
	farmacia1.setDireccion(direccion1);
	farmacia2.setDireccion(direccion2);
	farmacia3.setDireccion(direccion3);
	
	

	session.save(farmacia1);
	session.save(farmacia2);
	session.save(farmacia3);
	session.save(direccion1);
	session.save(direccion2);
	session.save(direccion3);
	
	
	 
	misFarmacias =session.createCriteria(Farmacia.class).createAlias("direccion","d").add(Restrictions.eq("d.calle", "Almafuerte")).list();
	
	assertThat(misFarmacias).hasSize(2);	

	
	}



@Test
@Transactional
@Rollback(true)
public void test3() { //Hacer un Test que busque todas las farmacias de un barrio
	
	
	
	farmacia1.setNombre("Farmacity");
	farmacia2.setNombre("Dr Ahorro");
	farmacia3.setNombre("CruzVerde");
	
	
	direccion1.setCalle("Haiti");
	direccion2.setCalle("Haiti");
	direccion3.setCalle("Almafuerte");
	
	farmacia1.setDireccion(direccion1);
	farmacia2.setDireccion(direccion2);
	farmacia3.setDireccion(direccion3);
	
	barrio1.setNombre("Floresta");
	barrio2.setNombre("San Telmo");
	
	
	direccion1.setBarrio(barrio1);
	direccion2.setBarrio(barrio1);
	direccion3.setBarrio(barrio2);
	
	session.save(farmacia1);
	session.save(farmacia2);
	session.save(farmacia3);
	session.save(direccion1);
	session.save(direccion2);
	session.save(direccion3);
	session.save(barrio1);
	session.save(barrio2);
	
	
	 
	misFarmacias =session.createCriteria(Farmacia.class).createAlias("direccion","d").createAlias("d.barrio","b").add(Restrictions.eq("b.nombre", "Floresta")).list();
	
	assertThat(misFarmacias).hasSize(2);	

	
	}


}

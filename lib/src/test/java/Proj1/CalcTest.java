package Proj1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class CalcTest {
	
	@Mock
	private CalcDAO calcDao;
	
	
	public CalcTest() {
		super();
		// TODO Auto-generated constructor stub
		
	}


@BeforeEach
public void beforeEach()
{
MockitoAnnotations.initMocks(this);
} 
 
	private CalcServiceImpl service  = new CalcServiceImpl();
	
	@Test
	public void testAdd() {
	when(calcDao.addNumbers(3, 4)).thenReturn(7);
	assertEquals(service.addNumbers(3,4),7);
	
		
	}

}

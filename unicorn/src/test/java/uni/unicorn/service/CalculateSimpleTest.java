package uni.unicorn.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import uni.unicorn.model.Calculator;

class CalculateSimpleTest {
	

	@Test
	void testAdd() {
		
		Calculator cm = mock( Calculator.class);
		
		CalculateSimple cs = new CalculateSimple();
		cm.setOperandR(4.0);
		cm.setOperandL(6.0);
		when(cs.add(cm)).thenReturn(10.0);	
		assertEquals(cs.add(cm), 10.0);
	}

	@Test
	void testSubtract() {
		
		Calculator cm = mock( Calculator.class);
		CalculateSimple cs = new CalculateSimple();
		
		when(cm.getOperandL()).thenReturn(6.0);	
		when(cm.getOperandR()).thenReturn(5.0);
		assertEquals(cs.subtract(cm), 1.0);
	}

	@Test
	void testMultiply() {
		
		Calculator cm = mock( Calculator.class);
		
		CalculateSimple cs = new CalculateSimple();
		cm.setOperandR(6.0);
		cm.setOperandL(6.0);
		when(cm.getOperandL()).thenReturn(6.0);	
		when(cm.getOperandR()).thenReturn(6.0);
		assertEquals(cs.multiply(cm), 36.0);
	}

	@Test
	void testDivide() {
		Calculator cm = mock( Calculator.class);
		CalculateSimple cs = new CalculateSimple();
		
		cm.setOperandR(18.0);
		cm.setOperandL(6.0);
		when(cm.getOperandL()).thenReturn(18.0);	
		when(cm.getOperandR()).thenReturn(6.0);
		assertEquals(cs.divide(cm), 3.0);
		
		cm.setOperandR(18.0);
		cm.setOperandL(0.0);
		when(cm.getOperandL()).thenReturn(18.0);	
		when(cm.getOperandR()).thenReturn(0.0);
		assertEquals(cs.divide(cm), 0.0);
		
		cm.setOperandR(0.0);
		cm.setOperandL(6.0);
		when(cm.getOperandL()).thenReturn(0.0);	
		when(cm.getOperandR()).thenReturn(6.0);
		assertEquals(cs.divide(cm), 0.0);
	}

	@Test
	void testClearSimple() {
		Calculator cm = mock( Calculator.class);
		CalculateSimple cs = new CalculateSimple();
		
		
	}

}

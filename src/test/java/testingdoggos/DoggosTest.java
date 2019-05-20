package testingdoggos; 

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import Doggos.Doggos;

public class DoggosTest {
	Doggos doggosRefVar = new Doggos();
	
	@Test
	public void testNumber1() {
		List<String> doggoArrayReturned= new ArrayList<>();
		doggoArrayReturned = doggosRefVar.listNonDoggoPos(61);
	
		assertFalse(doggoArrayReturned.contains("61st"));
	}
	
	@Test
	public void testNumber2() {
		List<String> doggoArrayReturned= new ArrayList<>();
		doggoArrayReturned = doggosRefVar.listNonDoggoPos(13);
	
		assertFalse(doggoArrayReturned.contains("13th"));
	}
	@Test
	public void testNumber3() {
		List<String> doggoArrayReturned= new ArrayList<>();
		doggoArrayReturned = doggosRefVar.listNonDoggoPos(11);
	
		assertFalse(doggoArrayReturned.contains("11th"));
	}
	@Test
	public void testNumber4() {
		List<String> doggoArrayReturned= new ArrayList<>();
		doggoArrayReturned = doggosRefVar.listNonDoggoPos(7);
	
		assertFalse(doggoArrayReturned.contains("7th"));
	}
	@Test
	public void testNumber5() {
		List<String> doggoArrayReturned= new ArrayList<>();
		doggoArrayReturned = doggosRefVar.listNonDoggoPos(1);
	
		assertFalse(doggoArrayReturned.contains("1st"));
	}
	@Test
	public void testNumber6() {
		List<String> doggoArrayReturned= new ArrayList<>();
		doggoArrayReturned = doggosRefVar.listNonDoggoPos(10);
	
		assertFalse(doggoArrayReturned.contains("10th"));
	}
	@Test
	public void testNumber7() {
		List<String> doggoArrayReturned= new ArrayList<>();
		doggoArrayReturned = doggosRefVar.listNonDoggoPos(20);

		assertFalse(doggoArrayReturned.contains("20th"));
	}
}

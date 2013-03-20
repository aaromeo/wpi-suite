/**
 * 
 */
package edu.wpi.cs.wpisuitetng.modules.RequirementManager.models;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Tests the jSON conversion functions and all the getters and setters
 * 
 * @author Benjamin Senecal
 */
public class RequirementTest {

	@Test
	  public void jSONConversionTests() {
	    Requirement object = new Requirement(4, "Test",
	        "1.1.01", RequirementStatus.NEW , RequirementPriority.MEDIUM, "A test", 1, 10);
	    Requirement origObject = object;  // change here
	    String jsonMessage = object.toJSON();
	    Requirement newObject = Requirement.fromJson(jsonMessage);  // change here...
	    assertTrue(newObject instanceof Requirement);
	    assertEquals(origObject.getId(), 4);
	    assertEquals(origObject.getName(), "Test");
	    assertEquals(origObject.getRelease(), "1.1.01");
	    assertEquals(origObject.getStatus(), RequirementStatus.NEW);
	    assertEquals(origObject.getPriority(), RequirementPriority.MEDIUM);
	    assertEquals(origObject.getDescription(), "A test");
	    assertEquals(origObject.getEstimate(), 1);
	    assertEquals(origObject.getEffort(), 10);
	}
}

package edu.wpi.cs.wpisuitetng.modules;

import java.lang.String;

/**
 * Model : The interface for all data models. Prototypes methods for model handling
 * 		and serializing.
 * @author twack
 *
 */
public interface Model {

	/* database interaction */
	public void save();
	public void delete();
	
	/* serializing */
	
	/** toJSON : serializing this Model's contents into a JSON/GSON string
	 * @return	A string containing the serialized JSON representation of this Model.
	 */
	public String toJSON();
	
	/* Built-in overrides/overloads */
	
	/** toString : enforce an override. May simply call serializeToJSON.
	 * @return	The string representation of this Model
	 */
	public String toString();
	
	/**
	 * identify: true if the argument o is equal this object's unique identifier or this object
	 * this method was created for use with the mock database
	 * 
	 * implementations overriding this method should check if o is either a unique identifier, or an instance of this class
	 * if o is an instance of this class, this method should check if it contains the same unique identifier
	 * 
	 * @param o - a unique identifier belonging to an object
	 * @return true if the o is equal to this Model's unique identifier, else false
	 */
	public Boolean identify(Object o);
}
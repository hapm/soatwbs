package fhbrs.soa.teamwork.fhbuchen;

/**
 * Describes the reviewing status of a relation.
 * 
 * @author Markus 
 */
public enum RelationStatus {
	/**
	 * Automatically generated relation that needs to be checked.
	 */
	Unchecked,
	
	/**
	 * A user created relation, or a relation automatically created and checked by a user.
	 */
	Checked,
	
	/**
	 * A checked relation, that was double checked by a second reviewer.
	 */
	DoubleChecked
}

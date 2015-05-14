/**
 *
 */

package infrastructurelibrary.core.abstractions.relationships;

/**
 * Associations
 * <ul>
 * <li>source: Element [1..*]</li>
 * Specifies the sources of the DirectedRelationship. Subsets
 * Relationship::relatedElement. This is a derived union.
 * <li>target: Element [1..*]</li>
 * Specifies the targets of the DirectedRelationship. Subsets
 * Relationship::relatedElement. This is a derived union.
 * </ul>
 *
 * @author oalpha
 *
 */
public interface DirectedRelationship extends Relationship {

  //

}
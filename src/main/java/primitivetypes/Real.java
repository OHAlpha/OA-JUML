/**
 *
 */

package primitivetypes;

import oalpha.OAlpha;


/**
 * @author oalpha
 *
 */
@SuppressWarnings( "javadoc" )
public interface Real extends Comparable< Real > {
  
  @OAlpha
  @SuppressWarnings( "unused" )
  static Real valueOf( double d ) {
    
    // TODO: Real.valueOf( double )
    return null;
  }
  
  @OAlpha
  @SuppressWarnings( "unused" )
  static Real valueOf( float f ) {
    // TODO: Real.valueOf( float )
    return null;
  }
  
  @OAlpha
  double doubleValue();
  
  @OAlpha
  float floatValue();
  
}
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
public interface UnlimitedNatural extends Comparable< UnlimitedNatural > {

  @OAlpha
  static UnlimitedNatural infinty() {
    
    // TODO: UnlimitedNatural.infinity()
    return null;
  }
  
  @OAlpha
  @SuppressWarnings( "unused" )
  static UnlimitedNatural valueOf( int i ) {
    
    // TODO: UnlimitedNatural.valueOf( int )
    return null;
  }
  
  @OAlpha
  @SuppressWarnings( "unused" )
  static UnlimitedNatural valueOf( long i ) {
    // TODO: UnlimitedNatural.valueOf( long )
    return null;
  }
  
  @OAlpha
  int compareToInteger( Integer i );
  
  @OAlpha
  java.lang.Integer intValue();
  
  @OAlpha
  boolean isInfinite();
  
  @OAlpha
  Long longValue();
  
  @OAlpha
  Integer toInteger();
  
}
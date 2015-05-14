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
public interface Integer extends Comparable< Integer > {
  
  @OAlpha
  @SuppressWarnings( "unused" )
  static Integer valueOf( int i ) {

    // TODO: Integer.valueOf( int )
    return null;
  }
  
  @OAlpha
  @SuppressWarnings( "unused" )
  static Integer valueOf( long l ) {

    // TODO: Integer.valueOf( long )
    return null;
  }
  
  @OAlpha
  int compareToNatural( UnlimitedNatural n );
  
  @OAlpha
  int intValue();
  
  @OAlpha
  long longValue();
  
  @OAlpha
  UnlimitedNatural toNatural();

}
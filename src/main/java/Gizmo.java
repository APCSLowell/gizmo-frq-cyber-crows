public class Gizmo
{
  private String maker;
  private boolean isElec;
  
  /** Returns the name of the manufacturer of this Gizmo. */
  public String getMaker()
  {
    return maker;
  }

   public boolean isElectronic()
  {
    return isElec;
  }
  /** Returns true if this Gizmo is electronic, and false
  * otherwise.
  */

  public int countElectronicsByMaker(String maker){
  int count=0; 
    for(int i=0;i<purchases.size();i++){
      if(purchases.getMaker().equals(maker) && purchases.isElectronic())
        count++; 
    }
  return count; 
  }
  
  public boolean hasAdjacentEqualPair(){
    if(purchases.size()<2)
      return true; 
    for(int i=0; i<purchases.size()-1;i++){
      if(purchases.get(i).equals(purchases.get(i+1)))
        return true; 
    }
    return false; 
    
  }
 
  /** Returns true if this Gizmo is equivalent to the Gizmo
  * object represented by the
  * parameter, and false otherwise.
  */
  public boolean equals(Object other)
  {
    boolean sameMaker = maker.equals(((Gizmo)other).getMaker());
    boolean bothElec = isElec == ((Gizmo)other).isElectronic();
    return sameMaker && bothElec;
  }
  public Gizmo(String s, boolean e)
  {
    maker = s;
    isElec = e;
  }
}

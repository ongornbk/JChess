
package Pawns;

import Players.PlayerColor;


public interface IPawn {

   public PawnType GetType();

   public PlayerColor GetColor();

   public void Render();

}

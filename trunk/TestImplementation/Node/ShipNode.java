/**
@author Marc Antoine Gosselin-Lavigne
@author Jared Hanson
@date October 8, 2011
*/

public class ShipNode{
	private int col;
	private char row;
	private boolean isHit = false;

	/**@param int xIn x coordinate of the ShipNode as an integer
	@param char yIn y coordinate of the ShipNode as a char*/
	public ShipNode(int xIn, char yIn){
		col = xIn;
		row = yIn;
		isHit = false;
	}

	/**@param colIn the X-coordinate of the cell that we are checking
	@param the Y-coordinate of the cell that we are checking
	@return true if this ShipNode is at the position specified by the argument Node*/
	public boolean isAt(int colIn, int rowIn){
		if ((this.col == colIn) && (this.row == rowIn))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public int getCol()
	{
		return col;
	}
	
	public char getRow()
	{
		return row;
	}

	/**@return whether or not the ship node has been hit by the opposite player*/
	public boolean hasBeenHit()
	{
		return isHit;
	}
}

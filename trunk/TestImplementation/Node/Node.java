/**@author Marc Antoine Gosselin-Lavigne
@date October 8, 2011*/

public class Node{
	private int col;
	private char row;
	private boolean isHit = false;

	/**@param int xIn x coordinate of the ship node as an integer
	@param char yIn y coordinate of the ship node as a char*/
	public Node(int xIn, char yIn){
		col = xIn;
		row = yIn;
		isHit = false;
	}

	/**@param Node other checks if this node is at the position specified by a Node object
	@return true if this Node is at the position specified by the argument Node*/
	public boolean isAt(Node other){
		if ((this.col == other.col) && (this.row == other.row))
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
	public boolean hasBeenHit(){
		return isHit;
	}
}

/**
@author Marc Antoine Gosselin-Lavigne
@date October 8, 2011
*/

public class Ship{

	protected String name;
	protected int numNodes;
	protected Node[] shipNodes;
	
	public Ship(int xStart, int xEnd, char yStart, char yEnd)
	{
		if(xStart == xEnd){
			numNodes = yEnd - yStart;
			shipNodes = new Node[numNodes];
			for(int i = 0; i < numNodes; i++){
				shipNodes[i] = new Node(xStart, yStart);
				yStart++;
			}
		}
		else if(yStart == yEnd){
			numNodes = xEnd - xStart;
			shipNodes = new Node[numNodes];
			for(int i = 0; i < numNodes; i++) shipNodes[i] = new Node(xStart + i, yStart);
		}
	}
		
	/**@return returns true if every node on the ship has been hit, false otherwise*/
	public boolean isSunk()
	{
		int i = 0;
		for(int j = 0; j < numNodes; j++){
			if(shipNodes[i].hasBeenHit()) i++;
		}
		if (i >= numNodes)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	/**@param xIn x coordinate of the location we are checking
	@param yIn y coordinate of the location we are checking
	@return Two battleship protocol Strings, the first meant for the client of the
	* player calling this method, the second meant for the other client. The String
	* tells the client if the coordinates passed in where a hit or not*/
	public String[] isHit(int xIn, char yIn)
	{
		String allyStr = new String();
		String enemyStr = new String();

		allyStr = allyStr + yIn + xIn + ",";

		boolean isAHit = false;
		for(int i = 0; i < numNodes; i++){
			if(shipNodes[i].hasBeenHit()) isAHit = true;
		}

		if(isAHit){
			if(this.isSunk()){
				allyStr = allyStr + "sunk " + this.toString();
				enemyStr = enemyStr + "sunk " + this.toString();
			}
			else{
				allyStr = allyStr + "hit";
				enemyStr = enemyStr + "hit";
			}
		}
		else{
			allyStr = allyStr + "miss";
			enemyStr = enemyStr + "miss";
		}
		String[] strArr = new String[2];
		strArr[0] = allyStr;
		strArr[1] = enemyStr;
		return strArr;
	}

	/**@return the kind of ship, as a two letter String*/
	public String getName()
	{
		return name;
	}
}

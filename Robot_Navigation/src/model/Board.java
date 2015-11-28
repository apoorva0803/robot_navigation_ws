package model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * POJO containing board details
 * @author apoorva
 *
 */
public class Board{

	static Board boardInstance = null;
	
	public static Board getBoardInstance(){
		if(boardInstance == null)
			boardInstance = new Board();
		
		return boardInstance;
	}
	
	Coordinates goal;
	Coordinates start;
	Map<Integer,List<Coordinates>> obstacleMap;
	boolean isFileOpen = false;
	
	
	public Coordinates getGoal() {
		return goal;
	}
	public void setGoal(Coordinates goal) {
		this.goal = goal;
	}
	public Coordinates getStart() {
		return start;
	}
	public void setStart(Coordinates start) {
		this.start = start;
	}
	public Map<Integer, List<Coordinates>> getObstacleMap() {
		return obstacleMap;
	}
	public void setObstacleMap(Integer key, List<Coordinates> value) {
		if(obstacleMap == null)
			obstacleMap= new HashMap<Integer, List<Coordinates>>();
		
		obstacleMap.put(key, value);
	}
	public boolean isFileOpen() {
		return isFileOpen;
	}
	public void setFileOpen(boolean isFileOpen) {
		this.isFileOpen = isFileOpen;
	}
	
}

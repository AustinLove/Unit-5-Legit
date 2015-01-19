
package unit.pkg5;

import java.util.ArrayList;
public class LinkedPriorityQueue implements PriorityQueue{
	private ArrayList list[];
	private int size;
	
	public LinkedPriorityQueue(int s){
		size = s;
		list = new ArrayList[size];
		for(int x = 0; x<size;x++){
			list[x] = new ArrayList();
		}
	}
	
	

	public Object dequeue() {
		if(!list[0].isEmpty())return list[0].remove(0);
		else if(!list[1].isEmpty())return list[1].remove(0);
		else if(!list[2].isEmpty())return list[2].remove(0);
		else throw new IllegalStateException("Stack is empty");
	}

	public void enqueue(Object obj) {
		throw new IllegalStateException("Must give a priority");
	}

	public int size() {
		return list.length;
	}

	public void enqueue(Object obj, int i) {
		list[i].add(obj);
	}
	public int queueSize(int i){
		return list[i].size();
	}
	public boolean hasData(){
		for(int i = 0;i<size;i++){
			if(queueSize(i)>0)return true;
		}
		return false;
	}

    @Override
    public Object peekFront() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
}
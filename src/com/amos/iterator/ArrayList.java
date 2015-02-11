package com.amos.iterator;

public class ArrayList<T> implements Collection{
	Object[] objs = new Object[10];
	int index =0;
	public void add(Object o){
		if(index==objs.length){
			Object[] newObjs = new Object[objs.length*2];
			System.arraycopy(objs, 0, newObjs, 0, objs.length);
			
			objs = newObjs;
		}

		objs[index] = o;
		
		index++;
	}
	
	public int size(){
		return index;
	}

	@Override
	public Object get(int i) {
		return objs[i];
	}
	
	public Iterator<T> iterator(){
		return new ArrayListIterator<T>();
	}
	
	private class ArrayListIterator<T> implements Iterator<T>{
		
		int currentIndex=0;
		
		@Override
		public boolean hasNext() {
			if(currentIndex<index){
				return true;
			}
			return false;
		}

		@Override
		public T next() {
			T o = (T) objs[currentIndex];
			currentIndex++;
			return o;
		}
	}
}
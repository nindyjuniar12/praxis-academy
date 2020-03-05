 
class Genericsclass<T> 
{ 

	T obj; 
	Genericsclass(T obj) { this.obj = obj; } 
	public T getObject() { return this.obj; } 
} 


class Main 
{ 
	public static void main (String[] args) 
	{ 
	 
		Genericsclass <Integer> iObj = new Genericsclass<Integer>(15); 
		System.out.println(iObj.getObject()); 

		Genericsclass <String> sObj = new Genericsclass(obj)<String>("GeeksForGeeks"); 
		System.out.println(sObj.getObject()); 
	} 
}

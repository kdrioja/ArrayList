/*
* ArrayList Class
* Implemented by Kenia Rioja
* */

public interface BareBonesArrayList <E>{
    public abstract void add(E a); //Used to add to the end of the list
    public abstract void add(E a, int index); //Overloaded method to add at specified index
    public abstract E remove(int index); //Removes the data at specified index
    public abstract E get(int index); //Return the data at index
    public abstract void set(E a, int index); //Updates the value of the specified index
    public abstract int getSize(); //Returns number of elements
    public abstract int indexOf(E a); //Returns the index of the given data
}

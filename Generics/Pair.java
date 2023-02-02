/*********************************************
 * This Generic class swaps two values
 * author: Ranaelle
 *version 17.0.1
 * @param <T>
 *********************************************/
public class Pair<T>{

    private T first;
    private T second;

    /* parameterized constructor
       to initialize the fields
     */
    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    /*
      this method returns the object's field called first
     */

    public T getFirst() {
        return first;
    }

    /*
    this method returns the object's field called second
     */

    public T getSecond() {
        return second;
    }

    /*
    this method swaps the object's fields values
     */
    public void swap(){
        T intermediate = this.first;
        this.first = this.second;
        this.second = intermediate;


    }
}

/**
 * Interface for a queue: a collection of elements that are inserted
 * and removed according to the first-in first-out principle.
 */
public interface Queue<T> {

  /**
   * Inserts an element at the rear of the queue.
   * @param e  the element to be inserted
   */
  void enqueue(T e);

  /**
   * Removes and returns the first element of the queue.
   * @return element removed (or null if empty)
   */
  T dequeue();

  /**
   * Returns the number of elements in the queue.
   * @return number of elements in the queue
   */
  int size();

  /**
   * Tests whether the queue is empty.
   * @return true if the queue is empty, false otherwise
   */
  boolean isEmpty();


  /**
   * Returns, but does not remove, the first element of the queue.
   * @return the first element of the queue (or null if empty)
   */
  T first();

}

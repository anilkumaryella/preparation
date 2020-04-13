package topic;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer> q = new PriorityQueue<>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		q.add(6);
		q.add(7);
		q.add(8);
		q.add(9);
		q.add(10);

		Iterator<Integer> itr = q.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next());
		}
		for (int i = 0; i < 2; i++) {
			q.poll();
			
		}
		for (int i = 0; i < 2; i++) {
			q.add(i);
			
		}
		System.out.println();
		Iterator<Integer> it = q.iterator();
		while (it.hasNext()) {
			System.out.print(it.next());
		}
	}

}

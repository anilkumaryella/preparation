package topic;

@FunctionalInterface
public interface FunInterface {

	public void add();

	public default void sub() {

	};

	public default void sub1() {

	};
}

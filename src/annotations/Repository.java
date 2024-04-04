package annotations;

public class Repository<T> {

	public void save(T t) {
		System.out.println(t);
	}
}
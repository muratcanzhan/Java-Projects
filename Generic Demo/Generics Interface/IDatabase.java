public interface IDatabase<T> {

    boolean insert(T data);

    boolean delete(T data);

    boolean update(T data);

    public T select();

}



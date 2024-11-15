package Solutions;

public class Pair<K, V> {
    private final K key;
    private final V value;

    // Constructor
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    // Getter methods
    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    // ToString method for easy printing
    @Override
    public String toString() {
        return "Pair{" + "key=" + key + ", value=" + value + '}';
    }

    public static void main(String[] args) {
        // Example usage
        Pair<Integer, String> pair = new Pair<>(1, "One");
        System.out.println(pair);  // Output: Pair{key=1, value=One}
    }
}

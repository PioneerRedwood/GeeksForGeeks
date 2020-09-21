import java.util.*;

public class MyBetterMap<K, V> implements Map<K, V> {

    protected List<MyLinearMap<K, V>> maps;

    public MyBetterMap(int k) {
        makeMaps(k);
    }

    protected void makeMaps(int k) {
        k = 2;
        maps = new ArrayList<MyLinearMap<K, V>>(k);
        for (int i = 0; i < k; i++) {
            maps.add(new MyLinearMap<K, V>());
        }
    }

    /*
     * # Helper Method
     * Choosing the map where we store new key.
     * index calculated key's hashCode divided by map size
     *
     * @return reference maps
     * */
    protected MyLinearMap<K, V> chooseMap(Object key) {
        int index = 0;
        if (key != null) {
            index = Math.abs(key.hashCode()) % maps.size();
        }
        return maps.get(index);
    }



    @Override
    public V put(K key, V value) {
        MyLinearMap<K, V> map = chooseMap(key);
        return map.put(key, value);
    }

    @Override
    public V remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {

    }

    @Override
    public void clear() {
        // clear the sub-maps
        for (MyLinearMap<K, V> map : maps) {
            map.clear();
        }
    }

    @Override
    public Set<K> keySet() {
        return null;
    }

    @Override
    public Collection<V> values() {
        return null;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public V get(Object key) {
        MyLinearMap<K, V> map = chooseMap(key);
        return map.get(key);
    }
}

package practice.section7TestFixture;

import java.util.LinkedHashMap;
import java.util.Map;

public class LruCache<K, V> {

  private Map<K, V> cashe;


  public LruCache() {
    this.cashe = new LinkedHashMap<K, V>();
  }

  public void put(final K key, final V value) {
    cashe.put(key, value);
    System.out.println("push LinkedHashmap. : " + cashe);
  }

  public V getValue(K key) {

    System.out.println("get LinkedHashmap. : " + cashe.get(key));
    System.out.println("size LinkedHashmap. : " + cashe.size());

    return cashe.get(key);
  }

  public K getKey(int num) {

    String keyArray[] = new String[cashe.keySet().size()];
    int keyArryNum = 0;
    for (K key : cashe.keySet()) {
      System.out.println(key);
      keyArray[keyArryNum] = (String) key;
      keyArryNum++;
    }
    System.out.println("return key name : " + keyArray[num]);

    return (K) keyArray[num];

  }

  public LruCache<K, V> keys () {
    return this;
  }

  public int getSize() {
    return cashe.keySet().size();
  }


}

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
public class seminar6 {

    public static void main(String[] args) {
        // 1.Объявить и инициализировать экземпляр класса HashSet. 
        // 2. Добавить пять элементов в множество. 
        Set<Integer> hs = new HashSet<>();
        hs.addAll(rndmList(5)); 
        System.out.println("hs: " + hs + " size: " + hs.size());
        //3. Отсортировать значения используя итератор 
        Iterator<Integer> it = hs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        //4. Отсортированный результат сохранить в LinkedHashSet.
            Set<Integer> lhs = new LinkedHashSet<>();
            lhs.addAll(hs);
        //5. Создать TreeSet с компаратором. 
        Set<Integer> ts = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        //6. Скопировать содержимое первого множества (HashSet) в TreeSet.
        ts.addAll(hs);
        System.out.println(ts);
    }
}
    

import java.util.AbstractList;

public class EvenList extends AbstractList<Integer> {

    @Override
    public Integer get(int index) {
        if (index < 0){
            throw new IndexOutOfBoundsException("index négatif");
        }
        return index*2;
    }

    @Override
    public int size() {
        return Integer.MAX_VALUE / 2;
    }
}

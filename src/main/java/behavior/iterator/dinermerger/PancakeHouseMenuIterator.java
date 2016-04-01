package behavior.iterator.dinermerger;

import java.util.List;

public class PancakeHouseMenuIterator implements Iterator<MenuItem> {
    List<? extends MenuItem> items;
    int position = 0;

    public PancakeHouseMenuIterator(List<? extends MenuItem> items) {
        this.items = items;
    }

    @Override
    public MenuItem next() {
        return items.get(position++);
    }

    @Override
    public boolean hasNext() {
        return position < items.size();
    }
}

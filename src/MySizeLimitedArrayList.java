import java.util.ArrayList;

/**
 * Created by sachin on 20/9/16.
 */
public class MySizeLimitedArrayList extends ArrayList  {
    @Override
    public boolean add(Object e) {
        if (this.size() < 10) {
            return super.add(e);
        }
        return false;
    }
}

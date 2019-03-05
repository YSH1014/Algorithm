package zhangzhen.Algorithm.Common;

import java.util.Comparator;

public class IntegerComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        try {
            if (o1 instanceof Integer && o2 instanceof Integer) {
                return (Integer)o1 - (Integer)o2;
            } else {
                throw new Exception("type error");
            }
        }catch (Exception e){
            e.printStackTrace();
            return 0;
        }
    }
}

import java.util.ArrayList;

public class acontainsb {
    //    返回所有包含于a数组但不包含于b数组的元素
    public static int[] arraySubtract(int[] array1, int[] array2) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < array1.length; i++) {
            boolean bcontained = false;
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    bcontained = true;
                    break;
                }
            }
            if (!bcontained) {
                list.add(array1[i]);
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;

    }
}

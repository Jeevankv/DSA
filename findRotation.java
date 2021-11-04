import java.util.*;

public class findRotation {
    public static void main(String[] args) {
        int[][] mat = { { 0, 1 }, { 1, 0 } };
        int[][] target = { { 1, 0 }, { 0, 1 } };
        System.out.println(findRotation(mat, target));
    }

    public static boolean findRotation(int[][] mat, int[][] target) {

        for (int i = 0; i < 4; i++) {
            boolean flag = check(mat, target);
            if (flag) {
                return true;
            }
            mat = rotate(mat);
        }
        return false;
    }

    // Rotate Array
    public static int[][] rotate(int[][] t_mat) {
        // Transpose
        for (int i = 0; i < t_mat.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = t_mat[i][j];
                t_mat[i][j] = t_mat[j][i];
                t_mat[j][i] = temp;
            }
        }
        // Reverse Each row
        for (int r = 0; r < t_mat.length; r++) {
            int left = 0, right = t_mat.length - 1;
            while (left < right) {
                int temp = t_mat[r][left];
                t_mat[r][left] = t_mat[r][right];
                t_mat[r][right] = temp;
                left++;
                right--;
            }

        }

        return t_mat;
    }

    // Compare
    public static boolean check(int[][] ch_mat, int[][] target) {
        for (int i = 0; i < target.length; i++) {
            for (int j = 0; j < target.length; j++) {
                if (ch_mat[i][j] != target[i][j])
                    return false;
            }
        }

        return true;

    }
}

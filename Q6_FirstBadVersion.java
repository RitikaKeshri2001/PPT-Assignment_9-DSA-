public class Q6_FirstBadVersion {
    public static boolean isBadVersion(int version) {
        return version >= 4;
    }
    public static int firstBadVersion(int n) {
        int low = 0, high = n, result = n;
        while(low <= high) {
            int mid = low + (high - low)/2;
            if(isBadVersion(mid)) {
                result = mid;
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(firstBadVersion(5));
    }
}

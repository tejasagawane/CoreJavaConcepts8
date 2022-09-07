public class SIngleton {

    private static SIngleton sIngleton;


    private SIngleton() {}

    public static synchronized SIngleton getInstance(){

        if(sIngleton == null) {
            return sIngleton = new SIngleton();
        }
        return sIngleton;
    }
}

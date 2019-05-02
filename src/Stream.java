/**
 * Created by szeru on 2/14/2019
 */

public class Stream {



    private Stream(){}

    private static class SingltonHelper{

        private static Stream getInstance (){
            return new Stream();
        }
    }

    public Stream getInstance(){
        return  SingltonHelper.getInstance();
    }
}

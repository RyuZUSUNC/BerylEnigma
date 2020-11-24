package Controller.TextEdit.TextSeparate;

public class TextEditTextSeparate {
    public static String TextSeparate(String sourceStr,String separateStr,int separateNum){

        StringBuilder sb = new StringBuilder(sourceStr);
        int i = sourceStr.length() / separateNum;
        int j = sourceStr.length() % separateNum;

        if (separateStr.length()<=0)
        {
            separateStr = " ";
        }

        for (int x = (j == 0 ? i - 1 : i); x > 0; x--) {
            sb = sb.insert(x * separateNum,separateStr);
        }

        return sb.toString();
    }
}

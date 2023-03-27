package group.application;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Calculator_Func {

    //constructor
    public Calculator_Func(){

    }

    public static String char_changer(String expression){

        StringBuilder new_expression = new StringBuilder();

        for (int i = 0; i < expression.length(); i++) {

            if (expression.charAt(i) == '×'){
                new_expression.append("*");
            } else if (expression.charAt(i) == '÷') {
                new_expression.append("/");
            }else {
                new_expression.append(expression.charAt(i));
            }
        }
        //String builder型 -> String型 へ変換
        return new_expression.toString();
    }

    //function define
    public static String[] appendStringToArray(String[] array, String str) {
        /*
        配列と文字列を引数とし、文字列を追加(配列の最後に)した新しい配列を戻り値とする。
        */
        String[] newArray = new String[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[array.length] = str;
        return newArray;
    }

    //一つ前を消す
    public static String[] back_delete(String[] array){

        String[] newArray;

        if (array.length <= 0){
            newArray = new String[0];
        } else {
            newArray = new String[array.length - 1];
            for (int i = 0; i < newArray.length; i++) {
                newArray[i] = array[i];
            }
        }
        return newArray;
    }

    public static String Array_conv_str(String[] array){
        /*
        配列を引数とし、繰り返し処理をしてresult変数に文字列として格納し、それを戻り値とする。
         */

        String result = "";

        for (String tmp:array){
            result = result.concat(tmp);
        }
        return result;
    }

    public static int traversal_target(String[] array,String target) {

        for (int i = array.length - 1; i >= 0; i--) { // 配列を最後から探索
            if (array[i].equals(target)) { // 探しているtargetを見つけたら
                return i; // そのequalIndexの次のindexを返す
                //break; // ループを抜ける
            }
        }
        // 見つけられなかったら
        return -1;
    }

}

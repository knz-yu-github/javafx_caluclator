package group.application;

import java.net.URL;
import java.util.*;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import net.objecthunter.exp4j.*;

import static group.application.Calculator_Func.Array_conv_str;
import static group.application.Calculator_Func.char_changer;

public class Calculator_Ctrl {

    String[] formula = new String[0];

    // 修正↓ int[] slice = new int[2]; // 2つの要素を持つint型配列を作成
    int[] slice = {0, 0};      // 初期値として0と0を格納したint型配列sliceを作成

    Text text = new Text();

    @FXML
    void leave_log(String str_formula){

        if (!(str_formula.equals(""))){

            if (log_text.getText() == null){

                log_text.setText("Log not exists...");
            }else{
                log_text.setText(log_text.getText() + str_formula);
                //改行文字を追記
                log_text.setText(log_text.getText() + "\n");
            }
        }
    }

    //部品
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    public Text log_text;

    @FXML
    private TextFlow text_area;

    @FXML
    private Button delete_all;

    @FXML
    private Button delete_one;

    @FXML
    private Button division;

    @FXML
    private Button dot;

    @FXML
    private Button eight;

    @FXML
    private Button equal;

    @FXML
    private Button five;

    @FXML
    private Button four;

    @FXML
    private Button kakezan;

    @FXML
    private Button kakko_left;

    @FXML
    private Button kakko_right;

    @FXML
    private Button minus;

    @FXML
    private Button nine;

    @FXML
    private Button one;

    @FXML
    private Button plus;

    @FXML
    private Button seven;

    @FXML
    private Button six;

    @FXML
    private Button three;

    @FXML
    private Button two;

    @FXML
    private Button zero;
    //クリック処理(記号:0~9+-*/() の入力処理)
    @FXML
    void click_zero(MouseEvent event) {
        formula = Calculator_Func.appendStringToArray(formula, zero.getText());

        System.out.println(Array_conv_str(formula));
        text.setText(Array_conv_str(formula));
        try {
            text_area.getChildren().add(text);
        }catch (Exception e){
            System.out.println("↑+Children: duplicate children added");
        }
    }

    @FXML
    void click_one(MouseEvent event) {
        formula = Calculator_Func.appendStringToArray(formula, one.getText());
        System.out.println(Array_conv_str(formula));
        text.setText(Array_conv_str(formula));
        try {
            text_area.getChildren().add(text);
        }catch (Exception e){
            System.out.println("↑+Children: duplicate children added");
        }
    }

    @FXML
    void click_two(MouseEvent event) {
        formula = Calculator_Func.appendStringToArray(formula, two.getText());
        System.out.println(Array_conv_str(formula));
        text.setText(Array_conv_str(formula));
        try {
            text_area.getChildren().add(text);
        }catch (Exception e){
            System.out.println("↑+Children: duplicate children added");
        }
    }

    @FXML
    void click_three(MouseEvent event) {
        formula = Calculator_Func.appendStringToArray(formula, three.getText());
        System.out.println(Array_conv_str(formula));
        text.setText(Array_conv_str(formula));
        try {
            text_area.getChildren().add(text);
        }catch (Exception e){
            System.out.println("↑+Children: duplicate children added");
        }
    }

    @FXML
    void click_four(MouseEvent event) {
        formula = Calculator_Func.appendStringToArray(formula, four.getText());
        System.out.println(Array_conv_str(formula));
        text.setText(Array_conv_str(formula));
        try {
            text_area.getChildren().add(text);
        }catch (Exception e){
            System.out.println("↑+Children: duplicate children added");
        }
    }

    @FXML
    void click_five(MouseEvent event) {
        formula = Calculator_Func.appendStringToArray(formula, five.getText());
        System.out.println(Array_conv_str(formula));
        text.setText(Array_conv_str(formula));
        try {
            text_area.getChildren().add(text);
        }catch (Exception e){
            System.out.println("↑+Children: duplicate children added");
        }
    }

    @FXML
    void click_six(MouseEvent event) {
        formula = Calculator_Func.appendStringToArray(formula, six.getText());
        System.out.println(Array_conv_str(formula));
        text.setText(Array_conv_str(formula));
        try {
            text_area.getChildren().add(text);
        }catch (Exception e){
            System.out.println("↑+Children: duplicate children added");
        }
    }

    @FXML
    void click_seven(MouseEvent event) {
        formula = Calculator_Func.appendStringToArray(formula, seven.getText());
        System.out.println(Array_conv_str(formula));
        text.setText(Array_conv_str(formula));
        try {
            text_area.getChildren().add(text);
        }catch (Exception e){
            System.out.println("↑+Children: duplicate children added");
        }
    }

    @FXML
    void click_eight(MouseEvent event) {
        formula = Calculator_Func.appendStringToArray(formula, eight.getText());
        System.out.println(Array_conv_str(formula));
        text.setText(Array_conv_str(formula));
        try {
            text_area.getChildren().add(text);
        }catch (Exception e){
            System.out.println("↑+Children: duplicate children added");
        }
    }

    @FXML
    void click_nine(MouseEvent event) {
        formula = Calculator_Func.appendStringToArray(formula, nine.getText());
        System.out.println(Array_conv_str(formula));
        text.setText(Array_conv_str(formula));
        try {
            text_area.getChildren().add(text);
        }catch (Exception e){
            System.out.println("↑+Children: duplicate children added");
        }
    }

    @FXML
    void click_dot(MouseEvent event) {
        formula = Calculator_Func.appendStringToArray(formula, dot.getText());
        System.out.println(Array_conv_str(formula));
        text.setText(Array_conv_str(formula));
        try {
            text_area.getChildren().add(text);
        }catch (Exception e){
            System.out.println("↑+Children: duplicate children added");
        }
    }

    @FXML
    void click_kakko_left(MouseEvent event) {
        formula = Calculator_Func.appendStringToArray(formula, kakko_left.getText());
        System.out.println(Array_conv_str(formula));
        text.setText(Array_conv_str(formula));
        try {
            text_area.getChildren().add(text);
        }catch (Exception e){
            System.out.println("↑+Children: duplicate children added");
        }
    }

    @FXML
    void click_kakko_right(MouseEvent event) {
        formula = Calculator_Func.appendStringToArray(formula, kakko_right.getText());
        System.out.println(Array_conv_str(formula));
        text.setText(Array_conv_str(formula));
        try {
            text_area.getChildren().add(text);
        }catch (Exception e){
            System.out.println("↑+Children: duplicate children added");
        }
    }

    @FXML
    void click_plus(MouseEvent event) {
        formula = Calculator_Func.appendStringToArray(formula, plus.getText());
        System.out.println(Array_conv_str(formula));
        text.setText(Array_conv_str(formula));
        try {
            text_area.getChildren().add(text);
        }catch (Exception e){
            System.out.println("↑+Children: duplicate children added");
        }
    }

    @FXML
    void click_minus(MouseEvent event) {
        formula = Calculator_Func.appendStringToArray(formula, minus.getText());
        System.out.println(Array_conv_str(formula));
        text.setText(Array_conv_str(formula));
        try {
            text_area.getChildren().add(text);
        }catch (Exception e){
            System.out.println("↑+Children: duplicate children added");
        }
    }

    @FXML
    void click_kakezan(MouseEvent event) {
        formula = Calculator_Func.appendStringToArray(formula, kakezan.getText());
        System.out.println(Array_conv_str(formula));
        text.setText(Array_conv_str(formula));
        try {
            text_area.getChildren().add(text);
        }catch (Exception e){
            System.out.println("↑+Children: duplicate children added");
        }
    }

    @FXML
    void click_division(MouseEvent event) {
        formula = Calculator_Func.appendStringToArray(formula, division.getText());
        System.out.println(Array_conv_str(formula));
        text.setText(Array_conv_str(formula));
        try {
            text_area.getChildren().add(text);
        }catch (Exception e){
            System.out.println("↑+Children: duplicate children added");
        }
    }

    //textareaのテキストを全てリセット、削除処理
    @FXML
    void click_delete_all(MouseEvent event) {
        //TextAreaの内容をログとして記録
        leave_log(Array_conv_str(formula));
        formula = new String[0]; //リセット
        //System.out.println(Array_conv_str(formula));
        text.setText(Array_conv_str(formula));
        try {
            text_area.getChildren().add(text);
        }catch (Exception e){
            System.out.println("↑+Children: duplicate children added");
        }
    }

    //一つ前の文字を削除する処理 windowsで言うとbackspace処理
    @FXML
    void click_delete_one(MouseEvent event) {
        formula = Calculator_Func.back_delete(formula);
        System.out.println(Array_conv_str(formula));
        text.setText(Array_conv_str(formula));
        try {
            text_area.getChildren().add(text);
        }catch (Exception e){
            System.out.println("↑+Children: duplicate children added");
        }
    }

    //イコールを押した時の処理、計算結果を表示し、イコール前の数式は無効にする
    //履歴のログに追記する処理
    @FXML
    void click_equal(MouseEvent event) {

        //equalが押される前の処理

        //formula配列から、必要な数式を取り出す
        //(現在の状態)25+25=50+50=100+100 (=)←equalは含まない
        //末尾から探して最初のequal記号を見つける for走査で実装
        //範囲を指定して今回計算したい数式として取り出す
        //(必要な数式を取得)100+100

        slice[0] = Calculator_Func.traversal_target(formula,"=");

        slice[1] = formula.length; //これで計算したい配列部分の最初と最後のindexを取得できました
        //実際に数式を取り出し、expression変数へ代入します
        String[] array_expression = Arrays.copyOfRange(formula, slice[0]+1, slice[1]);
        String expression = Array_conv_str(array_expression);

        System.out.println(expression);

        //数式(expression)変数の掛け算割り算記号(×,÷)を(*,/)に変換し変数に再代入
        expression = char_changer(expression);

        //System.out.println(expression);

        //数式にequalを追加する処理(処理前に上記処理を行う)
        formula = Calculator_Func.appendStringToArray(formula, equal.getText());
        System.out.println(Array_conv_str(formula));
        text.setText(Array_conv_str(formula));
        try {
            text_area.getChildren().add(text);
        }catch (Exception e){
            System.out.println("↑+Children: duplicate children added");
        }

        System.out.println("clicked equal");

        try {
            System.out.println("correct answer");
            System.out.println(expression);
            //exp4j計算結果をresultへ
            double result = new ExpressionBuilder(expression)
                    .build()
                    .evaluate();
            //★冗長コードになりますが、ボタン入力では1文字ずつ配列に追加するのに対し、
            // 結果のresultは一文字以上の文字を一つの配列n番目に追加することになるので、
            //一文字ずつ処理させます。前消ボタンで配列末尾を消す際、一文字ずつ消すため。

            String str_result = Double.toString(result);  //戻り値はdoubleなのでStringに変換
            System.out.println(str_result);

            //一文字ずつ配列に追加
            for (int i = 0;i < str_result.length();i++){
                if(str_result.charAt(i) == '.' && str_result.charAt(i+1) == '0'){
                    //小数点第一位が0の場合、小数点以下を切り捨て
                    break;
                }
                System.out.println(str_result.charAt(i));
                //charAtで指定し、一文字ずつ追加
                formula = Calculator_Func.appendStringToArray(formula, String.valueOf(str_result.charAt(i)));
            }

            text.setText(Array_conv_str(formula));

        } catch (Exception ex) {
            System.out.println("error answer---");
            System.out.println(ex.getMessage());
            System.out.println("---");

            //★上記に対して、こちらはERRORの文字列を配列末尾に追加するので、前消の処理は、ERRORの文字列全てが一度で消えます。
            formula = Calculator_Func.appendStringToArray(formula, "ERROR");
            text.setText(Array_conv_str(formula));
        }
    }

    @FXML
    void initialize() {
        assert delete_all != null : "fx:id=\"delete_all\" was not injected: check your FXML file 'calc.fxml'.";
        assert delete_one != null : "fx:id=\"delete_one\" was not injected: check your FXML file 'calc.fxml'.";
        assert division != null : "fx:id=\"division\" was not injected: check your FXML file 'calc.fxml'.";
        assert dot != null : "fx:id=\"dot\" was not injected: check your FXML file 'calc.fxml'.";
        assert eight != null : "fx:id=\"eight\" was not injected: check your FXML file 'calc.fxml'.";
        assert equal != null : "fx:id=\"equal\" was not injected: check your FXML file 'calc.fxml'.";
        assert five != null : "fx:id=\"five\" was not injected: check your FXML file 'calc.fxml'.";
        assert four != null : "fx:id=\"four\" was not injected: check your FXML file 'calc.fxml'.";
        assert kakezan != null : "fx:id=\"kakezan\" was not injected: check your FXML file 'calc.fxml'.";
        assert kakko_left != null : "fx:id=\"kakko_left\" was not injected: check your FXML file 'calc.fxml'.";
        assert kakko_right != null : "fx:id=\"kakko_right\" was not injected: check your FXML file 'calc.fxml'.";
        assert minus != null : "fx:id=\"minus\" was not injected: check your FXML file 'calc.fxml'.";
        assert nine != null : "fx:id=\"nine\" was not injected: check your FXML file 'calc.fxml'.";
        assert one != null : "fx:id=\"one\" was not injected: check your FXML file 'calc.fxml'.";
        assert plus != null : "fx:id=\"plus\" was not injected: check your FXML file 'calc.fxml'.";
        assert seven != null : "fx:id=\"seven\" was not injected: check your FXML file 'calc.fxml'.";
        assert six != null : "fx:id=\"six\" was not injected: check your FXML file 'calc.fxml'.";
        assert three != null : "fx:id=\"three\" was not injected: check your FXML file 'calc.fxml'.";
        assert two != null : "fx:id=\"two\" was not injected: check your FXML file 'calc.fxml'.";
        assert zero != null : "fx:id=\"zero\" was not injected: check your FXML file 'calc.fxml'.";

    }

}

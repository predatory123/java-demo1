package com.qa.xuexiaoxiao.sixteen;

import javafx.application.Application;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.StringConverter;
import javafx.util.converter.DoubleStringConverter;

import javax.naming.Binding;
import javax.script.Bindings;

/**
 * 使用JavaFX框架画图
 */

public class JavaFXTestCase extends Application {
    public static void main(String[] args) {
        launch(args);
        JavaFXTestCase jst = new JavaFXTestCase();
        jst.initialisiereKomponenten();
        jst.registriereListener();

    }
    private Label labelHoehe;
    private Label labelBreite;
    private Label labelTiefe;
    private Label labelErgebnis;
    private TextField textHoehe;
    private TextField textBreite;
    private TextField textTiefe;
    private TextField textErgebnis;
    private Button scfBerechnen;
    private Button scfLeeren;

    @Override
    public void start(Stage buehne) throws Exception {
        buehne.setTitle("Schuhkarton Volumenberechner");
        this.initialisiereKomponenten();
        this.ordneKomponenten(buehne);
        buehne.show();
    }

    private void initialisiereKomponenten() {
        this.labelHoehe = new Label("Hoehe:");
        this.textHoehe = new TextField();
        this.labelBreite = new Label("Breite:");
        this.textBreite = new TextField();
        this.labelTiefe = new Label("Tiefe:");
        this.textTiefe = new TextField();
        this.labelErgebnis = new Label("Ergebnis:");
        this.textErgebnis = new TextField();
        this.textErgebnis.setEditable(false);
        this.textErgebnis.setDisable(true);
        this.scfBerechnen = new Button("Berechnen");
        this.scfLeeren = new Button("Leeren");
    }

    private void ordneKomponenten(Stage buehne) {
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25,25,25,25));
        grid.add(this.labelHoehe, 0 ,1);
        grid.add(this.textHoehe, 1,1,2,1);
        grid.add(new Label("cm"),3,1);
        grid.add(this.labelBreite, 0 ,2);
        grid.add(this.textBreite, 1,2,2,1);
        grid.add(new Label("cm"),3,2);
        grid.add(this.labelTiefe, 0 ,3);
        grid.add(this.textTiefe, 1,3,2,1);
        grid.add(new Label("cm"),3,3);
        grid.add(this.labelErgebnis, 0 ,4);
        grid.add(this.textErgebnis, 1,4,2,1);
        grid.add(new Label("cm³"),3,4);
        grid.add(this.scfBerechnen,1,5);
        grid.add(this.scfLeeren,2,5);
//        buehne.setScene(new Scene(grid,300,250));
        //  设置css属性
        Scene scene = new Scene(grid,300,250);
        scene.getStylesheets().add("D:\\worksapce\\java_projects\\booktest\\src\\com\\qa\\xuexiaoxiao\\sixteen\\styles.css");
        buehne.setScene(scene);
    }

    // 设置事件监听器
    private void registriereListener() {
        this.scfBerechnen.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                aktualisiereErgebnis();
            }
        });
        this.scfLeeren.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                aktualisiereErgebnis();
            }
        });
    }

    // 创建滑块验证
    private Slider erstelleSchieberegler(int minimum, int maximum) {
        Slider schieberegler = new Slider();
        schieberegler.setMin(minimum);
        schieberegler.setMax(maximum);
        schieberegler.setShowTickLabels(true);
        schieberegler.setShowTickMarks(true);
        schieberegler.setMinorTickCount(1);
        schieberegler.setMajorTickUnit(2);
        return schieberegler;
    }

    private void aktualisiereErgebnis() {
        Integer hoehe = Integer.parseInt(this.textHoehe.getText());
        Integer breite = Integer.parseInt(this.textBreite.getText());
        Integer tiefe = Integer.parseInt(this.textTiefe.getText());
        Integer ergebnis = hoehe * breite * tiefe;
        this.textErgebnis.setText(ergebnis.toString());

//        StringConverter<? extends Number> converter = new DoubleStringConverter();
//        Bindings.bindBidirectional(
//            this.textErgebnis.textProperty(),
//            this.schiebereglerBreite.visibleProperty(),./
//                (StringConverter<Number> converter)
//        );
    }

    // 属性捆绑
    private void test() {
        IntegerProperty gehaltBossingen = new SimpleIntegerProperty(20000);
        IntegerProperty gehaltSchroedinger = new SimpleIntegerProperty(2000);
        System.out.println(gehaltBossingen.getValue()); // 输出20000
        System.out.println(gehaltSchroedinger.getValue());  // 输出2000
        gehaltSchroedinger.bindBidirectional(gehaltBossingen); // 是一个值从另一个值中获取
        System.out.println(gehaltBossingen.getValue()); // 输出20000
        System.out.println(gehaltSchroedinger.getValue());  // 输出20000
        gehaltSchroedinger.set(2005);
        System.out.println(gehaltBossingen.getValue());  // 输出2005
        System.out.println(gehaltSchroedinger.getValue());  // 输出2005
    }

}

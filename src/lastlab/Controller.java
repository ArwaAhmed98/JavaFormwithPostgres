/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lastlab;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author elari
 */
public class Controller extends Application {
    static ResultSet rs;
    
     int index=0;
    
    
    @Override
    public void start(Stage primaryStage) {
       GridPane grid = new GridPane();
       grid.setHgap(10);
       grid.setVgap(10);
       grid.setPadding(new Insets(25, 25, 25, 25));
       Label header = new Label("Person Details");
      grid.add(header, 0,0,2,1);
       Label id=new Label("ID");
       grid.add(id, 0,1);
       TextField Id=new TextField();
       grid.add(Id, 1,1);
       Label first_name=new Label("First Name");
       grid.add(first_name, 0, 2);
       TextField first=new TextField();
       grid.add(first, 1, 2);
       Label middle_name=new Label("Nick Name");
       grid.add(middle_name, 0, 3);
       TextField middle=new TextField();
       grid.add(middle, 1, 3);
       Label last_name=new Label("Address");
       grid.add(last_name, 0, 4);
       TextField last=new TextField();
       grid.add(last, 1, 4);
       Label email=new Label("Homephone");
       grid.add(email, 0, 5);
       TextField Email=new TextField();
       grid.add(Email, 1, 5);
       Label phone=new Label("email");
       grid.add(phone, 0, 6);
       TextField Phone=new TextField();
       grid.add(Phone, 1, 6);
       Button neww=new Button("New");
       Button update=new Button("Update");
       Button delete=new Button("Delete");
       Button firstt=new Button("First");
       firstt.setOnAction(e->{
        try {
            // System.out.println(vString.firstElement());
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            rs.first();
            Id.setText(rs.getString(1));
            first.setText(rs.getString(2));
            middle.setText(rs.getString(3));
            last.setText(rs.getString(4));
            Email.setText(rs.getString(5));
            Phone.setText(rs.getString(6));
            
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
       });
       Button prev=new Button("Prev");
       prev.setOnAction(e->{
               try {   
            if(!rs.isFirst()){
            rs.previous();
            Id.setText(rs.getString(1));
            first.setText(rs.getString(2));
            middle.setText(rs.getString(3));
            last.setText(rs.getString(4));
            Email.setText(rs.getString(5));
            Phone.setText(rs.getString(6));

             //ConnectDB().close();
            }
            else if(rs.isFirst()){
            rs.last();
            Id.setText(rs.getString(1));
            first.setText(rs.getString(2));
            middle.setText(rs.getString(3));
            last.setText(rs.getString(4));
            Email.setText(rs.getString(5));
            Phone.setText(rs.getString(6));

            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
           
       });
       Button next=new Button("Next");
       next.setOnAction(e->{
             try { 
            if(!rs.isLast()){
                rs.next();
            Id.setText(rs.getString(1));
            first.setText(rs.getString(2));
            middle.setText(rs.getString(3));
            last.setText(rs.getString(4));
            Email.setText(rs.getString(5));
            Phone.setText(rs.getString(6));
            }
            else if(rs.isLast()){
             rs.first(); 
            Id.setText(rs.getString(1));
            first.setText(rs.getString(2));
            middle.setText(rs.getString(3));
            last.setText(rs.getString(4));
            Email.setText(rs.getString(5));
            Phone.setText(rs.getString(6));
            }
            }catch (SQLException ex) {
           System.out.println(ex.getMessage());
        }
       });
       Button lastt=new Button("Last");
       lastt.setOnAction(e->{
           try {
               while(rs.next()){
                    Id.setText(rs.getString(1));
                    first.setText(rs.getString(2));
                    middle.setText(rs.getString(3));
                    last.setText(rs.getString(4));
                      Email.setText(rs.getString(5));
                     Phone.setText(rs.getString(6));
                  
               }
           } catch (SQLException ex) {
               Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
           }
        
    });
       FlowPane f=new FlowPane(neww,update,delete,firstt,prev,next,lastt);
       grid.add(f,1, 7);

       Scene scene = new Scene(grid, 500, 350);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
        /**************************/
   
         
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         DB d=new DB();
       // d.connect();
        rs=d.connect();
        
        launch(args);
       
       
         
         
    
         
    }
    
}

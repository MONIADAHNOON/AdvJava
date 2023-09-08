import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;  
import javafx.stage.Stage;


public class Project extends Application{
	double n1,n2,resl,x=10,y=30,counter=0;
	
	@Override
	public void start(Stage ps){
		ps.setTitle("Rectangle Calculator");
		Label num1=new Label("Number 1 ");
		Label num2=new Label("Number 2 ");
		Label plus=new Label(" + ");
		Label res=new Label(" resulte = ");
		Label Tres=new Label();
		
		TextField Tnum1=new TextField();
		TextField Tnum2=new TextField();
		
		
		Button b1=new Button("Calculate");
		
		
		GridPane gp=new GridPane();
		gp.add(num1,0,0);
		gp.add(plus,0,1);
		gp.add(num2,0,2);
		gp.add(Tnum1,2,0);
		gp.add(Tnum2,2,2);
		gp.add(res,4,1);
		gp.add(Tres,5,1);
		gp.add(b1,3,3);
		gp.setAlignment(Pos.CENTER);
		
		
	    
		Scene sc1=new Scene(gp,600,200);
		ps.setScene(sc1);
		ps.show();
		
    
        Pane p1=new Pane();
		Pane p2=new Pane();
		Pane p3=new Pane(p1,p2);
        
		ScrollPane scroll = new ScrollPane();
	    scroll.setPrefSize(600, 200);
	    scroll.setContent(p3);
	    Group gr = new Group();
	    gr.getChildren().addAll(scroll);
	    
		Scene sc2=new Scene(gr,600,200);
		Stage stg=new Stage();
		stg.setTitle("Rectangles");
		stg.setScene(sc2);
		stg.setX(333);
		stg.setY(400);
		
		
		
		
		b1.setOnAction(e -> {
			
			n1=Double.parseDouble(Tnum1.getText());
			n2=Double.parseDouble(Tnum2.getText());
			resl=n1+n2;
			counter++;
			for(int i=0;i<resl;i++)
			{
			Tres.setText(""+resl);
			Rectangle rc=new Rectangle(x,y,70,50);
			stg.show();
			
			
			if(resl%2==0) {
			rc.setFill(Color.RED);
			p1.getChildren().add(rc);	
			x+=100;
			if(i%5==0&&!(i==0))
			{y+=60;
			x-=600;}}
			
			
			else {
			rc.setFill(Color.BLUE);
			p2.getChildren().add(rc);
			x+=100;
			if(i%5==0&&!(i==0))
			{y+=60;
			x-=600;}}
			
			}}); 
		
		
	}

	public static void main(String[] args) {
		launch(args);
		
	}

	
}

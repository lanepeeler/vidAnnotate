package application;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.NamedArg;
import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ReadOnlyObjectProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Rectangle2D;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import marvin.io.*;

public class MainController implements Initializable {
	@FXML private MediaView mv1;
	@FXML private MediaView mv2;
	@FXML private MediaView mv3;
	@FXML private MediaView mv4;
	@FXML private MediaView mv5;
	@FXML private MediaView mv6;
	@FXML private MediaView mv7;
	@FXML private MediaView mv8;
	@FXML private MediaPlayer mp1;
	@FXML private MediaPlayer mp2;
	@FXML private MediaPlayer mp3;
	@FXML private MediaPlayer mp4;
	@FXML private MediaPlayer mp5;
	@FXML private MediaPlayer mp6;
	@FXML private MediaPlayer mp7;
	@FXML private MediaPlayer mp8;
	@FXML private Button b1;
	@FXML private Button b2;
//	private MediaPlayer mp;
//	private Media me;
//	private Media me2;
	
//    public MainController(@NamedArg("mediaURL") String mediaURL) throws IOException {
//        FXMLLoader loader = new FXMLLoader(getClass().getResource("Main2.fxml"));
//        loader.setRoot(this);
//        loader.setController(this);
//        loader.getNamespace().put("mediaURL", mediaURL);
//        loader.load();
//    }
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
//		String path = new File("/Users/FrankenMac/Documents/IMG_3226.mp4").getAbsolutePath(); // path to video
//		String path2 = new File("/Users/FrankenMac/Documents/IMG_3227.mp4").getAbsolutePath(); // path to video
		
//		System.out.println(location);
		
//		me = new Media(location.toString());
//		me = new Media(new File(path).toURI().toString());
//		me2 = new Media(new File(path2).toURI().toString());
		
//		mp = new MediaPlayer(me);
//		mp2 = new MediaPlayer(me2);
		
//		mv3.setMediaPlayer(mp);
//		mv.setViewport(new Rectangle2D(0, 0, 480, 540));
//		mv4.setMediaPlayer(mp);
//		mv2.setViewport(new Rectangle2D(480, 0, 480, 540));

		
//		mp.setAutoPlay(true); // plays the video
		
//		DoubleProperty width = mv.fitWidthProperty();
//		DoubleProperty height = mv.fitHeightProperty();
//		width.bind(Bindings.selectDouble(mv.sceneProperty(), "width"));
//		height.bind(Bindings.selectDouble(mv.sceneProperty(), "height"));
//		
//		DoubleProperty width2 = mv2.fitWidthProperty();
//		DoubleProperty height2 = mv2.fitHeightProperty();
//		width2.bind(Bindings.selectDouble(mv2.sceneProperty(), "width2"));
//		height2.bind(Bindings.selectDouble(mv2.sceneProperty(), "height2"));

//		b1.visibleProperty().bind(mp.statusProperty().isNotEqualTo(MediaPlayer.Status.PLAYING));
//        b2.visibleProperty().bind(mp.statusProperty().isEqualTo(MediaPlayer.Status.PLAYING));
		
	}
	
	@FXML
	private void play(ActionEvent event) {
		mp1.play();
        mp2.play();
        mp3.play();
        mp4.play();
        mp5.play();
        mp6.play();
        mp7.play();
        mp8.play();
    }
	
	@FXML
	private void pause(ActionEvent event) {
		mp1.pause();
		mp2.pause();
		mp3.pause();
		mp4.pause();
		mp5.pause();
		mp6.pause();
		mp7.pause();
		mp8.pause();
    }

//    public ReadOnlyObjectProperty<MediaPlayer.Status> statusProperty() {
//        return mp.statusProperty();
//    }
//
//    public final MediaPlayer.Status getStatus() {
//        return statusProperty().get();
//    }


}

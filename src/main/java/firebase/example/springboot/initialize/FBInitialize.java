package firebase.example.springboot.initialize;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.FileInputStream;

/**
 * @author NyiNyiZin
 * @date Jul 16, 2020
 * @time 3:19:40 PM
 */
@Service
public class FBInitialize {

	@PostConstruct
	public void initialize() {
		try {

			FileInputStream serviceAccount = new FileInputStream("/home/nyinyizin/Downloads/serviceAccountKey.json");

			FirebaseOptions options = new FirebaseOptions.Builder()
					.setCredentials(GoogleCredentials.fromStream(serviceAccount))
					.setDatabaseUrl("https://fir-db-for-spring-boot-c7a43.firebaseio.com").build();

			FirebaseApp.initializeApp(options);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

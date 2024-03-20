package ua.edu.nung.pz.model;


import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Firebase {
    private String firebaseConfigPath;
    private static Firebase firebase = new Firebase();
    private Firebase() {
    }

    public static Firebase getInstance() {
        return firebase;
    }

    public void init() {
        FileInputStream refreshToken = null;
        try {
            refreshToken = new FileInputStream(firebaseConfigPath);

            FirebaseOptions options = FirebaseOptions.builder()
                    .setCredentials(GoogleCredentials.fromStream(refreshToken))
                    .setDatabaseUrl("https://greenshop-519e0-default-rtdb.europe-west1.firebasedatabase.app/")
                    .build();

            FirebaseApp.initializeApp(options);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getFirebaseConfigPath() {
        return firebaseConfigPath;
    }

    public void setFirebaseConfigPath(String firebaseConfigPath) {
        this.firebaseConfigPath = firebaseConfigPath;
    }
}

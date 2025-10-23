package com.directi.training.dip.exercise.solution;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.net.URL;

public class NetworkInputSource implements InputSource {
    private String host;
    private String path;

    public NetworkInputSource(String host, String path) {
        this.host = host;
        this.path = path;
    }

    @Override
    public String read() throws IOException {
        URL url = new URL("http", host, path);
        InputStream in = url.openStream();
        InputStreamReader reader = new InputStreamReader(in);
        StringBuilder sb = new StringBuilder();
        int c = reader.read();
        while (c != -1) {
            sb.append((char)c);
            c = reader.read();
        }
        reader.close();
        return sb.toString();
    }
}

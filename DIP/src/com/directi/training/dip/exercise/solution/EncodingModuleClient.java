package com.directi.training.dip.exercise.solution;

import java.io.IOException;

import com.directi.training.dip.exercise.MyDatabase;

public class EncodingModuleClient {
    public static void main(String[] args) throws IOException {
        EncodingModule module = new EncodingModule();

  
        InputSource fileSource = new FileInputSource("DIP/src/com/directi/training/dip/exercise/beforeEncryption.txt");
        OutputTarget fileTarget = new FileOutputTarget("DIP/src/com/directi/training/dip/exercise/afterEncryption.txt");
        module.encode(fileSource, fileTarget);

        InputSource networkSource = new NetworkInputSource("myfirstappwith.appspot.com", "/index.html");
        OutputTarget dbTarget = new DatabaseOutputTarget(new MyDatabase());
        module.encode(networkSource, dbTarget);
    }
}
package homework9;

import static java.lang.Integer.parseInt;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class FileLoggerConfigurationLoader {

  public static FileLoggerConfiguration load(File file) {
    if (file.length() == 0) {
      return new FileLoggerConfiguration(
          null,
          null,
          -1,
          null);
    }
    Properties config = new Properties();
    try (FileReader reader = new FileReader(file)) {
      config.load(reader);

    } catch (IOException e) {
      throw new RuntimeException(e);
    }
    return new FileLoggerConfiguration(
        config.getProperty("FILE"),
        LoggingLevel.valueOf(config.getProperty("LEVEL")),
        parseInt(config.getProperty("SIZE")),
        config.getProperty("FORMAT"));

  }
}


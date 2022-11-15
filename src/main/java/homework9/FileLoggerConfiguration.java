package homework9;

import java.io.File;
import java.time.LocalDate;

public class FileLoggerConfiguration {

  private File file;
  private LoggingLevel level;
  private int size;
  private String format;

  public FileLoggerConfiguration(String path, LoggingLevel level, int size, String format) {
    this.file = new File(path, "log_" + level + "_" + LocalDate.now() + ".txt");
    this.level = level;
    this.size = size;
    this.format = format;
  }

  public File getFile() {
    return file;
  }

  public void setFile(File file) {
    this.file = file;
  }

  public LoggingLevel getLevel() {
    return level;
  }

  public int getSize() {
    return size;
  }

  public String getFormat() {
    return format;
  }
}